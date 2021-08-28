public class main {

    public static void main(String[] args) throws  IOException {

  	  Scanner ler = new Scanner(System.in);    
      
  	  int n1, n2, nq, n, s;
    	  n1 = 1;
    	  n2 = 0;
    	  System.out.println("Digite um número: ");
    	  n = ler.nextInt();
    	  s = n + 1;
    	  for(int i = 0; i < s; i++){
    	  System.out.println (n2);
    	  nq = n2;
    	  n2 = n1 + n2;
    	  n1 = nq;
    	 }
    }
    	    
}
