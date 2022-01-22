
package Descrição;
import java.util.Date;

public class Alunos {
    private int numero;
    private Date dia;
    private String nome;
    private String comparecimento;

    public Alunos(String nome, String dia, int numero, String comparecimento) {
    }

    public Alunos() {
    }

    public Alunos(Alunos aluno) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComparecimento() {
        return comparecimento;
    }

    public void setComparecimento(String comparecimento) {
        this.comparecimento = comparecimento;
    }

    public void add(Alunos alunos) {

    }
}
