import javax.swing.JOptionPane;

public class Soma {
    public static void main(String args[]) {
       String num1, num2;
       
       double n1, n2, soma, sub, multi;

       num1 = JOptionPane.showInputDialog("Insira o primeiro número");

       num2 = JOptionPane.showInputDialog("Insira o segundo número");       

       n1 = Double.parseDouble(num1);
       n2 = Double.parseDouble(num2);

       soma = n1 + n2;
       sub = n1 - n2;
       multi = n1 * n2;

       JOptionPane.showMessageDialog(null, "A soma é: "+soma+"\n A subtração é: "+sub+"\n A multiplicação é: "+multi);  


       System.exit(0); 

    }
} 
