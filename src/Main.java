import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] listaDeCompras = {"Arroz", "Feijão", "Leite", "Pão", "Ovos"};
        System.out.println(listaDeCompras[0]);
        System.out.println(listaDeCompras[4]);
        // System.out.println(listaDeCompras[5]);



        int[][] matriz = {
                {1, 2, 3},      //linha 0
                {4, 5, 6},      //linha 1
                {7, 8, 9},      //linha 2
        };
        System.out.println(matriz[1][1]);

        Scanner scanner = new Scanner(System.in); //System.in = entradas do sistema
        int[] numeros = new int[5];
        System.out.println(numeros[0]);
        numeros[0] = scanner.nextInt(); // guarda o numero digitado pelo usuario
        System.out.println(numeros[0]);
    }
}