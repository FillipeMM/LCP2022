/*
4) Escreva um programa para jogar “Jogo da Velha”. Neste caso, o programa irá fazer uso de uma
matriz que irá controlar o jogo e esta deverá ser exibida a cada jogada. Os jogadores jogam em
ordem: Jogador 1, Jogador 2, Jogador 1, e assim sucessivamente, a partir de perguntas no console.
O Jogador 1 será atribuído com o marcador X e o Jogador 2 com o marcador O, sendo espaços
vazios do jogo demarcados como underscore (_). Com isso, a cada jogada, o jogador assinala a
linha e coluna que deseja jogar e é exibido o jogo atual com as posições marcadas de acordo com
todas as jogadas até o momento.
Por exemplo, se na primeira jogada o jogador indicar a posição de linha 0 e de coluna 0, o retorno
no console será:
X _ _
_ _ _
_ _ _
Se na sequência a jogada do jogador 2 for na linha 1 e coluna 1, o retorno no console será:
X _ _
_ O _
_ _ _
*/
import java.util.Scanner;

public class JogoVelha {

    public static void printMatriz(char [][]matriz){
        
        for(int i=0; i<3;i++){
            System.out.printf("%c %c %c\n", matriz[i][0], matriz[i][1], matriz[i][2]);
            
        }
    }

    public static boolean validaHorizontal(char [][]matriz){
        for(int i=0;i<3;i++){
            if (matriz[i][0] == matriz[i][1] && matriz[i][0] == matriz[i][2]
            && matriz[i][0] != '_' && matriz[i][1] != '_' && matriz[i][2] != '_') return true;
        }
        return false;
    }

    public static boolean validaVertical(char [][]matriz){
        for(int j=0;j<3;j++){
            if (matriz[0][j] == matriz[1][j] && matriz[0][j] == matriz[2][j] 
            && matriz[0][j] != '_' && matriz[1][j] != '_' && matriz[2][j] != '_') return true;
        }
        return false;
    }

    public static boolean validaDiagonais(char [][]matriz){
        for(int j=0;j<3;j++){
            if(matriz[1][1] != '_'){
                if (matriz[1][1] == matriz[0][0] && matriz[1][1] == matriz[2][2]) return true;
                if (matriz[1][1] == matriz[0][2] && matriz[1][1] == matriz[2][0]) return true;
            }
        }
        return false;
    }

    public static boolean validaMatriz(char [][]matriz){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matriz[i][j] == '_') return false;
            }
        }
        return true;
    }

    public static boolean isGameOver(char [][]matriz){
        if(validaMatriz(matriz)) return true;
        return false;
    }

    public static boolean isWinner(char [][]matriz){
        if(validaDiagonais(matriz) || validaHorizontal(matriz) || validaVertical(matriz)) return true;
        return false;
     }



    public static char[][] atualizaMatriz(char [][]matriz, int []jogada, char jogador){
        int linha = jogada[0];
        int coluna = jogada[1];

        matriz[linha][coluna] = jogador;

        return matriz;
    }

    public static void main(String[] args) {
        char [][]matriz = { {'_','_','_'}, {'_','_','_'}, {'_','_','_'}};

        Scanner scan = new Scanner(System.in);
        int posicao1;
        int posicao2;

        while(isGameOver(matriz) == false || isWinner(matriz) == false){
            int[] jogada1 = new int[2];
            System.out.println("Jogador 1, digite a linha da sua jogada ");
            posicao1 = scan.nextInt();
            jogada1[0] = posicao1;
            System.out.println("Jogador 1, digite a coluna da sua jogada ");
            posicao1 = scan.nextInt();
            jogada1[1] = posicao1;
            matriz = atualizaMatriz(matriz, jogada1, 'X');
            printMatriz(matriz);
            if(isWinner(matriz)) {
                System.out.println("Jogador 1 eh o vencedor");
                break;
            }
            if(isGameOver(matriz)) break;

            int[] jogada2 = new int[2];
            System.out.println("Jogador 2, digite a linha da sua jogada ");
            posicao2 = scan.nextInt();
            jogada2[0] = posicao2;
            System.out.println("Jogador 2, digite a coluna da sua jogada ");
            posicao2 = scan.nextInt();
            jogada2[1] = posicao2;

            matriz = atualizaMatriz(matriz, jogada2, 'O');
            printMatriz(matriz);
            if(isWinner(matriz)) {
                System.out.println("Jogador 2 eh o vencedor");
                break;
            }
            if(isGameOver(matriz)) break;
        }
        System.out.println("Jogo acabou sem vencedores");

        scan.close();


    }
}
