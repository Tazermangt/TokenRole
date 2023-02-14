package fr.ot.ressource;

import fr.ot.entities.ClassificationEntity;
import fr.ot.hateoas.HateOas;
import fr.ot.service.ClassificationClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/classifications")
@Tag(name = "Classifications")
@Produces(MediaType.APPLICATION_JSON)
public class ClassificationRessource {

    @Inject
    @RestClient
    ClassificationClient classificationClient;

    @GET
    @Path("/")
    public Response getAllClassifications(){
        List<ClassificationEntity> classifications = classificationClient.getAllClassifications().readEntity(List.class);
        if(!classifications.isEmpty()){
            return Response.ok(classifications).build();
        }else{
            return Response.noContent().build();
        }
    }

    @GET
    @Path("like/{classification}")
    public Response getLikeClassifications(@Context UriInfo uriInfo, @PathParam("classification") String classification){
        List<ClassificationEntity> classifications = classificationClient.getLikeClassifications(uriInfo, classification).readEntity(List.class);
        if (!classifications.isEmpty()) {
            return Response.ok(classifications).build();
        } else {
            return Response.noContent().build();
        }
    }
}
