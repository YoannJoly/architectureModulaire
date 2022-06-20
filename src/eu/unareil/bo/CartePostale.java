package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class CartePostale extends Produit {

    private TypeCartePostale type;
    private Auteur auteur;
    List<Auteur> list = new ArrayList<Auteur>();

    public CartePostale() {
    }

    public CartePostale(final long refProd, final String libelle, final String marque, final float prixUnitaire,
            final long qteStock,
            final TypeCartePostale type,
            final Auteur auteur) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.type = type;
        this.auteur = auteur;
    }

    public CartePostale(final String marque, final String libelle, final long qteStock, final float prixUnitaire,
            final List<Auteur> list, final TypeCartePostale type) {
        super(libelle, marque, prixUnitaire, qteStock);
        this.type = type;
        this.list = list;
    }

    public TypeCartePostale getType() {
        return type;
    }

    public void setType(final TypeCartePostale type) {
        this.type = type;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(final Auteur auteur) {
        this.auteur = auteur;
    }

    public List<Auteur> getList() {
        return list;
    }

    public void setList(final List<Auteur> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        
        return "CartePostale [type=" + type + ", auteur=" + auteur + ", list=" + list + "]";
    }

}
