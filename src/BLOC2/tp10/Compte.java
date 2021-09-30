package BLOC2.tp10;

import java.util.ArrayList;

public class Compte {
    private String num;
    private ArrayList<Client> Client = new ArrayList<Client>();
    private float solde;

    public Compte() { }

    public Compte(ArrayList<Client> client,String num, float solde) {
        this.num = num;
        Client = client;
        this.solde = solde;
    }

    // GETTER && SETTER
    public ArrayList<Client> getClient() {
        return Client;
    }

    public void setClient(ArrayList<Client> client) {
        Client = client;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
            this.solde = solde;
    }

// MÉTHODE

    // créditer le solde d'un montant fourni
    public void crediter_compte(float montant) {
        if(montant > 0) {
            solde += montant;
            System.out.println("Votre compte a été crédité de " + montant);
        }else{
            System.err.println("Vous devez créditer un montant de plus de 0 €");
        }
    }

    public boolean debiter_solde(float montant) {
        if(solde >= montant) {
            solde -= montant;
            return true;
        }
        System.out.println("Petit soucis car " + montant + " : " + solde);
        return false;
    }

    public boolean transferer_compte(Compte beneficiaire, float montant) {
        if(getSolde() >= montant) {
            debiter_solde(montant);
            beneficiaire.crediter_compte(montant);
            return true;
        }
        return false;
    }

    public boolean comparer_compte(Compte c2) {
        if(getSolde() > c2.getSolde()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "Client='" + Client + '\'' +
                ", num='" + num + '\'' +
                ", solde=" + solde +
                '}';
    }
}
