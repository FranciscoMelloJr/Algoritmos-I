package max;

import javax.swing.JOptionPane;
public class Fatorial {

	public static void main(String[] args) {
		String num;
		int n, f;
		byte i;
		num = JOptionPane.showInputDialog("Insira o número");
		n = Integer.parseInt(num);
		f = 1;
		for (i=1; i<=n; i++) {
		f = f*i;
		}
		JOptionPane.showMessageDialog(null, "O valor fatorial é: "+f);
	}
}