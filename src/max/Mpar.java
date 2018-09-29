package max;

import javax.swing.JOptionPane;
public class Mpar {
     public static void main(String args[]) {
          String n, mostra;
          int numero, resto;
       

          mostra = "";       
          n = JOptionPane.showInputDialog(null, "Numero: ");
          numero = Integer.parseInt(n);

          for (int i=1; i<numero; i++) {
              resto = i%2;
              if (resto == 0) 
                 mostra = mostra+"Numero: "+i+"\n";
          }
          JOptionPane.showMessageDialog(null, mostra);
          System.exit(0);
     }
}     