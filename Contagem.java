import java.util.Scanner;

public class Contagem {
    Scanner prompt = new Scanner (System.in);
    int n, nota, cont = 0, i = 0;
    public void Contagem() {
        System.out.println("Quantidade de alunos: ");
        int n = prompt.nextInt();
        while(i < n) {
            i++;
            System.out.println("Nota do aluno: " + i);
            nota = prompt.nextInt();
            if(nota < 50) {
                cont = cont + 0;
            }else {
                cont++;
            }
        }
        System.out.println(("Sao " + n + " alunos"));
        System.out.println("Sao " + cont + " aprovados");
    }
}