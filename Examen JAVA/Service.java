public class Service {
    private int id=1;
    private String libelle;

    public Service(int id, String libelle){
        ++id;
        this.libelle=libelle;
    }

    public String compare(int id){
        return("ce sont les memes");
    }

    public String compare (String libelle){
        return("ce sont les memes");
    }

    public String affiche(){
        return ("id : "+id+" Libelle : "+libelle);
    }
}