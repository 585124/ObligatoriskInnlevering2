package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class PoengsumPrøve {
    public static void main(String[] args) {

        int skrivPoengsum = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));


        if (skrivPoengsum <= 100 && skrivPoengsum >= 90){
            showMessageDialog(null, "Karakter: A");
        }
        else if (skrivPoengsum <= 89 && skrivPoengsum >= 80){
            showMessageDialog(null, "Karakter: B");
        }
        else if (skrivPoengsum <= 79 && skrivPoengsum >= 60){
            showMessageDialog(null, "Karakter: C");
        }
        else if (skrivPoengsum <= 59 && skrivPoengsum >= 50){
            showMessageDialog(null, "Karakter: D");
        }
        else if (skrivPoengsum <= 49 && skrivPoengsum >= 40){
            showMessageDialog(null, "Karakter: E");
        }
        else if (skrivPoengsum <= 39 && skrivPoengsum >= 0){
            showMessageDialog(null, "Karakter: F");
        }
        else {
            showMessageDialog(null, "Ugyldig karakterpoeng");
        }




    }
}
