package com.bdf;

import java.util.ArrayList;

public class Banque {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public Banque() { }

    // ajoute un client à la banque
    public void ajouteClient(Client client) {
        clients.add(client);
    }

    // supprime un client de la banque
    public void supprimeClient(Client client) {
        clients.remove(client);
    }

    // affiche la liste des clients de la banque
    public void afficheClients() {
        for(Client e : clients) {
            System.out.println(e);
        }
    }

    // affiche la liste des comptes d'un client
    public void afficheComptes(Client client) {
        for(Compte e : client.getComptes()) {
            System.out.println(e);
        }
    }

    // affiche le client le plus riche
    public void clientLePlusRiche() {
        float max = 0;
        Client client = null;
        for(Client e : clients) {
            if(e.getComptes().get(0).getSolde() > max) {
                max = e.getComptes().get(0).getSolde();
                client = e;
            }
        }
        System.out.println("Le client le plus riche est " + client);
    }


}
