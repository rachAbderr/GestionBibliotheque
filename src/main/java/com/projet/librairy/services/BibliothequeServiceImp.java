package com.projet.librairy.services;

import com.projet.librairy.entities.Auteur;
import com.projet.librairy.entities.Catalogue;
import com.projet.librairy.entities.Client;
import com.projet.librairy.entities.Document;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RACHID Abderrahmane
 */
@Getter
public class BibliothequeServiceImp implements BibliothequeService{

    private Catalogue catalogue = Catalogue.getInstance();


    @Override
    public void ajouterDocument(Document document) {
        this.catalogue.getCatalogueList().add(document);
    }

    @Override
    public void supprimerDocument(Document document) {
            catalogue.getCatalogueList().remove(document);
    }

    @Override
    public List<Document> getAllDocument() {
        return catalogue.getCatalogueList();
    }

    @Override
    public List<Document> getDocumentByAuteur(Auteur auteur) {
        List<Document> documents = new ArrayList<>();
        for(Document doc : getAllDocument()){
            if(doc.getAuteur().equals(auteur)){
                documents.add(doc);
            }
        }
        return documents;
    }

    @Override
    public Document getDocumentByTitre(String titre) {

        return null;
    }

    @Override
    public void emprunterDocumet(Client client, Document document) {

    }
}
