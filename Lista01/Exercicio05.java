/*

5) Utilizando os conceitos de classe abstrata, crie classes para uma biblioteca. A classe abstrata
base deverá se chamar Livro e terá um atributo titulo, sendo que o método getter deste atributo
será implementado pela classe abstrata. A classe abstrata terá também a assinatura do método
setter do titulo e será implementada pelas classes herdadas. Implementar duas classes que
herdarão de Livro: LivroGratuito e LivroPago. A classe LivroGratuito irá definir o atributo titulo ao
implementar o método setter com um parâmetro String. Na classe LivroPago devemos definir
também o método setter do atributo titulo e também métodos getter/setter para o valor do livro.
Criar, por fim, uma classe Biblioteca que será utilizada para criar instâncias de LivroGratuito e
LivroPago e definir seus atributos bem como exibir em tela. Não há necessidade de uso de Scanner
neste exercício, tudo pode ser definido no método principal da classe Biblioteca.


*/

public class Exercicio05 {

    public static class Livro{

        String titulo;

        public String getTitulo(){
            return this.titulo;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

    }

    public static class LivroGratuito extends Livro{

        

    }

    public static class LivroPago extends Livro{

        float valor;

        public float getValor(){
            return this.valor;
        }

        public void setValor(float valor){
            this.valor = valor;
        }

    }

    public class Biblioteca{
        

        public static void main(String[] args) {
            LivroGratuito livroGratuito = new LivroGratuito();
            livroGratuito.setTitulo("Guidorizzi");
            System.out.printf("O livro %s eh gratuito\n", livroGratuito.getTitulo());


            LivroPago livroPago = new LivroPago();
            livroPago.setTitulo("Game of Thrones");
            livroPago.setValor(39);
            System.out.printf("O livro %s custa %f\n", livroPago.getTitulo(), livroPago.getValor());
        }
    }
}
