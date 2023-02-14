package fr.ot.ressource;

import fr.ot.service.InstrumentClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/instruments")
@Tag(name = "Instruments")
@Produces(MediaType.APPLICATION_JSON)
public class InstrumentRessource {

    @Inject
    @RestClient
    InstrumentClient instrumentClient;

    @GET
    @Path("/")
    public Response getAllInstruments(){
        return Response.ok(instrumentClient.getAllInstruments().getEntity()).build();
    }
}
