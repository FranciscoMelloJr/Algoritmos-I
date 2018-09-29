package exercicios;
import javax.swing.JOptionPane;
public class SomaAbaixo {

	public static void main(String[] args) {
		String num;
		int n,i,x=0;
		num = JOptionPane.showInputDialog("Insira o número: ");
		n = Integer.parseInt(num);
		for (i=1; i<=n; i++) {
			x = x+i;
		}
		JOptionPane.showMessageDialog(null, "A soma de todos os números de 1 até o valor inserido é: "+x);
	}
}