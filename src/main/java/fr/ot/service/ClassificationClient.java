package fr.ot.service;

import fr.ot.entities.AdresseEntity;
import fr.ot.entities.ClassificationEntity;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@RegisterRestClient
@Path("/")
public interface ClassificationClient {
    @GET
    @Path("/")
    Response getAllClassifications();

    @GET
    @Path("{id}")
    Response getById(@PathParam("id") Integer id, @Context UriInfo uriInfo);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(ClassificationEntity classification, @Context UriInfo uriInfo);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(ClassificationEntity classification, @Context UriInfo uriInfo);

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Integer id, @Context UriInfo uriInfo);
}
