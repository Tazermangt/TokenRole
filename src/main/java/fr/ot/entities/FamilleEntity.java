package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;
@Data
@JsonPropertyOrder({"idFamille", "famille", "idClassification"})
public class FamilleEntity extends HateOas {

    private int idFamille;
    private String famille;
    private int idClassification;
}
