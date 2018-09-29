import javax.swing.JOptionPane;
public class Teste2 {
   public static void main(String args[]) {
     int numero; 
     double total;
     String n;
        
     n = JOptionPane.showInputDialog("Número: ");
     numero = Integer.parseInt(n);
  
     if (numero >= 100) {
       total = numero / 2;
       JOptionPane.showMessageDialog(null, "Resultado: "+total);
     } else {
       total = numero * 2;
       System.out.println("Total: "+total);
     }
     System.exit(0);         
  }
}
     