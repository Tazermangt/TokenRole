package fr.ot;

import fr.ot.service.EcoleClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/crkf")
@Tag(name = "CRKF")
@Produces(MediaType.APPLICATION_JSON)
public class EcoleRessource {

    @Inject
    @RestClient
    EcoleClient ecoleClient;

    @GET
    @Path("/ecoles")
    public Response getAllEcoles(){
        return Response.ok(ecoleClient.getAllEcoles().getEntity()).build();
    }
}
