
package Dados;
import Descrição.Alunos;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static List<Alunos> alunosList = new ArrayList<>();

    public static List<Alunos> getAlunosList() {

        return alunosList;
    }

    public static void addNovoAluno(Alunos aluno){
        alunosList.add(aluno);
    }

} 
