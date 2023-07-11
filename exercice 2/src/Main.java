import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int resultat = combinaison();
        System.out.println("Nombre d'essais nécessaires : " + resultat);
    }

    public static int combinaison() {
        Random random = new Random();
        int resultat = 0;

        while (true) {
            int num1 = random.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000
            int num2 = random.nextInt(1001);
            int num3 = random.nextInt(1001);

            if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 != 0) {
                // La combinaison recherchée (pair, pair, impair)
                break;
            }

            resultat++;
        }

        return resultat;
    }
}
