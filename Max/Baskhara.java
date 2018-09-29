public class Baskhara {
    public static void main(String args[]) {

       double a,b,c,delta;    

       a=5;
       b=10;
       c=2;

       delta=b*b-4*a*c;

       if (delta > 0) {
          double r, x1, x2;
          r = Math.sqrt(delta);
          x1 = (-b - r) / 2*a;
          x2 = (-b + r) / 2*a;
          System.out.println("x1= "+x1);
          System.out.println("x2= "+x2);
           
       }
       else
          System.out.println("A equação não tem raízes reais");

    }
} 
