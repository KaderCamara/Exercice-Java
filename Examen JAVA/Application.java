import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        IService bon=new IService();
        String choix;
        do {
        System.out.println("1-Ajouter un Service");
        System.out.println("2-Lister Service");
        System.out.println("3-Ajouter un Employe");
        System.out.println("4-Lister Journalier");
        System.out.println("5-Lister Employé d'un service");
        System.out.println("6-Quitter");
        System.out.println("-------faites votre choix------");
        choix=clavier.nextLine();
        switch (choix){
            case "1":
                System.out.println("Entrez le libelle");
                String libelle=clavier.nextLine();

                Service serv= new Service(1, libelle);
                bon.CreerService(serv);
                break;
            case "2":

                bon.ListerService();
                break;

            case "3":
                System.out.println("Entrez le nom Complet");
                String nomComplet=clavier.nextLine();
                System.out.println("Est-ce un Employe ?");
                String reponseEmp=clavier.nextLine();
                System.out.println("Est-ce un Journalier ?");
                String reponseJour=clavier.nextLine();
                Employe emp= new Employe(1, nomComplet);
                if(reponseEmp=="oui"){
                    System.out.println("Entrez le salaire");
                    int Salaire=clavier.nextInt();
                    System.out.println("Entrez la date d'embauche");
                    String DateEmb=clavier.nextLine();
                    Embauche emb= new Embauche(Salaire, DateEmb);
                    bon.CreerEmb(emb);
                }

                if(reponseJour=="oui"){
                    System.out.println("Entrez la duree");
                    int duree=clavier.nextInt();
                    System.out.println("Entrez le forfait");
                    String forfait=clavier.nextLine();
                    Journalier jour= new Journalier(duree, forfait);
                    bon.CreerJour(jour);
                }

            case "4":
                bon.ListerJour();
                break;

            case "5":
                bon.ListerEmb();
                break;

            case "6":
                
                System.exit(0);
            break;

            default:
            break;
        }

        }while (choix!="6");
    }


}