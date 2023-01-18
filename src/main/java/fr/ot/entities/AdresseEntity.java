package fr.ot.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder({"idAdresse", "adresse", "idVille"})
public class AdresseEntity{

    private int idAdresse;
    private String adresse;
    private int idVille;
}
