import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class calculatrice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a, b, c, choix;
        System.out.println("Entrez le nombre a");
        a=scan.nextInt();
        System.out.println("Entrez le nombre b");
        b=scan.nextInt();
        System.out.println("--------- MENU ----------");
        System.out.println("1- Addition");
        System.out.println("2- Soustraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println();
        System.out.println("faites votre choix");
        choix=scan.nextInt();
        while(choix>4) {
            System.out.println("Entrez une valeur correcte");
            choix=scan.nextInt();
        }
        MyFonctions calcul= new MyFonctions();
        if (choix == 1){
            c = calcul.addition(a,b);
            System.out.println("addition");
            System.out.println(a +"+" +b +"=" +c);
        }
        if (choix == 2){
            c = calcul.soustraction(a,b);
            System.out.println("soustraction");
            System.out.println(a +"-" +b +"=" +c);
        }
        if (choix == 3){
            c = calcul.multiplication(a,b);
            System.out.println("multiplication");
            System.out.println(a +"x" +b +"=" +c);
        }
        if (choix == 4){
            c = calcul.division(a,b);
            System.out.println("division");
            System.out.println(a +"/" +b +"=" +c);
        }

    }
}


