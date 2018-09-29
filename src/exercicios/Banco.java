package exercicios;
import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
			String menu;
			double valor = 0 , saldo = 0;
			int m;
			do {
			menu = JOptionPane.showInputDialog("1-Saldo \n 2-Saque \n 3-Depósito \n 4-sair"); 
			m = Integer.parseInt(menu);
			if (m != 4) {
				if(m == 1) {
					System.out.println("Seu saldo é de: "+saldo);
			}
				if(m == 2) {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para Saque: "));
					saldo = saldo-valor; 
			}
				if (m == 3) {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para Depósito: "));
					saldo = saldo+valor;
			}
		}
				}while(m!= 4); 
	}
}