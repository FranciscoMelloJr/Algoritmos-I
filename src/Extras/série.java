package Extras;

import javax.swing.JOptionPane;

public class s�rie {

	public static void main(String[] args) {
		int a=1, b=0, i, aux, n;
		String num;
		 num = JOptionPane.showInputDialog("Insira o n�mero de s�ries: ");
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