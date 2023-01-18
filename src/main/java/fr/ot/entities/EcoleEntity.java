package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idEcole", "nom", "idAdresse"})
public class EcoleEntity extends HateOas {

    private int idEcole;
    private String nom;
    private int idAdresse;
}
