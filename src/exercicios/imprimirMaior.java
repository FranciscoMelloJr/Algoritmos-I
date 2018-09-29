package exercicios;
import javax.swing.JOptionPane;
public class imprimirMaior {

	public static void main(String[] args) {
		int n, maior;
		String num;
		byte i;
		maior = 0;
		for (i=1; i<=10; i++) {
			num = JOptionPane.showInputDialog("Insira o "+i+" número: ");
			n = Integer.parseInt(num);
		if (n>maior) {
			maior = n;
		}
		}
		JOptionPane.showMessageDialog(null, "O maior número foi: " + maior);
	}

}
