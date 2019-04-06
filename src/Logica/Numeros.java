/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Numeros {

    // Ejercicio 20
    public float metros(float x) {
        return (float) (x * 3.28);
    }

    public String positivoNegativo(int a) {//ejercicio 24
        if (a < 0) {
            return "Es negativo";
        } else if (a > 0) {
            return "Es Positivo";
        } else {
            return "El numero es 0";
        }
    }

    public int siguienteSegundo(int a, int b, int c) {//por revisar
        return 1;
    }

    // Ejercicio 30
    public float[] mayorMenor(float x, float y) {
        float A[] = new float[2];
        if (x < y) {
            A[0] = x;
            A[1] = y;
        } else {
            A[0] = y;
            A[1] = x;
        }

        return A;
    }

    public void cicloDoWhile() {//ejercicio 34
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 11);
    }

    public int sumaNumeros(int a) {//ejercicio 42
        int x = 0;
        for (int i = 0; i <= a; i++) {
            x = x + i;
        }
        return x;
    }

    public int factorial(int a) {//ejercicio 44
        int x = 1;
        for (int i = 1; i <= a; i++) {
            x = x * i;
        }
        return x;
    }

    // Ejercicio 50
    public float[][] sumaMedia() {
        float M[][] = {{0, 0}, {0, 0}};
        int contadorPar = 0, contadorImpar = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                M[0][0] += i;
                contadorPar++;
            } else {
                M[1][0] += i;
                contadorImpar++;
            }
        }
        M[0][1] = M[0][0] / contadorPar;
        M[1][1] = M[1][0] / contadorImpar;
        return M;
    }

    public float sumaNegativos(float a[]) {//ejercicio 52, se le debe pasar un arreglo especificamente de 10 enteros dados por el usuario, por si las moscas inicialicelo en 0 :v
        float x = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] < 0) {
                x = (x + a[i]);
            }
        }
        return x;
    }

    public void arregloPares() {//ejercicio 54
        int[] a = new int[50];
        int i = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                a[i] = j;
                i++;
            }
        }
        for (i = 0; i < 50; i++) {
            System.out.println(a[i]);

        }
    }

    public int posicionArreglo(int a[]) {
        int cont = 0, base = 0;

        for (int i = 0; i < 6; i++) {
            if (a[i] > base) {
                cont = i;
                base = a[i];
            }
        }
        return cont;
    }
}
