public class Embauche extends Employe{
    private int salaire;
    private String dateEmb;

    public Embauche(int salaire, String dateEmb){
        super(id, nomComplet);
        this.salaire=salaire;
        this.dateEmb=dateEmb;
    }

    public String affiche(){
        return ("Salaire : "+salaire+" date d'embauche : "+dateEmb);
    }
}