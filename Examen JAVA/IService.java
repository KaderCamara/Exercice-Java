public class IService {
        int taille=50;
    
        private Embauche tabEmb[];
        private Journalier tabJour[];
        private Service tabService[];
    
        private int NbreEmb=0;
        private int NbreJour=0;
        private int NbreService=0;
    
        public IService(){
            tabEmb= new Embauche[taille];
            tabService= new Service[taille];
            tabJour= new Journalier[taille];
        }
    
        public void CreerEmb (Embauche emb){
            tabEmb[NbreEmb]= emb;
            NbreEmb++;
        }

        public void CreerJour (Journalier jour{
            tabJour[NbreJour]= jour;
            NbreJour++;
        }
    
        public void CreerService (Service ser){
            tabService[NbreService]= ser;
            NbreService++;
        }
    
        public void ListerService (){
            for (int i=0; i<NbreService;i++){
                System.out.println(tabService[i].affiche());
            }
        }
    
        public void ListerEmb (){
            for (int i=0; i<NbreEmb;i++){
                System.out.println(tabEmb[i].affiche());
            }
        }

        public void ListerJour (){
            for (int i=0; i<NbreJour;i++){
                System.out.println(tabJour[i].affiche());
            }
        }
    
}