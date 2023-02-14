package fr.ot.ressource;

import fr.ot.service.PersonneClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/personnes")
@Tag(name = "Personnes")
@Produces(MediaType.APPLICATION_JSON)
public class PersonneRessource {

    @Inject
    @RestClient
    PersonneClient personneClient;

    @GET
    @Path("/")
    public Response getAllPersonnes(){
        return Response.ok(personneClient.getAllPersonnes().getEntity()).build();
    }
}
