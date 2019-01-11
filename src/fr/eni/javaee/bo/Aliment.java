package fr.eni.javaee.bo;

public class Aliment {
    private String nom;

    public Aliment(){
        super();
    }

    public Aliment(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
