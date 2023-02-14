package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import java.util.Objects;

@Data
@JsonPropertyOrder({"idClassification", "classification"})
public class ClassificationEntity extends HateOas {
    private int idClassification;

    private String classification;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassificationEntity that = (ClassificationEntity) o;
        return idClassification == that.idClassification && Objects.equals(classification, that.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClassification, classification);
    }

}
