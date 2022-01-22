package Descrição;

import Dados.Lista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {
    static Lista lista = new Lista();

    public static void main(String[] args) throws Exception {
        System.out.println("---Diario de Classe---");

        int option;


        do {
            System.out.println("1 - Cadastro do Aluno");
            System.out.println("2 - Lista de Presença");
            System.out.println("3 - Sair ");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Selecione a opção desejada: ");
            option = scanner.nextInt();

            process(option);
        } while (option != 3);
    }


    public static void process(int option) throws Exception {
        switch (option) {
            case 1:

                Scanner scanner = new Scanner(System.in);

                System.out.print("Data: ");
                String dia = scanner.nextLine();


                System.out.print("Nome do aluno: ");
                String nome = scanner.nextLine();


                System.out.print("Comparecimento: ");
                String comparecimento = scanner.nextLine();

                System.out.print("Numero na Chamada: ");
                int numero = scanner.nextInt();


                System.out.println("--------------------");

                Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dia);

                Alunos novoAluno = new Alunos();

                novoAluno.setDia(data);
                novoAluno.setNome(nome);
                novoAluno.setComparecimento(comparecimento);
                novoAluno.setNumero(numero);

                Lista.addNovoAluno(novoAluno);

                break;

            case 2: {
                List<Alunos> listadeAlunos = Lista.getAlunosList();

                for (Alunos aluno : listadeAlunos) {
                    System.out.println("Lista de Presença:");
                    System.out.println("--- Dia: " + aluno.getDia());
                    System.out.println("---Nome do Aluno: " + aluno.getNome());
                    System.out.println("---Número na chamada: " + aluno.getNumero());
                    System.out.println("---Comparecimento: " + aluno.getComparecimento());
                    System.out.println("-----------------------------");
                }
                break;
            }
        }
    }
}