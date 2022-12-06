package com.bdf;

import java.util.ArrayList;

public class Courant extends Compte {
    public boolean decouvert_autorise;

    public Courant() { }

    public Courant(ArrayList<Client> client,String num, float solde, boolean decouvert_autorise) {
        super(client,num, solde);
        this.decouvert_autorise = decouvert_autorise;
    }

    public boolean isDecouvert_autorise() {
        return decouvert_autorise;
    }

    public void setDecouvert_autorise(boolean decouvert_autorise) {
        this.decouvert_autorise = decouvert_autorise;
    }


    public boolean debiter_solde(Compte c1, float montant) {
        if(decouvert_autorise && c1.getSolde() <= montant) {
            c1.debiter_solde(montant);
            return true;
        }else if(!decouvert_autorise && c1.getSolde() >= montant) {
            c1.debiter_solde(montant);
            return true;
        }else{
            System.out.println("Vous ne pouvez pas débiter votre solde car vous n'avez pas autorisé votre découvert");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Courant{" +
                "Client='" + getClient() + '\'' +
                ", num='" + getNum() + '\'' +
                ", solde=" + getSolde() +
                ", decouvert_autorise=" + decouvert_autorise +
                '}';
    }
}
