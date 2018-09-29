import javax.swing.JOptionPane;
public class Vsoma {
     public static void main(String args[]) {
          String n;
          int numero, soma;
       

          soma = 0;       
          n = JOptionPane.showInputDialog(null, "Numero: ");
          numero = Integer.parseInt(n);

          for (int i=1; i<=numero; i++) {
              soma = soma + i;
          }
          JOptionPane.showMessageDialog(null, "Soma: "+soma);
          System.exit(0);
     }
}     