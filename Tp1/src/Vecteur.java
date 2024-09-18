public class Vecteur  {
    private int minutes,secondes ,heures;
    public Vecteur(int minutes, int secondes, int heures){
        this.minutes = minutes;
        this.secondes = secondes;
        this.heures = heures;
    }
    
    public int getseconds(){
        return secondes;
    }
    public int getminutes(){
        return minutes;
    }
    public int gethoures(){
        return heures;
    }
    public void setseconds(int seconds) {
        this.secondes = seconds;
    }
    public void setminutes(int minutes) {
        this.minutes = minutes;
    }
    public void sethoures(int heures) {
        this.heures = heures;
    }

}