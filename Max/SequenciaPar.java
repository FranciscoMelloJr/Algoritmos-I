public class SequenciaPar {
    public static void main(String args[]) {

       int num = 1;
       int resto;
       
       while (num <= 10) {
           resto = num%2;
           
           if (resto == 0)
              System.out.println("O número "+num+" é par");
           
           num++;
       }        

    }
} 
