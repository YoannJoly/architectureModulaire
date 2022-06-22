package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable {

    private  String parfum;
    private  int temperatureConservation;


    public Glace() {
    }

    public Glace(final long refProd, final String libelle, final String marque, final float prixUnitaire,
            final long qteStock,
            final LocalDate dateLimiteConso, final String parfum, final int temperatureConservation) {
        super(refProd, libelle, marque, prixUnitaire, qteStock, dateLimiteConso);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public Glace(final LocalDate dateLimiteConso, final String marque, final String libelle,
            final int temperatureConservation, final String parfum,
            final long qteStock, final float prixUnitaire) {
        super(libelle, marque, prixUnitaire, qteStock, dateLimiteConso);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public  String getParfum() {
        return parfum;
    }

    public  void setParfum(final String parfum) {
        this.parfum = parfum;
    }

    public  int getTemperatureConservation() {
        return temperatureConservation;
    }

    public void setTemperatureConservation(final int temperatureConservation) {
        this.temperatureConservation = temperatureConservation;
    }



    @Override
    public String toString() {
        return "Glace [parfum=" + parfum + ", temperatureConservation=" + temperatureConservation + "°C]";
    }

}
