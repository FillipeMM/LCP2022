/*

Criar um programa para calcular a soma de números no formato: x + y2 + z3 + w4 , através do
método Math.pow(). O programa deve aceitar entre 1 e 4 parâmetros e calcular de acordo com o
número de entradas, ou seja, se receber 2 parâmetros, por exemplo, deverá então calcular apenas
x + y2 . O nome da classe deverá ser Exercicio07.java

*/

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {

        double numbers[] = new double[4];
        double sum =0;
        System.out.println("Digite até 4 números, caso queira digitar menos que 4 numeros digite 0");
        Scanner scan = new Scanner(System.in);
        for(int i =0; i<4;i++){
            System.out.println("Digite um numero: ");
            numbers[i] = scan.nextFloat();
            if(numbers[i] == 0) break;
            sum = sum + Math.pow(numbers[i], i+1);
        }
        scan.close();
        System.out.printf("Soma final = %f", sum);
    }
}
