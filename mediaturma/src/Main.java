import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade, aprovados = 0;
        double nota, soma = 0, maiorNota = 0;

        System.out.print("Quantos alunos tem na turma? ");
        quantidade = entrada.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = entrada.nextDouble();

            soma = soma + nota;

            if (i == 1 || nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota >= 6) {
                aprovados++;
            }
        }

        System.out.println("\nResultados da turma:");
        System.out.println("Media da turma: " + (soma / quantidade));
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Alunos aprovados: " + aprovados);

        entrada.close();
    }
}
