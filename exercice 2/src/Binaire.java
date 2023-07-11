import java.util.Random;
import java.util.Scanner;




public class Binaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisi un nombre entier");

        int ent = scanner.nextInt();

        double decimal = ent;

        String str = Integer.toBinaryString(ent);
        String oct = Integer.toOctalString(ent);
        String hex = Integer.toHexString(ent);

        System.out.println(str);
        System.out.println(oct);
        System.out.println(hex);
    }
    }
