import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ATM {
    private List<Client> clients;

    public ATM() {
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
        // constructeur de classe qui initialise la liste clients
        clients = new ArrayList<>();
    }

    // CreerCompte rajoute un client
    public void creerCompte(Client client) {
        clients.add(client);
        System.out.println("Compte créé avec succès pour le client : " + client.getNom() + " " + client.getPrenom());
    }

    public void consulterSolde(Client client) {
        double solde = client.getSolde();
        System.out.println("Solde du compte de " + client.getNom() + " " + client.getPrenom() + ": " + solde);
    }

    public void deposerArgent(Client client, double montant) {
        double nouveauSolde = client.getSolde() + montant;
        client.setSolde(nouveauSolde);
        client.ajouterOperation("Dépôt : +" + montant);
        System.out.println("Dépôt de " + montant + " effectué pour " + client.getNom() + " " + client.getPrenom());
    }

    public void retirerArgent(Client client, double montant) {
        double solde = client.getSolde();
        if (solde >= montant) {
            double nouveauSolde = solde - montant;
            client.setSolde(nouveauSolde);
            client.ajouterOperation("Retrait : -" + montant);
            System.out.println("Retrait de " + montant + " effectué pour " + client.getNom() + " " + client.getPrenom());
        } else {
            System.out.println("Solde insuffisant pour le client : " + client.getNom() + " " + client.getPrenom());
        }
    }

    public void consulterHistorique(Client client) {
        List<String> historique = client.getHistorique();
        System.out.println("Historique des opérations pour " + client.getNom() + " " + client.getPrenom() + ":");
        for (String operation : historique) {
            System.out.println(operation);
        }
    }

    public void modifierInfosClient(Client client) {
        System.out.println("Modification des informations pour le client : " + client.getNom() + " " + client.getPrenom());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nouveau nom : ");
        String nom = scanner.nextLine();
        client.setNom(nom);

        System.out.print("Nouveau prénom : ");
        String prenom = scanner.nextLine();
        client.setPrenom(prenom);

        System.out.print("Nouvelle adresse : ");
        String adresse = scanner.nextLine();
        client.setAdresse(adresse);

        System.out.print("Nouveau code postal : ");
        String codePostal = scanner.nextLine();
        client.setCodePostal(codePostal);

        System.out.print("Nouvelle ville : ");
        String ville = scanner.nextLine();
        client.setVille(ville);

        System.out.println("Informations mises à jour avec succès pour le client : " + client.getNom() + " " + client.getPrenom());
    }

    Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
}
