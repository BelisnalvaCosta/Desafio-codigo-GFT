package me.dio;

/*
Este desafio é uma sequência de números inteiros, inciando com 0 e 1, na qual, cada termo subsequente corresponde
à soma dos dois anteriores e assim sucessivamente.
 */
public class FibonacciSequencia {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.printf("%d ", FibonacciSequencia(i));
        }
        System.out.println();
    }
    public static int FibonacciSequencia(int x) {
        if(x == 1)
            return (0);
        if (x == 2)
            return (1);
        int i, F = 0, F1 = 0, F2 = 1;
        for(i=3; i <= x; i++) {
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }
        return (F);
    }
}
