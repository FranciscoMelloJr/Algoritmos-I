package max;

public class Media {
    public static void main(String args[]) {

       double nota1, nota2, nota3, media;    

       nota1 = 7.8;
       nota2 = 8.7;
       nota3 = 7.2;

       media = (nota1 + nota2 + nota3) / 3;

       if (media >= 7) 
          System.out.println("Aprovado");
       else
          if (media >= 4 && media < 7) 
             System.out.println("Recuperação");
          else
             System.out.println("Reprovado");

    }
} 
