import java.util.Scanner;

import java.text.DecimalFormat;

public class main {

    public static void main(String[] args){
    
        double distancia, a1, a2, a3, b1, b2, b3;
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Digite o primeiro ponto: ");
        a1 = ler.nextDouble();
        System.out.println("Digite o segundo ponto: ");
        a2 = ler.nextDouble();
        System.out.println("Digite o terceiro ponto: ");
        a3 = ler.nextDouble();

        System.out.println("Digite o quarto ponto: ");
        b1 = ler.nextDouble();
        System.out.println("Digite o quinto ponto: ");
        b2 = ler.nextDouble();
        System.out.println("Digite o sexto ponto: ");
        b3 = ler.nextDouble();

        distancia = Math.sqrt(Math.pow((b1 - a1), 2) + Math.pow((b2 - a2), 2) + Math.pow((b3-a3), 2));

        System.out.printf("A distancia entre os dois pontos é de: " + df.format(distancia));
        
    }

}
