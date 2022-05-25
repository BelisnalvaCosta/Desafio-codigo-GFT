package me.dio;

import java.util.Scanner;

//A fórmula de Binet é uma forma de calcular números de Fibonacci.
//Dado um número natural n, calcular o valor de Fibonacci(n).
//A entrada é um número natural n(0 < n =< 80). Ou qualquer número que você deseja realizar o calculo.

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.Fibonacci(sc.nextDouble()));
    }

    public double Fibonacci(double x) {
        if(x==0 || x == 1)
            return x;
        return Fibonacci(x-1) + Fibonacci(x-2);
    }
}
