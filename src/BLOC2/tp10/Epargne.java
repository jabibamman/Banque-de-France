package BLOC2.tp10;

import java.util.ArrayList;

public class Epargne extends Compte {
    private float T_interet;

    public Epargne() { }

    public Epargne(ArrayList<BLOC2.tp10.Client> client, String num, float solde, float T_interet) {
        super(client, num, solde);
        this.T_interet = T_interet;
    }

    public float getT_interet() {
        return T_interet;
    }

    public void setT_interet(float t_interet) {
        T_interet = t_interet;
    }

    @Override
    public float getSolde() {
        return super.getSolde()*T_interet;
    }

    @Override
    public void setSolde(float solde) {
        if(solde >= 0) {
            super.setSolde(solde);
        }
    }

    @Override
    public String toString() {
        return "Epargne{" +
                "Client='" + getClient() + '\'' +
                ", num='" + getNum() + '\'' +
                ", solde=" + getSolde() +
                ", T_interet=" + T_interet +
                '}';
    }
}
