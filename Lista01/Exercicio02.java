/**
2) Escreva um programa que irá receber do usuário três números e irá calcular e exibir em
métodos separados: a soma deles, o produto dos três números, a média deles, os números
ordenados (usando if/else). O nome da classe deve ser Exercicio02.java.
*/

import java.util.Scanner;


public class Exercicio02 {
    
    static int soma(int numbers[]){
        return (numbers[0] + numbers[1] + numbers[2]);
    }

    static int produto(int numbers[]){
        return (numbers[0] * numbers[1] * numbers[2]);
    }

    static int media(int numbers[]){
        return ((numbers[0] + numbers[1] + numbers[2])/3);
    }
    // Função de ordenação feita usando apenas if/else como requisitado
    static int[] ordem(int numbers[]){
        int[] ordem = new int[3];

        if(numbers[0] < numbers[1] && numbers[0] < numbers[2]){
            ordem[0] = numbers[0];
            if(numbers[1] < numbers[2]){
                ordem[1] = numbers[1];
                ordem[2] = numbers[2];
                return ordem;
            }else{
                ordem[1] = numbers[2];
                ordem[2] = numbers[1];
                return ordem;
            }    
        }

        if(numbers[1] < numbers[0] && numbers[1] < numbers[2]){
            ordem[0] = numbers[1];

            if(numbers[0] < numbers[2]){
                ordem[1] = numbers[0];
                ordem[2] = numbers[2];
                return ordem;
            }else{
                ordem[1] = numbers[2];
                ordem[2] = numbers[0];
                return ordem;
            }    
        }

        if(numbers[2] < numbers[0] && numbers[2] < numbers[1]){
            ordem[0] = numbers[2];

            if(numbers[0] < numbers[1]){
                ordem[1] = numbers[0];
                ordem[2] = numbers[1];
                return ordem;
            }else{
                ordem[1] = numbers[1];
                ordem[2] = numbers[0];
                return ordem;
            }    
        }
        return ordem;
    }
    
    public static void main(String[] args) {
        int numbers[] = new int[3];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Digite um numero: ");
		    numbers[i] = scan.nextInt();
        }
        scan.close();

        System.out.printf("soma : %d\n", soma(numbers));
        System.out.printf("produto : %d\n", produto(numbers));
        System.out.printf("media : %d\n", media(numbers));

        int[] ordered_num = ordem(numbers);
        System.out.printf("ordem : %d %d %d\n", ordered_num[0], ordered_num[1], ordered_num[2]);
    }

}
