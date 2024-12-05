import java.util.Scanner;

public class lacoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; //tamanho da matriz
        System.out.println("Digite 5 números: ");
        int index = 0; // Inicializa o índice antes do laço

        //primerio executa e depois avalia
        do {
            System.out.println("Número da posição " + index + ":");
            numeros[index] = scanner.nextInt(); // Aguarda o usuário digitar
            index++;
        }  while (index < numeros.length);

        System.out.println("Números digitados: ");
        index = 0;

        while (index < numeros.length) {
            System.out.println("Número da posição " + index + ": " + numeros[index]);
            index++;
        }
        scanner.close();
    }
}