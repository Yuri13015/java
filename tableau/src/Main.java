// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // je creer mon tableau et je donne une un emplacement a chaques valeurs
        String[] emails = new String[10];
        emails[0] = "jonny.de@gmail.com";
        emails[1] = "jean.fontaine@hotmail.com";
        emails[2] = "michou.bro@yahoo.com";
        emails[3] = "emma.watson@gmail.com";
        emails[4] = "vdshvb.vdnsj@gmail.com";
        emails[5] = "bdhd.vdbhs@hotmail.com";
        emails[6] = "vrzv.vrsvd@yahoo.com";
        emails[7] = "emily.byby@gmail.com";
        emails[8] = "vezv.devzzs@hotmail.com";
        emails[9] = "cebhv.bches@gmail.com";

        double percentage = calculEmailPercentage(emails);
        System.out.println("Pourcentage de fournisseurs de gmail : " + percentage + "%");
    }
    public static double calculEmailPercentage(String[] emails){

        // j'initialise totalEmails pour avoir le nombre total d'email
        int totalEmails = emails.length;

        // pareille mais j'initialise a 0 pour gmail (compteur)
        int gmailCount = 0;

        // je fais une boucle qui ajoute +1 a mon gmailCount chaque fois que a la fin de mon mail il y a gmail.com

        for (String email : emails) {
            if (email.endsWith("@gmail.com")) {
                gmailCount++;
            }
        }
        // je calcule le pourcentage de gmail
        double gmailPercentage = (gmailCount / (double) totalEmails) * 100;
        return gmailPercentage;
    }
}

