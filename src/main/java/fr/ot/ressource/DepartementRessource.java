package fr.ot.ressource;

import fr.ot.service.DepartementClient;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/departements")
@Tag(name = "Departements")
@Produces(MediaType.APPLICATION_JSON)
public class DepartementRessource {

    @Inject
    @RestClient
    DepartementClient departementClient;

    @GET
    @Path("/")
    public Response getAllDepartements(){
        return Response.ok(departementClient.getAllDepartements().getEntity()).build();
    }
}
