
import java.util.Scanner;

public class main {

   public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);

   int A, B, C;
   double Delta, X1, X2;
   System.out.println("Digite o valor de A: ");
   A = ler.nextInt();
   while(A == 0) {
       System.out.println("O valor de 'A' não pode ser 0");
       System.out.println("Digite um valor diferente de 0");
       A = ler.nextInt();
   }
   System.out.println("Digite o valor de B: ");
   B = ler.nextInt();
   System.out.println("Digite o valor de C: ");
   C = ler.nextInt();

   Delta = Math.pow(B, 2) - (4 * A * C);

   if (Delta < 0) {
       System.out.println("Não tem raízes reais");
   }else {
       X1 = (-B + Math.sqrt(Delta))/(2 * A);
       X2 = (-B - Math.sqrt(Delta))/(2 * A);

       System.out.println("O valor de x1 é: " + X1);
       System.out.println("O valor de x2 é: " + X2);
   }


   }
}
