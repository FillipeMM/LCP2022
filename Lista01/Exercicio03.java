/**

3) Escreva um programa de cálculo de contribuição que envolva contribuições em cima do salário
do funcionário que serão pagam tanto pelo próprio funcionário como pela empresa. Esta
contribuição será feita somente em cima de um salário de até R$5000, ou seja, se o funcionário
recebe até R$5000, a contribuição será em cima do salário todo, mas caso ele receba R$6000, por
exemplo, a incidência de imposto recairá sobre R$5000, mas os R$1000 excedentes não serão
impactados. A cobrança leva em conta a idade do funcionário e segue a Tabela:

Com isso, o programa irá utilizar como atributos o nome, idade e salário de um funcionário e fará
o cálculo das contribuições da empresa e do funcionário conforme as regras definidas
anteriormente, bem como qual será o salário que o funcionário irá receber descontando o valor
da sua própria contribuição. No método main da classe Exercicio03, implementar ao menos 1
objeto para cada faixa etária (definindo no corpo do código e não recebendo via Scanner) e exibir
as informações através da sobreposição do método toString


*/

public class Exercicio03 {
   

    public static class Funcionario{

        String nome;
        int idade;
        double salario;

        public Funcionario(String nome, int idade, double salario){
            setNome(nome);
            setIdade(idade);
            setSalario(salario);
        }


        public void setNome(String nome){
            this.nome = nome;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

        public void setSalario(double salario){
            this.salario = salario;
        }

        public String getNome(){
            return this.nome;
        }

        public int getIdade(){
            return this.idade;
        }

        public double getSalario(){
            return this.salario;
        }


        public double[] retornaContribuição(){
            double[] contri = new double[2];
            if(getIdade() <= 30){
                contri[0] = 0.2;
                contri[1] = 0.18;
            }
            if(getIdade() >30 && getIdade() <=40){
                contri[0] = 0.18;
                contri[1] = 0.15;
            }
            if(getIdade() >40 && getIdade() <=50){
                contri[0] = 0.12;
                contri[1] = 0.15;
            }
            if(getIdade() >50 && getIdade() <=60){
                contri[0] = 0.07;
                contri[1] = 0.1;
            }
            if(getIdade() >60){
                contri[0] = 0.03;
                contri[1] = 0.04;
            }
            return contri;
        }

        public void calculaContribuicao(){
            double[] contri = retornaContribuição();
            double contriFunc = contri[0];
            double contriEmp = contri[1];
            
            double salarioContri;
            if(getSalario() <= 5000){
                salarioContri = getSalario()*(1-(contriEmp+contriFunc));
                setSalario(salarioContri);
                return;
            }
            salarioContri = 5000*(1-(contriEmp+contriFunc));
            salarioContri = salarioContri + (getSalario()-5000);
            setSalario(salarioContri);
            return;
        }

        public String toString(){
            return getNome() + " de " + getIdade() + " possui salario de " + getSalario();
        }

    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Fillipe", 23, 7000);
        func1.calculaContribuicao();

        Funcionario func2 = new Funcionario("Bruno", 31, 3000);
        func2.calculaContribuicao();

        Funcionario func3 = new Funcionario("Miguel", 41, 10000);
        func3.calculaContribuicao();

        Funcionario func4 = new Funcionario("Ana", 51, 4500);
        func4.calculaContribuicao();

        Funcionario func5 = new Funcionario("Maria", 61, 5000);
        func5.calculaContribuicao();


        System.out.printf("%s\n", func1.toString());
        System.out.printf("%s\n", func2.toString());
        System.out.printf("%s\n", func3.toString());
        System.out.printf("%s\n", func4.toString());
        System.out.printf("%s\n", func5.toString());

    }

}
