package fr.ot.service;

import fr.ot.entities.InstrumentEntity;
import fr.ot.entities.PersonneEntity;
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
public interface PersonneClient {
    @GET
    @Path("/")
    Response getAllPersonnes();

    @GET
    @Path("{id}")
    Response getById(@PathParam("id") Integer id, @Context UriInfo uriInfo);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(PersonneEntity personne, @Context UriInfo uriInfo);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(PersonneEntity personne, @Context UriInfo uriInfo);

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") Integer id, @Context UriInfo uriInfo);
}
