import javax.swing.JOptionPane;

public class Soma {
    public static void main(String args[]) {
       String num1, num2;
       
       double n1, n2, soma, sub, multi;

       num1 = JOptionPane.showInputDialog("Insira o primeiro n�mero");

       num2 = JOptionPane.showInputDialog("Insira o segundo n�mero");       

       n1 = Double.parseDouble(num1);
       n2 = Double.parseDouble(num2);

       soma = n1 + n2;
       sub = n1 - n2;
       multi = n1 * n2;

       JOptionPane.showMessageDialog(null, "A soma �: "+soma+"\n A subtra��o �: "+sub+"\n A multiplica��o �: "+multi);  


       System.exit(0); 

    }
} 
