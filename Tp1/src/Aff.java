public class Aff implements Runnable{
    private Vecteur vect;
    private HorlogeGraphique hg;
    public Aff(Vecteur vect, HorlogeGraphique hg){
        this.vect = vect;
        this.hg = hg;
    }
    
    
    public void run(){
        while(true){
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
            vect.setseconds(vect.getseconds()+1);
            if(vect.getseconds()==60){
                vect.setseconds(0);
                vect.setminutes(vect.getminutes()+1);
            }
            if(vect.getminutes()==60){
                vect.setminutes(0);
                vect.sethoures(vect.gethoures()+1);
            }
            hg.updateLabelText(vect);
        }
        

    }
}

