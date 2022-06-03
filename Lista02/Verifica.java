
/*

6) Utilizando expressões regulares, criar um validador de RG, sendo este formato:
PARTE1.PARTE2.PARTE3-DÍGITOVERIFICADOR. Com as seguintes regras:
PARTE1 é composta por um ou dois dígitos;
PARTE2 e PARTE3 possuem exatamente 3 dígitos.
DÍGITOVERIFICADOR será um dígito ou “X”.
Com isso, deverá ser exibido pelo programa se o RG é válido ou não. O programa deverá se chamar
Verifica.java.
*/
import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rg = scan.nextLine();
        scan.close();
        String regex_rg = "[0-9]{1,2}\\.[0-9]{3}\\.[0-9]{3}-x|[0-9]";
        if(rg.matches(regex_rg)){
            System.out.println("RG eh valido");
            return;
        }
        System.out.println("RG nao eh valido");
    }
}
