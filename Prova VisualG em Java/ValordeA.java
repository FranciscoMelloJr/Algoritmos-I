package VisualG;

import javax.swing.JOptionPane;

public class ValordeA {

	public static void main(String[] args) {
		String num;
		int n;
		double x, resultado, contador=0, denominador=1;
		num = JOptionPane.showInputDialog("Insira o valor de A: ");
		n = Integer.parseInt(num);
		x = n;
		do {
			resultado = n/denominador;
			n--;
			denominador++;
			contador = contador+resultado;
		}while (denominador<=x);
		JOptionPane.showMessageDialog(null, "Resultado: "+contador);
		}
	}		