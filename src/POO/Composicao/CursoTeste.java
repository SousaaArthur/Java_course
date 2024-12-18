package POO.Composicao;

public class CursoTeste {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Arthur");
    Aluno aluno2 = new Aluno("Araújo");
    Aluno aluno3 = new Aluno("Sousa");

    Curso curso1 = new Curso("Java Completo");
    Curso curso2 = new Curso("Programador em 6 meses");
    Curso curso3 = new Curso("Python pra preguiçoso");

    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno2);

    curso2.adicionarAluno(aluno1);
    curso2.adicionarAluno(aluno3);

    aluno1.adicionarCurso(curso3);
    aluno2.adicionarCurso(curso3);
    aluno3.adicionarCurso(curso3);

    for(Aluno aluno: curso3.alunos){
      System.out.println("Estou matriculado no curso " + curso3.nome + "...");
      System.out.println(" e o meu nome é: " + aluno.nome + "\n");
    }

    System.out.println(aluno1.cursos.get(0).alunos);

    Curso cursoEcontrado = aluno1.obterCursoPorNome("Java Completo");

    if (cursoEcontrado != null) {
      System.out.println(cursoEcontrado.nome);
      System.out.println(cursoEcontrado.alunos);
    }

  }
}
