package com.projet.librairy;

import com.projet.librairy.entities.Auteur;
import com.projet.librairy.entities.Document;
import com.projet.librairy.services.BibliothequeService;
import com.projet.librairy.services.BibliothequeServiceImp;

import java.time.LocalDate;
import java.util.List;

/**
 * @author RACHID Abderrahmane
 */
public class Main {

    private static final BibliothequeService bibliothequeService = new BibliothequeServiceImp();


    public static void main(String[] args) {
        List<Document> documentList = bibliothequeService.getAllDocument();
        //exemples d'auteurs
        Auteur auteur1 = new Auteur(" Blain", "Christophe", LocalDate.of(1970,8,10), "FR");

        //exemple de documents
        Document document1 = new Document();
        document1.setAuteur(auteur1);
        document1.setTitre("Le Monde sans fin");
        document1.setEditeur("DARGAUD");
        document1.setDateSortie(LocalDate.of(2021,10,29));
        document1.setDateAchat(LocalDate.of(2021,11,10));
        document1.setPrix(27.00);



        //Ajouter un document dans la list de documents de la bibliothque
        bibliothequeService.ajouterDocument(document1);
        System.out.println(documentList.toString());

        //chercher un document par auteur





    }
}
