package extras;

import javax.swing.JOptionPane;
public class Operadores {

	public static void main(String[] args) {

	int x, y;
	double soma, diferenca, produto, quociente;
	x = Integer.parseInt (JOptionPane.showInputDialog("Insira o primeiro número"));
	y = Integer.parseInt (JOptionPane.showInputDialog("Insira o segundo número"));
	soma = x+y;
	produto = x*y;
	if	(x>y)	{
		diferenca = x-y;
		quociente = x/y;
	} else {
		diferenca = y-x;
		quociente = y/x;
	}
		JOptionPane.showMessageDialog(null, "O valor da soma é: "+soma+"\nO valor da diferença é: "+diferenca+"\nO valor do produto é: "+produto+"\nO valor do quociente é: "+quociente);
	}
}