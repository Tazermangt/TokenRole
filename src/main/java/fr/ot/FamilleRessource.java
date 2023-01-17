package fr.ot;

import fr.ot.service.FamilleClient;
import org.eclipse.microprofile.openapi.annotations.Operation;
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
public class FamilleRessource {

    @Inject
    @RestClient
    FamilleClient familleClient;

    @Operation(summary = "", description = "")
    @GET
    @Path("/familles")
    public Response getAllFamilles() {
        return Response.ok(familleClient.getAllFamilles().getEntity()).build();
    }
}
