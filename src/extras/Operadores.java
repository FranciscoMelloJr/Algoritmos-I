package extras;

import javax.swing.JOptionPane;
public class Operadores {

	public static void main(String[] args) {

	int x, y;
	double soma, diferenca, produto, quociente;
	x = Integer.parseInt (JOptionPane.showInputDialog("Insira o primeiro n�mero"));
	y = Integer.parseInt (JOptionPane.showInputDialog("Insira o segundo n�mero"));
	soma = x+y;
	produto = x*y;
	if	(x>y)	{
		diferenca = x-y;
		quociente = x/y;
	} else {
		diferenca = y-x;
		quociente = y/x;
	}
		JOptionPane.showMessageDialog(null, "O valor da soma �: "+soma+"\nO valor da diferen�a �: "+diferenca+"\nO valor do produto �: "+produto+"\nO valor do quociente �: "+quociente);
	}
}