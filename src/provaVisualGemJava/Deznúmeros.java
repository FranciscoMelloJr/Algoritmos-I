package provaVisualGemJava;

import javax.swing.JOptionPane;

public class Dezn�meros {

	public static void main(String[] args) {		
		byte i;
		String num;
		int x,n=0,p=0;
		for (i=1; i<=10; i++) {
			num = JOptionPane.showInputDialog("Insira o "+i+" n�mero: ");
			x = Integer.parseInt(num);
			if (x>0) {
				p = p+x;
			} else {
				n = n+1;
			}
		}	
			JOptionPane.showMessageDialog(null, "Soma dos positivos: "+p+"\nQuantidade de negativos: "+n);
		
	}
}