package com.projet.librairy.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author RACHID Abderrahmane
 */
@Getter
@Setter
@NoArgsConstructor
public class Emprunt {
    private Client client;
    private Document document;
    private LocalDate date_emprunt;
    private LocalDate date_retour;

    public Emprunt(Client client, Document document) {
        this.client = client;
        this.document = document;
        this.date_emprunt = LocalDate.now();
        this.date_retour = date_emprunt.plusDays(15);
    }



    @Override
    public String toString() {
        return "Emprunt{" +
                "client=" + client.getNom()+" "+client.getPrenom() +
                "\ndocument=" + document.getTitre() +
                "\ndate_emprunt=" + date_emprunt +
                "\ndate_retour=" + date_retour +
                "\n}";
    }
}
