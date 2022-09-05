package com.projet.librairy.entities;

import java.time.LocalDate;

/**
 * @author RACHID Abderrahmane
 */
public class Bibliothequaire extends Personne{


    public Bibliothequaire() {
    }

    public Bibliothequaire(String nom, String prenom, LocalDate date_naissance) {
        super(nom, prenom, date_naissance);
    }

    @Override
    public String toString(){
        return "\nPrénom: " + prenom + "\nNom: " + nom +
                "\nDate de naissance:  " + date_naissance;
    }
}
