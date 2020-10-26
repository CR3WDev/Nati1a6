package Desafio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        Cargos c = new Cargos();

        System.out.println("Bem vindo ao meu");

        String name;
        int op =0;
        double values;
        int x , y;

        //menu para adicionar cargos e funcionarios
        while(true){
            System.out.println();
            System.out.println("Digite 1 para poder adicionar cargo");
            System.out.println("Digite 2 para poder adicionar funcionario");
            System.out.println("Digite 3 para poder calcular salario de determinado cargo");
            System.out.println("Digite 4 para poder exibir o vetor de funcionarios");
            System.out.println("Digite 5 para poder sair");
            op = in.nextInt();

            if(op == 1){
                System.out.println("Insira o salario que deseja por a esse cargo");
                values = in.nextDouble();
                c.setCargo(values);
            }

            if(op == 2){

                System.out.println("Insira o nome");
                name = in.next();
                System.out.println("Insira o codigo de cargo");
                x = in.nextInt();
                System.out.println("Insira o codigo do funcionario");
                y = in.nextInt();
                c.cadastrarFuncionario(name , x , y);

            }

            if(op == 3){
                System.out.println("Digite o cargo que deseja verificar");
                x = in.nextInt();
                c.calcularSalario(x);

            }

            if(op == 4){

                c.showFuncionarios();

            }

            if(op == 5) break;

        }
    }
}