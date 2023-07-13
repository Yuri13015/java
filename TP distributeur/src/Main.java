/*Creez un programmae console java qui permet de simuler l'interaction avec un ATM (Distributeur Automatique de Billets).
        Pour cela, il est conseille de creer un diagramme de classe UML avant de commencer a coder.
        Il devra figurer dans le depot git. Il devra presenter le nom des classes, les attributs et les methodes. Ainsi que les eventuels liens entre les classes.

        L'ATM devra permettre de gerer les comptes bancaires des clients.
        Il devra permettre de creer un compte bancaire, de consulter le solde, de deposer de l'argent, de retirer de l'argent, de consulter l'historique des operations.

        L'ATM devra permettre de gerer son compte client. Il devra permettre de modifier les infos du client (nom, prenom, adresse, code postal, ville).

        Afin d'eviter que votre programme ne s'arrete pensez a configurer un menu qui permettra de choisir les actions a effectuer.
        On maintient ainsi le programme en vie tant que l'utilisateur ne decide pas de le quitter. Utilisez une boucle while pour cela.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html
        Scanner scanner = new Scanner(System.in);


        boolean quit = false;

        //Création d'une boucle pour le menu principal
        // Afficher le menu
        // Obtenir l'entrée de l'utilisateur
        // Exécuter les opérations correspondantes

        // Si l'utilisateur choisit de quitter, modifier la variable quit à true pour sortir de la boucle while
        while (!quit) {
            System.out.println("\n Bienvenue que souhaitez-vous faire:");
            System.out.println("1. Créer un compte");
            System.out.println("2. Consulter le solde");
            System.out.println("3. Déposer de l'argent");
            System.out.println("4. Retirer de l'argent");
            System.out.println("5. Consulter l'historique");
            System.out.println("6. Modifier les informations du client");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Demande et lit les informations nécessaires pour créer un compte
                    // Appele la méthode creerCompte() de la classe ATM
                    // Affiche un message de succès ou d'erreur

                    System.out.print("Entrez l'ID du client : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Entrez le nom du client : ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez le prénom du client : ");
                    String prenom = scanner.nextLine();

                    System.out.print("Entrez l'adresse du client : ");
                    String adresse = scanner.nextLine();

                    System.out.print("Entrez le code postal du client : ");
                    String codePostal = scanner.nextLine();

                    System.out.print("Entrez la ville du client : ");
                    String ville = scanner.nextLine();

                    // Declaration du constructeur Client
                    Client client = new Client(id, nom, prenom, adresse, codePostal, ville);
                    atm.creerCompte(client);
                    break;

                case 2:
                    // Demande et lit l'ID du client
                    // Appele la méthode consulterSolde() de la classe ATM
                    // Affiche le solde du compte

                    System.out.print("Entrez l'ID du client : ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine();

                    client = atm.getClientById(clientId);
                    if (client != null) {
                        atm.consulterSolde(client);
                    } else {
                        System.out.println("Le client n'existe pas.");
                    }
                    break;

                case 3:
                    System.out.print("Entrez l'ID du client : ");
                    clientId = scanner.nextInt();
                    scanner.nextLine();

                    client = atm.getClientById(clientId);
                    if (client != null) {
                        System.out.print("Montant à déposer : ");
                        double montantDepot = scanner.nextDouble();
                        scanner.nextLine();

                        atm.deposerArgent(client, montantDepot);
                    } else {
                        System.out.println("Le client n'existe pas.");
                    }
                    break;

                case 4:
                    System.out.print("Entrez l'ID du client : ");
                    clientId = scanner.nextInt();
                    scanner.nextLine();

                    client = atm.getClientById(clientId);
                    if (client != null) {
                        System.out.print("Montant à retirer : ");
                        double montantRetrait = scanner.nextDouble();
                        scanner.nextLine();

                        atm.retirerArgent(client, montantRetrait);
                    } else {
                        System.out.println("Le client n'existe pas.");
                    }
                    break;

                case 5:
                    System.out.print("Entrez l'ID du client : ");
                    clientId = scanner.nextInt();
                    scanner.nextLine();

                    client = atm.getClientById(clientId);
                    if (client != null) {
                        atm.consulterHistorique(client);
                    } else {
                        System.out.println("Le client n'existe pas.");
                    }
                    break;

                case 6:
                    System.out.print("Entrez l'ID du client : ");
                    clientId = scanner.nextInt();
                    scanner.nextLine();

                    client = atm.getClientById(clientId);
                    if (client != null) {
                        atm.modifierInfosClient(client);
                    } else {
                        System.out.println("Le client n'existe pas.");
                    }
                    break;

                case 7:
                    quit = true;
                    break;

                default:
                    System.out.println("Option invalide. Veuillez choisir une option valide.");
            }
        }

        System.out.println("Merci d'avoir utilisé l'ATM. Au revoir !");
    }
}
