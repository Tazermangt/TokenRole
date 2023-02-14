package fr.ot.ressource;

import fr.ot.service.VilleClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/villes")
@Tag(name = "Villes")
@Produces(MediaType.APPLICATION_JSON)
public class VilleRessource {

    @Inject
    @RestClient
    VilleClient villeClient;

    @GET
    @Path("/")
    public Response getAllVilles(){
        return Response.ok(villeClient.getAllVilles().getEntity()).build();
    }
}
