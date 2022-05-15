/*

Criar um programa para identificar se um número atende a seguinte premissa: seja i a
quantidade de dígitos em um número inteiro x, se a soma de cada dígito elevado a potência i for
igual a x, a premissa é verdadeira e deve-se exibir que o número é válido, caso contrário, informar
que o número é inválido. Por exemplo: o número 153 atende a premissa, pois: 13 + 53 + 33 = 153.
O nome da classe deverá ser Exercicio08.java.
Observação: Poucos números inteiros são válidos. Exemplos de números que o resultado será
verdadeiro: 371, 9474, 54748.
Dica: Notem que podemos calcular divisões e resto em Java da seguinte forma:
int a = 12/7; // a = 1
float b = (float) 12/7; // b = 1.7142857
int c = 12%7; // c = 5

*/
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        String numeroTexto;
        int numero;
        int tamanho;
        int sum = 0;

        System.out.println("Digite um numero");
        Scanner scan = new Scanner(System.in);
        numeroTexto = scan.nextLine();
        numero = Integer.parseInt(numeroTexto);
        scan.close();

        tamanho = numeroTexto.length();

        for(int i=0;i<tamanho;i++){
            sum += Math.pow((numeroTexto.charAt(i) - '0'), tamanho);
        }

        if(numero == sum){
            System.out.printf("%d eh um numero valido\n", numero);
        }else{
            System.out.printf("%d NAO eh um numero valido\n", numero);
        }

    }
}
