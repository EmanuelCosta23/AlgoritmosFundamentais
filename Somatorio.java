import java.util.Scanner;

public class Somatorio {
    
    Scanner prompt = new Scanner(System.in);
    int n, soma = 0, numero, i = 0;
    
    public void Somatorio() {
        System.out.print("Quantos numeros a serem somados: ");
        int n = prompt.nextInt();
        while(i < n) {
            i++;
            System.out.println("Entre com o " + i + "°numero");
            numero = prompt.nextInt();
            soma += numero;
        }
        System.out.println("A soma da: " + soma);
    }
}
