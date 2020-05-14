import java.util.Scanner;
import java.lang.Math;

public class rectangle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int longueur, largeur, perimetre, demiPerimetre, surface, diagonale;
        System.out.println("Entrez la longueur");
        longueur=scan.nextInt();
        System.out.println("Entrez la largeur");
        largeur=scan.nextInt();
        MyFonctions calculR= new MyFonctions();
        perimetre = calculR.perimetre(longueur,largeur);
        System.out.println("Perimetre");
        System.out.println(perimetre);
        demiPerimetre= calculR.demiPerimetre(longueur,largeur);
        System.out.println("Demi-Perimetre");
        System.out.println(demiPerimetre);
        surface= calculR.surface(longueur,largeur);
        System.out.println("Surface");
        System.out.println(surface);
        System.out.println("Diagonale");
        System.out.println(Math.sqrt(Math.pow(longueur,2)+Math.pow(largeur,2)));

    }
}
