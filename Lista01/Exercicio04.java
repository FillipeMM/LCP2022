/*

4) Implementar o conceito de herança considerando uma superclasse Animal e subclasses
Cachorro, Gato e Passaro. As características comuns a todos os animais devem estar na
superclasse Animal, enquanto métodos específicos devem ser implementados nas subclasses
conforme regras abaixo:
• Cachorro: Possui nome e idade, emite som “Au au”, pode correr.
• Gato: Possui nome e idade, emite som “Miau”, pode correr e pular.
• Passaro: Possui nome e idade, emite som “Piu”, pode voar.
Além disso, criar uma classe para testar os animais com o nome ChamaAnimal que deverá
instanciar objetos referentes a cada um e que use seus respectivos métodos com polimorfismo,
ou seja, para cada animal os métodos devem ser chamados com o mesmo nome


*/


public class Exercicio04 {

    public static class Animal{

        String nome;
        int idade;

        public String getNome(){
            return this.nome;
        }

        public int getIdade(){
            return this.idade;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

        

    }


    public static class Cachorro extends Animal{

        public void emiteSom(){
            System.out.println("Cachorro faz Au Au");
        }

        public void acao(){
            System.out.println("Cachorro pode correr");
        }

    }

    public static class Gato extends Animal{

        public void emiteSom(){
            System.out.println("Gato faz Miau");
        }

        public void acao(){
            System.out.println("Gato pode correr e pular");
        }

    }

    public static class Passaro extends Animal{

        public void emiteSom(){
            System.out.println("Passaro faz Piu");
        }

        public void acao(){
            System.out.println("Passaro pode voar");
        }

    }

    public static class ChamaAnimal{

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();
    }



    public static void main(String[] args) {

        ChamaAnimal animal = new ChamaAnimal();

        animal.cachorro.setNome("Puppy");
        animal.cachorro.setIdade(5);
        System.out.printf("Cachorro %s de %d anos\n", animal.cachorro.getNome(), animal.cachorro.getIdade());
        animal.cachorro.emiteSom();
        animal.cachorro.acao();

        animal.gato.setNome("Kitten");
        animal.gato.setIdade(6);
        System.out.printf("Gato %s de %d anos\n", animal.gato.getNome(), animal.gato.getIdade());
        animal.gato.emiteSom();
        animal.gato.acao();


        animal.passaro.setNome("birdo");
        animal.passaro.setIdade(2);
        System.out.printf("Passaro %s de %d anos\n", animal.passaro.getNome(), animal.passaro.getIdade());
        animal.passaro.emiteSom();
        animal.passaro.acao();
        
    }
}
