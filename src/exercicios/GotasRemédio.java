package exercicios;
import javax.swing.JOptionPane;
public class GotasRemédio {

	public static void main(String[] args) {
		String x;
		double peso, gotas;
		x = JOptionPane.showInputDialog(null, "Insira o peso da criança: ");
		peso = Double.parseDouble(x);
		gotas = (peso*2.5);
		JOptionPane.showMessageDialog(null, "A criança deve tomar: "+gotas+" gotas");
	}
}