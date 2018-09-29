import javax.swing.JOptionPane;
public class Conta {
    public static void main(String args[]) {
       String v,opcao;

       Double saldo, valor;
       int op;

       saldo = 0.0;

       do {
          opcao = JOptionPane.showInputDialog(null, "(1) Saldo \n (2) Saque \n (3) Depósito \n (4) Sair");
          op = Integer.parseInt(opcao);

          if (op == 1)
              JOptionPane.showMessageDialog(null, "Saldo: "+saldo);
          else if (op == 2) {
               v = JOptionPane.showInputDialog(null, "Valor");
               valor = Double.parseDouble(v);
               saldo = saldo - valor;
               }
               else if (op == 3) {
                    v = JOptionPane.showInputDialog(null, "Valor");
                    valor = Double.parseDouble(v);
                    saldo = saldo + valor;
                    }
                    
        } while (op != 4);

        System.exit(0);
   }
}                  
