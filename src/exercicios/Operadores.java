package exercicios;
import javax.swing.JOptionPane;
public class Operadores {

	public static void main(String[] args) {
		String num1, num2;
		double n1, n2;
		
		num1 = JOptionPane.showInputDialog("Insira o primeiro número");
		num2 = JOptionPane.showInputDialog("Insira o segundo número");
		
		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
		
		System.out.println("O valor da soma dos dois números é: " + (n1+n2));
		if (n1>n2) {
			System.out.println("O valor da diferença dos dois números é: " + (n1-n2));
		} else  {
			System.out.println("O valor da diferença dos dois números é: " + (n2-n1));
		}
		System.out.println("O valor do produto dos dois números é :" + (n1*n2));
		if (n1>n2) {
		System.out.println("O valor do quociente dos dois números é :" + (n1/n2));
		} else
			System.out.println("O valor do quociente dos dois números é :"+ (n2/n1));
	}
	

}
