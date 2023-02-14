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
        List<ClassificationEntity> classifications = (List<ClassificationEntity>) classificationClient.getAllClassifications().getEntity();
        if(!classifications.isEmpty()){
            return Response.ok(classifications).build();
        }else{
            return Response.noContent().build();
        }
    }
    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") Integer id, @Context UriInfo uriInfo) {
        ClassificationEntity classification = (ClassificationEntity) classificationClient.getById(id, uriInfo).getEntity();
        if (classification != null) {
            return Response.ok(classification).build();
        } else {
            return Response.noContent().build();
        }
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(ClassificationEntity classification, @Context UriInfo uriInfo) {
        HateOas hateOas = (HateOas) classificationClient.create(classification, uriInfo).getEntity();
        if (hateOas != null) {
            return Response.ok(hateOas).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(ClassificationEntity classification, @Context UriInfo uriInfo) {
        HateOas hateOas = (HateOas) classificationClient.update(classification, uriInfo).getEntity();
        if (hateOas != null) {
            return Response.ok(hateOas).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Integer id, @Context UriInfo uriInfo) {
        HateOas hateOas = (HateOas) classificationClient.delete(id , uriInfo).getEntity();
        if (hateOas != null) {
            return Response.ok(hateOas).build();
        } else {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
