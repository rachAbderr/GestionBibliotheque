package com.projet.librairy.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author RACHID Abderrahmane
 */
@Getter
@Setter
@ToString
public class Document {
    private String titre, editeur;

    private LocalDate dateSortie, dateAchat;
    private Auteur auteur;
    private double prix;

    public Document() {
        this.titre = null;
        this.editeur = null;
        this.dateSortie = null;
        this.dateAchat = null;
        this.auteur = null;
        this.prix = 0;
    }

    public Document(String titre, String editeur, LocalDate dateSortie, LocalDate dateAchat, Auteur auteur, double prix) {
        this.titre = titre;
        this.editeur = editeur;
        this.dateSortie = dateSortie;
        this.dateAchat = dateAchat;
        this.auteur = auteur;
        this.prix = prix;
    }

    //recuperer le nom de l'auteur du livre
    public String getNomAuteur(){
        return auteur.getNom();
    }

    //recuperer le prenom de l'auteur du livre
    public String getPrenomAuteur(){
        return auteur.getPrenom();
    }
}
