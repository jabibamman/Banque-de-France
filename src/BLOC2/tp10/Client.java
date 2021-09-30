package BLOC2.tp10;

import java.util.ArrayList;

public class Client extends ArrayList<Client> {
    private ArrayList<Compte> comptes = new ArrayList<Compte>();
    private String nom, prenom, lesComptes;

    public Client(){
        this.comptes = comptes;
        this.nom = nom;
        this.prenom = prenom;
        this.lesComptes = lesComptes;

    }

    public Client(String nom, String prenom) {
        this.comptes = comptes;
        this.nom = nom;
        this.prenom = prenom;
        this.lesComptes = lesComptes;
    }

// Getter & Setter
    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<Compte> comptes) {
        this.comptes = comptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

// Méthode

    public void solde_general(Client nom, Client prenom) {
        /*
            for(Compte e : comptes) {
                if(nom == e.getClient()){
                    return e;
                }
            }
            return null;
        }*/
    }

    public void ajouteCompte(Compte unCompte) {
        comptes.add(unCompte);
    }

    public String afficheCompte() {
        for(Compte c : comptes) {
            lesComptes += "\n" + c;
        }
        return lesComptes;
    }



    @Override
    public String toString() {
        return "Client{" +
                "comptes=" + getComptes() +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
