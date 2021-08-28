import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in); 
        int codigo;  
        do { 
            System.out.print("Informe o código: "); 
            codigo = teclado.nextInt();
            if(codigo != -1){       
                System.out.println("Código: " + codigo); 
            }
            
        } while (codigo != -1);
        
    }

}


/*O programa A está correto e a solução B que é a incorreta está corrigida acima
 * onde foi usado o if, que caso o valor do código seja diferente de -1 o programa
 * continuará se repetindo, até que seja digitado -1 para fechar o programa.
 */ 
