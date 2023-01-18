package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idVille", "ville", "longitude", "latitude", "idDepartement"})
public class VilleEntity extends HateOas {

    private int idVille;
    private String ville;
    private double longitude;
    private double latitude;
    private int idDepartement;
}
