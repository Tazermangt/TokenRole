package fr.ot.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@RegisterRestClient
@Path("/")
public interface PersonneClient {
    @GET
    @Path("/")
    Response getAllPersonnes();
}
