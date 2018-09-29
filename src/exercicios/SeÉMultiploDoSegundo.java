package exercicios;
import javax.swing.JOptionPane;
public class SeÉMultiploDoSegundo {

	public static void main(String[] args) {
		String num1, num2;
		int n1, n2;
		num1 = JOptionPane.showInputDialog("Insira o primeiro número");
		n1 = Integer.parseInt(num1); 
		num2 = JOptionPane.showInputDialog("Insira o segundo número");
		n2 = Integer.parseInt(num2); 
		if (n1%n2 == 0)
			System.out.println("O primeiro é múltiplo do segundo!");
		else
			System.out.println("Não é múltiplo!");
	}

}
