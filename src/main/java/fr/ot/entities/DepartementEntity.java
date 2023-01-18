package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idDepartement", "departement", "numeroDepartement"})
public class DepartementEntity extends HateOas {

    private int idDepartement;
    private String numeroDepartement;
    private String departement;
}
