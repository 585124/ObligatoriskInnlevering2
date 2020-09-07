package no.hvl.dat100;


import static javax.swing.JOptionPane.*;
public class Fakultet {
    public static void main(String[] args) {
        int n = Integer.parseInt(showInputDialog("Skriv inn tall n: "));
        int nedreGrense = 1;
        int øvreGrense = n;
        while(n > 1){
            nedreGrense *= n;
            øvreGrense -= 1;
            int svar = nedreGrense * øvreGrense;
            n--;
            showMessageDialog(null, "Verdien for din fakultet blir: \n" + øvreGrense + " * " + nedreGrense);
        }

    }
}