package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idCompte", "email", "password"})
public class CompteEntity extends HateOas {
    private int idCompte;
    private String email;
    private String password;
}
