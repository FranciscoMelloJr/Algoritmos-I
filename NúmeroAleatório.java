import java.util.Random;
import javax.swing.JOptionPane;
public class N�meroAleat�rio {

	public static void main(String[] args) {
		String num;
		Random rnd = new Random();
		int n, x = rnd.nextInt(100);
		System.out.println(x);
		do {
		num = JOptionPane.showInputDialog("N�mero: ");
		n = Integer.parseInt(num);
		if (n>x)  
			JOptionPane.showMessageDialog(null, "Menor");
		if (n<x)
			JOptionPane.showMessageDialog(null, "Maior");
		if (x==n) 
			JOptionPane.showMessageDialog(null, "Acertou!");
		} while (n!=x);
	}		
}