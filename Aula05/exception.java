import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aluno[] = {"Aluno 1", "Aluno 2", "Aluno 3"};

        int []notas = new int[3];
        for(int i=0;i<3;i++){
            int nota;
            try{
                System.out.println("Digite uma nota");
                nota = scan.nextInt();
            }catch(InputMismatchException  e){
                System.out.printf("%s\n",e);
                System.out.println("Digite um inteiro");
                scan.next();
                nota = 0;
            }
            notas[i] = nota;

        }
        scan.close();
    }
}
