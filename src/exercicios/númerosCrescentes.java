package exercicios;
import javax.swing.JOptionPane;
public class n�merosCrescentes {

	public static void main(String[] args) {
		String num;
		int maior, n, x, menor, medio;
		byte i;
		x = 0;
		maior = 0;
		menor = 999999999;
		for (i=1; i<=3; i++) {
		num = JOptionPane.showInputDialog("Insira o "+i+" n�mero");
		n = Integer.parseInt(num);
		x = x+n;
		if (n>maior) 
			maior = n;
		if (n<menor)
			menor = n;
		}
		medio = x-(maior+menor);
		JOptionPane.showMessageDialog(null, "Menor: "+menor+"\nM�dio: "+medio+"\nMaior: "+maior);
			}	
		}