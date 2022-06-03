/*
3) Palíndromos são palavras que são idênticas quando lidas da esquerda para a direita ou da direita
para a esquerda. Escrever um programa para ler uma String e retornar se esta é um palíndromo
ou não. Exemplo de palíndromo: SUBINOONIBUS. O nome da classe deverá ser Exercicio03.java.

*/
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();

        palavra = palavra.toLowerCase();
        int tam = palavra.length() - 1;

        // O(n/2) --> n tamanho da palavra
        for (int i = 0; i < palavra.length()/2; i++) {
            if (palavra.charAt(i) == palavra.charAt(tam)) {
                tam--;
            } else {
                System.out.printf("%s Nao eh palindromo", palavra);
                return;
            }
        }
        System.out.printf("%s eh palindromo", palavra);
    }
}
