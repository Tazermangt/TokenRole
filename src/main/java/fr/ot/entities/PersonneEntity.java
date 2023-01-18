package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idPersonne", "nom", "prenom", "vehiculeCv", "idAdresse", "idEcole"})
public class PersonneEntity extends HateOas {

    private int idPersonne;
    private String nom;
    private String prenom;
    private int vehiculeCv;
    private int idAdresse;
    private int idEcole;
}
