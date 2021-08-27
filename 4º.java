import java.util.Scanner;

public class main {

    public static void main(String[] args){

        String nome; 
        int quantidade; 
        double p;
        Scanner ler = new Scanner(System.in);
  
            System.out.println("Digite o nome do produto: ");
            nome = ler.nextLine();
            System.out.println("Digite o valor: ");
            p = ler.nextDouble();
            System.out.println("Digite a quantidade: ");
            quantidade = ler.nextInt();
       
            System.out.println("Dados da compra:");
            if(quantidade >= 11 && quantidade <= 20){

                p = p * quantidade;
                p = p - (p * 10) / 100;

                System.out.println("Nome do produto: "+nome);
                System.out.println("A quantidadeidade de produto: "+quantidade);
                System.out.println("p total: "+p);

            }else if(quantidade >= 21 && quantidade <= 50){
                        
                p = p * quantidade;
                p = p - (p * 20) / 100;

                System.out.println("Nome do produto: "+ nome);
                System.out.println("Quantidades de produtos: "+ quantidade);
                System.out.println("Preço total: "+ p);

            }else if(quantidade > 50){
                    
                p = p * quantidade;
                p = p - (p * 25) / 100;

                System.out.println("Nome do produto: "+ nome);
                System.out.println("Quantidades de produtos: "+ quantidade);
                System.out.println("Preço total: "+ p);

            }else{

                p = p * quantidade;
                System.out.println("Nome do produto: "+ nome);
                System.out.println("Quantidades de produtos: "+ quantidade);
                System.out.println("Preço total: "+ p);

            }
    }
}
