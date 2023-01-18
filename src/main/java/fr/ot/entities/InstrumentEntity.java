package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonPropertyOrder({"idInstrument", "nom"})
public class InstrumentEntity extends HateOas {

    private int idInstrument;
    private String nom;

}
