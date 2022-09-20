import java.util.Scanner;

public class NumeroPrimo {
 
    Scanner prompt = new Scanner(System.in);
    int n = prompt.nextInt();
    int x, cont;
    
    public void NumeroPrimo() {
 
        n = prompt.nextInt();
        
        for(int i = 0; i < n; i++) {
            cont = 0;
            x = prompt.nextInt();
            for (int j = 2; j < x; j++) {
        		if (x % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(x + " eh primo");
        	else System.out.println(x + " nao eh primo");
        }
        
    }
 
}
