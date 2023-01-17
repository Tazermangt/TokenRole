package fr.ot;

import fr.ot.service.ClassificationClient;
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
public class ClassificationRessource {

    @Inject
    @RestClient
    ClassificationClient classificationClient;

    @GET
    @Path("/classifications")
    public Response getAllClassifications(){
        return Response.ok(classificationClient.getAllClassifications().getEntity()).build();
    }
}
