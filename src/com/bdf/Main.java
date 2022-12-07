package com.bdf;

public class Main {

    public static void main(String[] args) {

        Banque banque = new Banque();

        Client frederique = new Client("Seger","Frédérique");
        Client james = new Client("Abib ","James");

        Compte e1 = new Epargne(james,"FR76 12658", 12000, 2);
        Compte c1 = new Courant(james, "FR76 12658", 6000, false);

        Compte e2 = new Epargne(frederique,"FR76 12558", 8500, 1);
        Compte c2 = new Courant(frederique, "FR76 12558", 11000, true);

        // la banque ajoute 2 client (frederique seger && james abib)
        banque.ajouteClient(james);
        banque.ajouteClient(frederique);
        banque.afficheClients();

        // ON ajoute les comptes des clients

        james.ajouteCompte(e1);
        james.ajouteCompte(c1);

        frederique.ajouteCompte(e2);
        frederique.ajouteCompte(c2);

        System.out.println("Liste des clients de la banque");
        //System.out.println(james.afficheCompte());
        /*
        banque.clientLePlusRiche();

 */

//        System.out.println(client.afficheCompte());

        //System.out.println(banque.affifcheClients());

        /*
        System.out.println(c1.transferer_compte(c2, 3500));

        System.out.println("Compte après virement : \n  Client : " + c1.getClient() + ", Solde : " + c1.getSolde() + "\n  Client : " + c2.getClient() + ", Solde : " + c2.getSolde());

        System.out.println(c1.comparer_compte(c1));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
*/

    }
}

