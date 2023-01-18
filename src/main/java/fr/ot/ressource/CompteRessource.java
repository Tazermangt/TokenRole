package fr.ot.ressource;

import fr.ot.entities.CompteEntity;
import fr.ot.repository.CompteRepository;
import fr.ot.security.Token;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.security.GeneralSecurityException;

@Tag(name = "Compte")
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
public class CompteRessource {

    @Inject
    JsonWebToken jwt;

    @Inject
    CompteRepository compteRepository;

    @Path("/login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(CompteEntity compte) throws GeneralSecurityException, IOException {
        return Response.ok(Token.generateToken(compte)).build();
    }

    @GET
    @Path("/test")
    @RolesAllowed({"Admin"})
    public Response test(){
        return Response.ok(compteRepository.listAll()).build();
    }

}
