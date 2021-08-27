import java.io.IOException;

import java.util.Scanner;

public class main {
 	
	public static void main(String[] args) throws  IOException {
		
    Scanner ler = new Scanner (System.in);
    
    int num;
    String digitos;
	  System.out.println("Digite um número: "); 		       
	  num = ler.nextInt();
	
digitos = Integer.toString(num);
System.out.println(" A quantidade de dígitos é: " +digitos.length());

  }
}
