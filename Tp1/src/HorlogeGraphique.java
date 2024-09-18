import javax.swing.JFrame;
import javax.swing.JLabel;
public class HorlogeGraphique extends JLabel{ 

public HorlogeGraphique() {
   this.setHorizontalAlignment(JLabel.CENTER);
   Vecteur vecteur = new Vecteur(0,0,0);
   Thread horloge = new Thread(new Aff(vecteur,this),"HorlogeGraphique");

   horloge.start();
   
}
public void updateLabelText(Vecteur vecteur) {
            setText(String.format("%02d:%02d:%02d", vecteur.gethoures(), vecteur.getminutes(), vecteur.getseconds()));
    }
public static void main(String[] args) { 
JFrame frame = new JFrame("Horloge Graphique"); 
frame.setSize(200, 200); 
frame.setContentPane(new HorlogeGraphique()); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setVisible(true);
} 
}

