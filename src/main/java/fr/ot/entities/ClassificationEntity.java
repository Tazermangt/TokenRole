package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

@Data
@JsonPropertyOrder({"idClassification", "classification"})
public class ClassificationEntity extends HateOas {
    private int idClassification;

    private String classification;

}
