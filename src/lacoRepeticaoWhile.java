import java.util.Scanner;

public class lacoRepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; //tamanho da matriz
        System.out.println("Digite 5 números: ");
        int index = 0; // Inicializa o índice antes do laço

        while (index < numeros.length) { // Condição do laço
            System.out.println("Número da posição " + index + ":");
            numeros[index] = scanner.nextInt(); // Aguarda o usuário digitar
            index++; // Incrementa o índice manualmente
        }






    }
}
