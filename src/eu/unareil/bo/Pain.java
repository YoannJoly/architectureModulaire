package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable {

    private int poids;

    public Pain() {
    }

    public Pain(final long refProd, final String libelle, final String marque, final float prixUnitaire, final long qteStock,
            final LocalDate dateLimiteConso, final int poids) {
        super(refProd, libelle, marque, prixUnitaire, qteStock, dateLimiteConso);
        this.poids = poids;
    }

    public Pain(final String marque, final String libelle, final long qteStock, final int poids, final float prixUnitaire) {
        super(libelle, marque, prixUnitaire, qteStock);
        this.poids = poids;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(final int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Pain [poids=" + poids + "]";
    }

}
