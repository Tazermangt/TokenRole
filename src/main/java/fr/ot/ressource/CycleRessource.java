package fr.ot.ressource;

import fr.ot.service.CycleClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cyles")
@Tag(name = "Cyles")
@Produces(MediaType.APPLICATION_JSON)
public class CycleRessource {

    @Inject
    @RestClient
    CycleClient cycleClient;

    @GET
    @Path("/")
    public Response getAllCycles(){
        return Response.ok(cycleClient.getAllCycles().getEntity()).build();
    }
}
