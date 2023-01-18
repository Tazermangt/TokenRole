package fr.ot.service;

import fr.ot.entities.CycleEntity;
import fr.ot.entities.EcoleEntity;
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
@Produces(MediaType.APPLICATION_JSON)
public interface EcoleClient {
    @GET
    @Path("/")
    Response getAllEcoles();

    @GET
    @Path("{id}")
    Response getById(@PathParam("id") Integer id, @Context UriInfo uriInfo);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(EcoleEntity ecole, @Context UriInfo uriInfo);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(EcoleEntity ecole, @Context UriInfo uriInfo);

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Integer id, @Context UriInfo uriInfo);
}
