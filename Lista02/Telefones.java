/*

5) Escreva um programa que irá receber do usuário um número de telefone e irá formatá-lo de
acordo com as condições: o número recebido será no formato (XX) XXXXX-XXXX ou (XX) XXXX-XXXX,
se for no primeiro formato devemos exibir mensagem de que este é um número de telefone
celular e se for no segundo formato exibir que é um telefone residencial. Além disso, devemos
exibir uma mensagem: “O DDD é XX e o telefone é XXXXXXXX” através do método Split (sendo o
número do telefone exibido em 8 ou 9 caracteres de acordo com a entrada do usuário). O nome
da classe deve ser Telefones.java.
*/

import java.util.Scanner;

public class Telefones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String telefone = scan.nextLine();
        scan.close();
        String regex_cel = "\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}";
        String regex_tel = "\\([0-9]{2}\\)[0-9]{4}-[0-9]{4}";

        if(telefone.matches(regex_cel)){
            System.out.println("Numero eh de celular");
            // return;
        }

        if(telefone.matches(regex_tel)){
            System.out.println("Numero eh de telefone");
            // return;
        }
        String vals[] = telefone.split("\\)");
        System.out.printf("O DDD é %s e o telefone é %s", vals[0].substring(1), vals[1]);
    }
}
