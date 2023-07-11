import java.util.Random;
import java.util.Scanner;

public class Justeprix {
        public static void main(String[] args) {
            Random random = new Random();
            int nombreJuste = random.nextInt(100);
            int tentative = 0;
            System.out.println("=== Juste Prix ===");
            System.out.println("Devinez le nombre entre 1 et 100.");

            Scanner scanner = new Scanner(System.in);
            long debut = System.currentTimeMillis();

            while (true) {
                System.out.println("Donner un chiffre");
                int proposition = scanner.nextInt();
                tentative++;
                
                if (proposition == nombreJuste) {
                    long fin = System.currentTimeMillis();
                    long tempsTotal = fin - debut;
                    double tempsEnSecondes = tempsTotal / 1000.0;

                    System.out.println("Bravo, vous avez trouvé le juste prix !");
                    System.out.println("Nombre de tentatives : " + tentative);
                    System.out.println("Temps écoulé : " + tempsEnSecondes + " secondes");
                    break;
                } else if (proposition < nombreJuste) {
                    System.out.println("C'est plus !");
                } else {
                    System.out.println("C'est moins !");
                }
            }
        }
}