package fr.ot.ressource;

import fr.ot.service.AdresseClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/adresses")
@Tag(name = "Adresses")
@Produces(MediaType.APPLICATION_JSON)
public class AdresseRessource {

    @Inject
    @RestClient
    AdresseClient adresseClient;

    @GET
    @Path("/")
    public Response getAllAdresses(){
        return Response.ok(adresseClient.getAllAdresses().getEntity()).build();
    }
}
