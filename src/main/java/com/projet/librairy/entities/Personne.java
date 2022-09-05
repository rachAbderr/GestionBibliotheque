package com.projet.librairy.entities;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author RACHID Abderrahmane
 */
public abstract class Personne {

    protected String nom;
    protected String prenom;
    protected LocalDate date_naissance;

    protected int age;

    public Personne() {
        this.nom = null;
        this.prenom = null;
        this.date_naissance = null;
        this.age =0;
    }

    public Personne(String nom, String prenom, LocalDate date_naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.age = calculeAge(this.date_naissance);
    }

    public  int calculeAge(LocalDate date_naissance){
        return Period.between(date_naissance,LocalDate.now()).getDays();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
