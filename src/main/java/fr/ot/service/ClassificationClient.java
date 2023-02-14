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
@Produces(MediaType.APPLICATION_JSON)
public interface ClassificationClient {
    @GET
    @Path("/")
    Response getAllClassifications();

    @GET
    @Path("like/{classification}")
    Response getLikeClassifications(@Context UriInfo uriInfo, @PathParam("classification") String classification);
}
