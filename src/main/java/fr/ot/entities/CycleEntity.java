package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import fr.ot.hateoas.HateOas;
import lombok.Data;


@Data
@JsonPropertyOrder({"idLibelle", "libelle", "cycle"})
public class CycleEntity  extends HateOas {

    private int idLibelle;
    private String libelle;
    private int cycle;
}
