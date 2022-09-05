package com.projet.librairy.services;

import com.projet.librairy.entities.Auteur;
import com.projet.librairy.entities.Client;
import com.projet.librairy.entities.Document;

import java.util.List;

/**
 * @author RACHID Abderrahmane
 */
public interface BibliothequeService {

    public void ajouterDocument(Document livre);
    public void supprimerDocument(Document livre);
    public List<Document> getAllDocument();
    public List<Document> getDocumentByAuteur(Auteur auteur);
    public Document getDocumentByTitre(String titre);
    public void emprunterDocumet(Client client , Document document);


}
