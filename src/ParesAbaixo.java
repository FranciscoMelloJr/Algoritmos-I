import javax.swing.JOptionPane;
public class ParesAbaixo {

	public static void main(String[] args) {
		String num;
		int i, n;
		num = JOptionPane.showInputDialog("Número");
		n = Integer.parseInt(num);
		for (i=1; i<n; i++)
			if (i%2==0) {
				System.out.println("O número "+i+" é um número par abaixo do valor inicial!");
			}
				if (n<=2) { 
				System.out.println("Não há numeros pares abaixo do inicial!");
		}	
	}	
}