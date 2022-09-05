package com.projet.librairy.entities;

import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * @author RACHID Abderrahmane
 */
@EqualsAndHashCode
public class Auteur extends Personne{
    private String nationalite;

    public Auteur() {
        this.nationalite = null;
    }

    public Auteur(String nom, String prenom, LocalDate date_naissance, String nationalite) {
        super(nom, prenom, date_naissance);
        this.nationalite = nationalite;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString(){
        return "\nPrénom: " + prenom + "\nNom: " + nom +
                "\nNationalité: " + nationalite + "\nDate de naissance:  " + date_naissance;
    }
}
