import javax.swing.JOptionPane;

public class Maior {
    public static void main(String args[]) {
       String num;
       
       int n, i, maior, menor;

       maior = 0;

       for (i=1; i<=5; i++) {

           num = JOptionPane.showInputDialog("Insira o "+i+"� n�mero");

           n = Integer.parseInt(num);

           if (n > maior) 
               maior = n;

       }

       JOptionPane.showMessageDialog(null, "O maior n�mero �: "+maior, "Resultado", JOptionPane.PLAIN_MESSAGE);  

       System.exit(0); 

    }
} 
