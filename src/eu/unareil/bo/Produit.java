package eu.unareil.bo;

public class Produit {

    private long refProd;
    private String libelle;
    private String marque;
    private float prixUnitaire;
    private long qteStock;

    public Produit() {
    }

    public Produit(final long refProd, final String libelle, final String marque, final float prixUnitaire, final long qteStock) {
        this.refProd = refProd;
        this.libelle = libelle;
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public Produit(final String libelle, final String marque, final float prixUnitaire, final long qteStock) {
        this.libelle = libelle;
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public int getRefProd() {
        return (int) refProd;
    }

    public void setRefProd(final long refProd) {
        this.refProd = refProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(final String marque) {
        this.marque = marque;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(final float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQteStock() {
        return (int) qteStock;
    }

    public void setQteStock(final long qteStock) {
        this.qteStock = qteStock;
    }

    @Override
    public String toString() {
        return "Produit [refProd=" + refProd + ", libelle=" + libelle + ", marque=" + marque + ", prixUnitaire=" + prixUnitaire + "€, qteStock=" + qteStock + "]";
    }

}
