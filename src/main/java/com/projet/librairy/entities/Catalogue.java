package com.projet.librairy.entities;



import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author RACHID Abderrahmane
 */
@Getter
public class Catalogue {

    //Design Pattern Singleton
    private static Catalogue INSTANCE;


    private List<Document> catalogueList;

    private Catalogue(){
        catalogueList = new ArrayList<>();
    }

    public static Catalogue getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Catalogue();
        }
        return INSTANCE;
    }

    //pour l'affichage des catalogueList de la bibliothquee
    @Override
    public String toString() {
        StringBuilder colleLivre = new StringBuilder();

        Iterator<Document> iter = this.catalogueList.iterator();
        while(iter.hasNext()){
            Document livre = (Document) iter.next();
            colleLivre.append("\n"+livre.toString());
        }
        return String.valueOf(colleLivre);
    }


    //compter le nombre de catalogueList de la bibliothèque
    public int compteLivres(){
        return catalogueList.size();
    }


}
