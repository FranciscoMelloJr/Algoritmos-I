import javax.swing.JOptionPane;
public class ParesAbaixo {

	public static void main(String[] args) {
		String num;
		int i, n;
		num = JOptionPane.showInputDialog("N�mero");
		n = Integer.parseInt(num);
		for (i=1; i<n; i++)
			if (i%2==0) {
				System.out.println("O n�mero "+i+" � um n�mero par abaixo do valor inicial!");
			}
				if (n<=2) { 
				System.out.println("N�o h� numeros pares abaixo do inicial!");
		}	
	}	
}