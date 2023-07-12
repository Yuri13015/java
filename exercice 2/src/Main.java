
public class Main {
    public static void main(String[] args) {
        Article article = new Article("lol","pull",19.99);

        System.out.println("reference du produit: " +article.reference);
        System.out.println("Designation: " +article.designation);
        System.out.println("Prix: "+article.prix);

        Client client = new Client("Payet","Dimitri","Robert luis dreyfus",13015,"Marseille");

        System.out.println("Nom client: "+client.nom);
        System.out.println("Prenom client: "+client.prenom);
        System.out.println("Adresse client: "+client.adresse);
        System.out.println("Code postal client: "+client.codePostal);
        System.out.println("Ville du client: "+client.ville);
    }

}
