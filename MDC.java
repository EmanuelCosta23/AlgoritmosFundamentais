import java.util.Scanner;

public class MDC {
    Scanner prompt = new Scanner(System.in);
    int a, b, n, mdc;
    public void MDC() {
        System.out.println("Digite um numero:"); 
        a = prompt.nextInt();
        System.out.println("Digite um numero:"); 
        b = prompt.nextInt();

        if(a > b) {
            n = a;
        } else {
            n = b;
        }
    
        for(int i = 1; i <= n; i++){
            if(a % i == 0 && b % i == 0){
                mdc = i;
            }
        }
        System.out.println("O MDC de " + a + " e de " + b + " é " + mdc);
    }  
}
