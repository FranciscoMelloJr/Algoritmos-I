// Testando o incremento
public class TipoDado {
   public static void main(String args[]) { /* M�todo principal */

      boolean fim_do_arquivo = false;
      int c = 21;
      int AnguloEmGraus = -45;
      double Valor = 54.10; 

      int x = 5;
      int y = ++x; // Coment�rio

      System.out.println("Valor de x: "+x);
      System.out.println("Valor de y: "+y);
      System.out.println("Valor de valor: "+Valor);
      System.out.println("valor de fim_do_arquivo: "+fim_do_arquivo);
      System.out.println("valor de AnguloEmGraus: "+AnguloEmGraus);
      System.out.println("Operador relacional: "+(c != x));
   }
}
 