package max;

public class Teste {
    public static void main(String args[]) {
          int a, b, c;
          
          a=10; b=5; c=3;

          for (int i=1; i<=b; i++) {
              c = c + i;
          }

          a = a + c;

          while (b < a) {
              b = b + 1;
          }
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);

     }
}     