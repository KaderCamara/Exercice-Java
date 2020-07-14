public abstract class  Employe {
    protected static int id=1;
    protected static String nomComplet;


    public Employe(int id, String nomComplet){
        ++id;
        this.nomComplet=nomComplet;
    }

    public boolean IsEmbauche(String reponseEmp){
       if(reponseEmp=="oui"){
           return true;
       }else{
           return false;
       }
    }

    public boolean IsJournalier(String reponseJour){
        if(reponseJour=="oui"){
            return true;
        }else{
            return false;
        }
     }

     public String affiche(){
        return ("id : "+id+" nom Complet : "+nomComplet+"Embauche :"+IsEmbauche(reponseEmp)+"Journalier :"+IsJournalier(reponseJour));
    }
}