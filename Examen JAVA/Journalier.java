public class Journalier extends Employe{
        private int duree;
        private String forfait;
    
        public Journalier(int duree, String forfait){
            super(id, nomComplet);
            this.duree=duree;
            this.forfait=forfait;
        }
    
        public String affiche(){
            return ("id :"+id+"nomComplet :"+nomComplet+"duree : "+duree+" Forfait : "+forfait);
        }
 
}