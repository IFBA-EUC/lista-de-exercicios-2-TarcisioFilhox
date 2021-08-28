import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String R;
        float C;
        double M, S;
        int I;
        
        M = 0;
        S = 0;
        
        System.out.print("Valor do investimento: ");
        C = ler.nextFloat();
        System.out.print("Taxa de juros mensal: ");
        I = ler.nextInt();
        S = C;

        do{
            for(int A = 1; A <= 12; A++){
                S = S + ((S * I) / 100);
                M = M + S;
            }
            System.out.println("Saldo do investimento após 1 ano: " + M);
            System.out.println("Deseja processar mais um ano? (S/N)");
            R = ler.next();
            S = M;
        }while((R.equals("S")) || (R.equals("s")));
        
        if (R.matches("[N, n]*")){
        System.out.println("Fim.");
        
        
    }
}
}
