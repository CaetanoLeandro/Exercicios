package br.com.lcs.praTi.application;

import br.com.lcs.praTi.model.entity.Student;
import br.com.lcs.praTi.model.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<User> registrationList  = new ArrayList<User>();

        char control = 's';
        int tipoCadastro;

        System.out.println("Escolha o tipo de cadastro, 1 -> Usuário");
        System.out.println("Escolha o tipo de cadastro, 2 -> Aluno");
        tipoCadastro = sc.nextInt();

        switch (tipoCadastro){
            case 1:

                do {
                    System.out.println("Digite o nome: ");
                    String name = sc.next();

                    System.out.println("Digite o Telefone: ");
                    String fone = sc.next();

                    System.out.println("Digite a data de nascimento: ");
                    String birth = sc.next();

                    String register = String.valueOf(LocalDate.now());
                    String lastChange = String.valueOf(LocalDateTime.now());

                    User users =new User(name, fone, birth, register, lastChange);
                    registrationList .add(users);
                    System.out.println("Deseja cadastrar outra pessoa?");
                    control = sc.next().charAt(0);
                }while (control == 's' || control == 'S');

                for (User i: registrationList){
                    System.out.println(i);
                }
                break;

            case 2:

                do {
                    System.out.println("Digite o nome: ");
                    String name = sc.next();

                    System.out.println("Digite o Telefone: ");
                    String fone = sc.next();

                    System.out.println("Digite a data de nascimento: ");
                    String birth = sc.next();

                    System.out.println("Digite a nota do aluno: ");
                    String fGrade = sc.next();

                    String register = String.valueOf(LocalDate.now());
                    String lastChange = String.valueOf(LocalDateTime.now());

                    Student student = new Student(name, fone, birth, register, lastChange, fGrade);
                    registrationList .add(student);
                    System.out.println("Deseja cadastrar outra pessoa?");
                    control = sc.next().charAt(0);
                }while (control == 's' || control == 'S');

                for (User i: registrationList){
                    System.out.println(i);
                }
                break;

            default:
                System.out.println("Valor inválida");
        }
        sc.close();
    }
}