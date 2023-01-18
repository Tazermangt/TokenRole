package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"idClassification", "classification"})
public class ClassificationEntity {
    private int idClassification;

    private String classification;

}
