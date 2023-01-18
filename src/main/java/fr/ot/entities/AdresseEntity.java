package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;




@Data
@JsonPropertyOrder({"idAdresse", "adresse", "idVille"})
public class AdresseEntity extends HateOas {

    private int idAdresse;
    private String adresse;
    private int idVille;
}
