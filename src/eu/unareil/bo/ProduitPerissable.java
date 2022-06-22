package eu.unareil.bo;

import java.time.LocalDate;

public class ProduitPerissable extends Produit {

    private static LocalDate dateLimiteConso;

    public ProduitPerissable() {
    }

    public ProduitPerissable(final long refProd, final String libelle, final String marque, final float prixUnitaire, final long qteStock, final LocalDate dateLimiteConso) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        ProduitPerissable.dateLimiteConso = dateLimiteConso;
    }

    public ProduitPerissable(final String libelle, final String marque, final float prixUnitaire, final long qteStock, final LocalDate dateLimiteConso) {
        super(libelle, marque, prixUnitaire, qteStock);
        ProduitPerissable.dateLimiteConso = dateLimiteConso;
    }

    public ProduitPerissable(final String libelle, final String marque, final float prixUnitaire, final long qteStock) {
        super(libelle, marque, prixUnitaire, qteStock);
    }

    public static LocalDate getDateLimiteConso() {
        return dateLimiteConso;
    }

    public void setDateLimiteConso(final LocalDate dateLimiteConso) {
        ProduitPerissable.dateLimiteConso = dateLimiteConso;
    }

    @Override
    public String toString() {
        return "ProduitPerissable [dateLimiteConso=" + dateLimiteConso + "]";
    }

}
