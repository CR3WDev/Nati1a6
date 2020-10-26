package Desafio02;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner prompt = new Scanner(System.in);
      System.out.println("Digite o primeiro valor");
      int a = prompt.nextInt();
      System.out.println("Digite o segundo valor");
      int b = prompt.nextInt();
      Maior maior = new Maior();
      System.out.println(maior.numeros2(a,b));
   }

}

