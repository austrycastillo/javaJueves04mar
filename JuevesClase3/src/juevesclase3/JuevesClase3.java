package juevesclase3;

import java.util.Scanner;

public class JuevesClase3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        /*
//        while(condición){
//            ..instrucciones
//            ajuste
//        }
//         */
//        int num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            num++;//num = num + 1;
//        }
//        //num = 11
//        //pantalla = 1 2 3 4 5 6 7 8 9 10
//
//        //imprimir los números del 500 al 400
//        //de 5 en 5
//        //no quiero mostra el 465 ni el 420
//        int x = 500;
//        while (x >= 400) {
//            if (x != 465 && x != 420) {
//                System.out.println(x);
//            }
//            x -= 5;

        /*
do{
    instrucciones
    ajuste
}while(condición);

         */
        //int y = 500;
//        int y = 2;
//        do {
//            System.out.println(y);
//            y += 2;
//        } while (y <= 20);

        /*
    for(inicio;condición;ajuste){
        instrucciones 
    }
         */
//        for (int i = 5; i < 11; i++) {
//            System.out.println(i);
//        }
        /*
        solicitar al usuario desde teclado 
        dos números, 
        realizar un for con esos datos,
        mostrar las suma de todos esos números
         */
//        
//        System.out.println("Escribe un número");
//        int num1 = teclado.nextInt();
//        System.out.println("Escribe otro número");
//        int num2 = teclado.nextInt();
//        int menor, mayor, suma = 0;
//        if (num1 < num2) {
//            menor = num1;
//            mayor = num2;
//        } else {
//            menor = num2;
//            mayor = num1;
//        }
//        for (int i = menor; i <= mayor; i++) {
//            System.out.println(i);
//            suma += i;
//        }
//        System.out.println("La suma es " + suma);

        /*
    @
    @@
    @
    @@
    @
    @@
    @
         */
//        for (int i = 1; i < 8; i++) {
//            if (i % 2 == 0) {
//                System.out.println("@@");
//            } else {
//                System.out.println("@");
//            }
//        }
        /*
        @
        @@
        @@@
        @@@@
        @@@@@
        @@@@@@
         */
//        String arroba = "";
//        for (int i = 1; i < 7; i++) {
//            arroba += "@";
//            System.out.println(arroba);
//        }
        /*
        mostrar las tablas de multiplicar
        1 X 1 = 1
        1 X 2 = 2
         */
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " X " + j
//                        + " = " + (i * j));
//            }
//            System.out.println("*******");
//        }
//        for (int i = 1, j = 5,k=10; i <= 10  ; i++, j++,k--) {
//            System.out.println(i + " - " + j
//                    + " - " + k);
//        }
        /*
el usuario escribe los puntos que acumula
dar un premio de acuerdo a la cantidad de puntos
tenga 3 oportunidades
         */
//        int op = 1, puntos = 0;
//        do {
//            System.out.println("Estas en tu oportunidad " + op);
//            System.out.println("Escribe los puntos");
//            puntos = teclado.nextInt();
//            if (puntos < 10) {
//                System.out.println("Ganaste un helado");
//            } else if (puntos >= 10 && puntos < 30) {
//                System.out.println("Ganaste un chocolate gigante");
//            } else if (puntos >= 30 && puntos <= 50) {
//                System.out.println("Ganaste un pase al cine");
//            } else{
//                System.out.println("No existe ese puntaje, Debes salir del sistema");
//                break;
//            }
//            op++;
//        } while (op <= 3);
//LABORATORIO
//        int i = 1, numero = 0, mayor = 0, menor = 1000;
//        while (i <= 5) {
//            System.out.println("Escribe un número");
//            numero = teclado.nextInt();
//            if (numero < menor) {
//                menor = numero;
//            }
//            if (numero > mayor) {
//                mayor = numero;
//            }
//            i++;
//        }
//        System.out.println("El mayor es " + mayor);
//        System.out.println("El menor es " + menor);
        /*
programa de un supermercado
1 arroz 2 harina 3 azúcar 4 galletas 5 salsas 

         */
        int arroz = 50, harina = 40, azucar = 10;
        int opc = 0, x = 1;
        double suma = 0;
        int cArroz = 0, cHarina = 0, cAzucar = 0;
        int sArroz = 0, sHarina = 0, sAzucar = 0;
        do {
            System.out.println("AUTOMERCADO LOS JAVA\n"
                    + "Seleccione el producto para el carrito\n"
                    + "\t1-arroz\n\t2-harina\n\t3-azúcar\n\t");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escribe la cantidad de arroz");
                    cArroz = teclado.nextInt();
                    cArroz += cArroz;
                    sArroz = arroz * cArroz;
                    break;
                case 2:
                    System.out.println("Escribe la cantidad de harina");
                    cHarina = teclado.nextInt();
                    cHarina += cHarina;
                    sHarina = harina * cHarina;
                    break;
                case 3:
                    System.out.println("Escribe la cantidad de azúcar");
                    cAzucar = teclado.nextInt();
                    cAzucar += cAzucar;
                    sAzucar = azucar * cAzucar;
                    break;
                default:
                    System.out.println("No existe el código de producto");
                    break;
            }
            System.out.println("Desea seguir comprando? 1-si 2-no");
            x = teclado.nextInt();
        } while (x == 1);
        suma = suma + sArroz + sHarina + sAzucar;
        System.out.println("Factura:\n"
                + "Arroz, " + cArroz + " subtotal " + sArroz
                + "\nHarina, " + cHarina + " subtotal " + sHarina
                + "\nAzúcar, " + cAzucar + " subtotal " + sAzucar);
        if (suma > 200) {
            suma = suma * 1.05;
        }
        System.out.println("El total es " + suma);
    }

}
