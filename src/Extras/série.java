package Extras;

import javax.swing.JOptionPane;

public class série {

	public static void main(String[] args) {
		int a=1, b=0, i, aux, n;
		String num;
		 num = JOptionPane.showInputDialog("Insira o número de séries: ");
		 n = Integer.parseInt(num);
		for (i=1; i<=n; i++) {
			System.out.println(a);
			aux = a;
			a = a+b;
			b = aux;
			
		}
				
	}

}

// 112