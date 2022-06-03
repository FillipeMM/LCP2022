/*
1) Escreva um programa que receba um nome completo em qualquer tipo de capitalização e
devolva o nome completo com apenas a primeira letra de cada nome maiúscula e as demais
minúsculas. Além disso, deve-se tratar para que as preposições "da", "de" e "do" fiquem
minúsculas. Por exemplo, se a entrada for: “JOÃO CARLOS DA sILVA”, a saída será: “João Carlos da
Silva”. O nome da classe deverá ser Exercicio01.java.

*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();

        String palavraFinal = "";
        String listaEsp = "da de do";

        palavra = palavra.toLowerCase();
        String[] listaPalavras = palavra.split(" ");

        for (String pal: listaPalavras) {
            String newPal = "";
            if (!listaEsp.contains(pal)) {
                newPal += Character.toUpperCase(pal.charAt(0));
            } else {
                newPal += pal.charAt( 0);
            }
            for (int i = 1; i < pal.length(); i++) {
                newPal += pal.charAt(i);
            }

            palavraFinal += newPal+" ";
        }        
        System.out.printf("%s", palavraFinal);
    }
}
