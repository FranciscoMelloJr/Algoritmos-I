package exercicios;
import javax.swing.JOptionPane;
public class GotasRem�dio {

	public static void main(String[] args) {
		String x;
		double peso, gotas;
		x = JOptionPane.showInputDialog(null, "Insira o peso da crian�a: ");
		peso = Double.parseDouble(x);
		gotas = (peso*2.5);
		JOptionPane.showMessageDialog(null, "A crian�a deve tomar: "+gotas+" gotas");
	}
}