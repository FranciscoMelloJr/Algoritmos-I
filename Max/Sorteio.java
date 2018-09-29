import javax.swing.JOptionPane;
import java.util.Random;
public class Sorteio {
   public static void main(String args[]) {
          Random rnd = new Random();
          int x = rnd.nextInt(100);

          int numero;
          String n; 
           
          do {
             n = JOptionPane.showInputDialog(null, "Informe o número");
             numero = Integer.parseInt(n);

             if (numero > x)
                JOptionPane.showMessageDialog(null, "Menor");
             if (numero < x)
                JOptionPane.showMessageDialog(null, "Maior");

         } while (numero != x);

          JOptionPane.showMessageDialog(null, "Acertou!!!");
          System.exit(0);
    }
}       
          

          
  
          
