package Dados;
import Descrição.Alunos;
import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static Alunos alunosList;
    private List alunosList = new ArrayList<>();



    public List<Alunos> getAlunosList() {

        return alunosList;
    }

    public static void addNovoAluno(Alunos alunos){
        alunosList.add(alunos);
    }

} 