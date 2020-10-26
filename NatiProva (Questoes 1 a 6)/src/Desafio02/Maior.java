package Desafio02;

public class Maior {
    public double  numeros2(int a , int b){
        double aa = Double.parseDouble(String.valueOf(a));
        double bb = Double.parseDouble(String.valueOf(b));

        return ((aa+bb)/2) +  Math.abs((aa-bb)/2);

    }
}
