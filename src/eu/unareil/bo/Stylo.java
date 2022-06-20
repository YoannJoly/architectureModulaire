package eu.unareil.bo;

public class Stylo extends Produit {

    private String couleur;
    private String typeMine;

    public Stylo() {
    }

    public Stylo(final long refProd, final String libelle, final String marque, final float prixUnitaire,
            final long qteStock, final String couleur,
            final String typeMine) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
    }

    public Stylo(final String marque, final String libelle, final long qteStock, final float prixUnitaire,
            final String couleur, final String typeMine) {
        super(libelle, marque, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(final String couleur) {
        this.couleur = couleur;
    }

    public String getTypeMine() {
        return typeMine;
    }

    public void setTypeMine(final String typeMine) {
        this.typeMine = typeMine;
    }

}
