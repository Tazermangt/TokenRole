package fr.ot.security;

import fr.ot.entities.CompteEntity;
import io.smallrye.jwt.build.Jwt;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.*;


public class Token {

    public static String generateToken(CompteEntity compte) throws GeneralSecurityException, IOException {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        calendar.add(Calendar.MINUTE, 10);
        Date expiration = calendar.getTime();
        String token = "Bearer ";
        token += Jwt.issuer("https://example.com/issuer")
                .upn("mail@mail.com")
                .subject(compte.getEmail())
                .issuedAt(now.toInstant())
                .expiresAt(expiration.toInstant())
                .groups(new HashSet<>(List.of("Admin")))
                .sign();
        return token;
    }
}
