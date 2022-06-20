package eu.unareil.bo;

public class Auteur {

    private String nom;
    private String prenom;

    public Auteur() {
    }

    public Auteur(final String nom, final String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Auteur [nom=" + nom + ", prenom=" + prenom + "]";
    }

}
