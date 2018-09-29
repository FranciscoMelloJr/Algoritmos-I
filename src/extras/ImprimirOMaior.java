package extras;

import javax.swing.JOptionPane;
public class ImprimirOMaior {
	
	public static void main(String[] args) {
		String num = null;
		int maior, i, n;
		maior = 0;
		for (i=1; i<=10; i++) {	
			num = JOptionPane.showInputDialog("Insira o "+i+" número: ");
			n = Integer.parseInt(num);
			if (n>maior) 
				maior = n;
		}
			JOptionPane.showMessageDialog(null,"O maior número é: "+maior);		
	}
}