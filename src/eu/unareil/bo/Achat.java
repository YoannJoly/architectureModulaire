package eu.unareil.bo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Achat {

    private double montant;
    private final List<Ligne> lignesAchat = new ArrayList<Ligne>();

    public Achat(final Ligne ligne) {
        this.lignesAchat.add(ligne);
        this.montant = ligne.getProduit().getPrixUnitaire() * ligne.getQuantite();
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(final double montant) {
        this.montant = montant;
    }

    public Ligne getLigne(final int index) {
        return lignesAchat.get(index);
    }

    public List<Ligne> getlignesAchat() {
        return lignesAchat;
    }

    public void ajouteLigne(final Produit produit, final int quantite) {
        final Ligne ligne = new Ligne(produit, quantite);
        lignesAchat.add(ligne);
    }

    public void modifieLigne(final int index, final int quantite) {
        final Ligne ligne = lignesAchat.get(index);
        ligne.setQuantite(quantite);
    }

    public void supprimeLigne(final int index) {
        lignesAchat.remove(index);
    }

    public String calculMontant() {
        double montant = 0;
        for (final Ligne ligne : lignesAchat) {
            montant += ligne.getQuantite() * ligne.getProduit().getPrixUnitaire();
        }
        return new DecimalFormat("##.##").format(montant);
    }

    @Override
    public String toString() {
        return "Achat [montant=" + montant + ", lignesAchat=" + lignesAchat + "] " + "\nTotal de l'achat : "
                + calculMontant() + "€";
    }

}
