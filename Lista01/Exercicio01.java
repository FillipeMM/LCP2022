/**
1) Escreva um programa que receba um número inteiro i entre 1 e 20 como entrada pelo usuário
(utilizando Scanner) e que imprima asteriscos de 1 a i no console em cada linha. Por exemplo, se
a entrada for 3, a saída deve ser:
*
**
***
Caso i não seja um número entre 1 e 20 deve-se exibir uma mensagem informando ao usuário que
o número inserido é inválido. O nome da classe deve ser Exercicio01.java

*/

import java.util.Scanner;

public class Exercicio01 {


    // Função recursiva para fazer o print de cada vez 1 asterisco a mais
    public static void printChar(int maxNum, int index){
        // Regra de retorno da função recursiva
        if(index > maxNum) return;
        //Loop principal para o print
        for(int i=0; i< index; i++){
            System.out.print("*");
        }
        System.out.print("\n");
        printChar(maxNum, index+1); // Recursão passando o indice +1
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro de 1 a 20: ");
		int num = scan.nextInt();
        scan.close();

        if(num <1 || num >20){
            System.out.print("O numero inserido deve ser de 1 a 20");
            return;
        }
        // chamada inicial da função recursiva
        printChar(num,1);
    }
    
}

