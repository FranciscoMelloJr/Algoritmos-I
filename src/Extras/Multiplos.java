package Extras;

import javax.swing.JOptionPane;
public class Multiplos {

	public static void main(String[] args) {
		String num1, num2;	
		int n1, n2;
		num1 = JOptionPane.showInputDialog("Insira o primeiro n�mero: ");
		n1 = Integer.parseInt(num1);
		num2 = JOptionPane.showInputDialog("Insira o segundo n�mero: ");
		n2 = Integer.parseInt(num2);
		
		if (n1%n2 == 0) {
			JOptionPane.showMessageDialog(null, "O primeiro � multiplo do segundo!");
		} else 
			JOptionPane.showMessageDialog(null, "O primeiro n�o � multiplo do segundo!");	
	}

}
