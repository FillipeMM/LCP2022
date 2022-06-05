import java.util.ArrayList;
import java.util.List;

public class Exercicio07 {


    public static class Aluno{

        String ra;
        String nome;
        String curso;
        int idade;

        public Aluno(String ra, String nome, String curso,int idade){
            this.nome = nome;
            this.ra = ra;
            this.curso = curso;
            this.idade = idade;
        }
    }
    public static Aluno removeAluno(String ra, List<Aluno> lista){
        for(Aluno aluno : lista){
            if(aluno.ra == ra){
                return aluno;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Aluno aluno = new Aluno(ra, nome, curso, idade);
        List<Aluno> lista = new ArrayList<Aluno>();
        Aluno aluno1 = new Aluno("123", "Fillipe", "Comp", 23);
        Aluno aluno2 = new Aluno("111", "Bruno", "Comp", 22);
        Aluno aluno3 = new Aluno("122", "Mike", "Comp", 20);
        
        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        System.out.println("Lista Inicial");
        for(Aluno aluno: lista){
            System.out.printf("Nome:%s Curso:%s\nRA:%s Idade%d\n", aluno.nome,aluno.curso,aluno.ra, aluno.idade);
            System.out.println(); 
        }
        
        Aluno removeAluno = removeAluno("122", lista);
        if (removeAluno != null){
            lista.remove(removeAluno);
        };
        System.out.println("Lista Final");
        for(Aluno aluno: lista){
            System.out.printf("Nome:%s Curso:%s\nRA:%s Idade:%d\n", aluno.nome,aluno.curso,aluno.ra, aluno.idade);
            System.out.println();
        }

    }
}
