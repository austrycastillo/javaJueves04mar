package juevesclase4;

import java.util.Scanner;

public class JuevesClase4 {

    public static void main(String[] args) {
        /*
        declarando un array
        tipo_dato []identificador;
        tipo_dato identificador [];
        inicializar
        identificador = new tipo_dato[tamaño];
        declarar e inicializar
        tipo_dato []identificador= new tipo_dato[tamaño];
        otra forma
        tipo_dato []identificador={valor,valor,valor};
         */
//        int[] numeros = new int[5];
//        numeros[0] = 2;
//        numeros[1] = 4;
//        numeros[2] = 10;
//        numeros[3] = 5;
//        numeros[4] = 8;
//        System.out.println(numeros[2]);
//        numeros[2] = 100;
//        System.out.println(numeros[2]);
//        String nombres[] = {"Cesar", "Alejandro", "Julian", "Martin"};
//        System.out.println(nombres[1]);
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//        }
        /*
        informar el mínimo y el máximo
         */
//        int arreglo[] = {1, 3, 4, 5, 6};
//        int min = arreglo[0];
//        int max = arreglo[0];
//        for (int i = 0; i < arreglo.length; i++) {
//            if (arreglo[i] < min) {
//                min = arreglo[i];
//            }
//            if (arreglo[i] > max) {
//                max = arreglo[i];
//            }
//        }
//        System.out.println("El mínimo es " + min);
//        System.out.println("El máximo es " + max);
        /*
        crear un arreglo de tamaño 100, 
        debemos rellenar con los números del 1 al 100
        mostrar el arreglo
        informar la suma de todos los números y su promedio
         */
//        int valores[] = new int[100];
//        int suma = 0;
//        for (int i = 0, j = 1; i < valores.length; i++, j++) {
//            valores[i] = j;
//            System.out.println(valores[i]);
//            suma += valores[i];
//        }
//        System.out.println("La suma es " + suma);
//        System.out.println("El promedio es " + (suma / valores.length));

        /*
        crear un arreglo con diferentes comidas
        crear otro arreglo y copiar todos los elementos del primero
         */
//        String comidas[] = {"empanadas", "milanesa", "asado", "ensalada", "arepa"};
//        String comidasCopia[] = new String[comidas.length];
//        for (int i = 0; i < comidas.length; i++) {
//            comidasCopia[i] = comidas[i];
//        }
//System.arraycopy(comidas, 0, comidasCopia, 0, comidas.length);
//        System.out.println("***Comidas original");
//        for (int i = 0; i < comidas.length; i++) {
//            System.out.println(comidas[i]);
//        }
//        System.out.println("***Comidas Copia");
//        for (int i = 0; i < comidasCopia.length; i++) {
//            System.out.println(comidasCopia[i]);
//        }
        /*
        solicitar al usuario un número final
        crear un arreglo con tamaño del número
        mostrar en panatal los números del 1 hasta número
         */
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Escriba un número para el tamaño del arreglo");
//        int tam = teclado.nextInt();
//        int num[] = new int[tam];
//        for (int i = 0, j = 1; i < tam; i++, j++) {
//            num[i] = j;
//            System.out.println(num[i]);
//        }

//        int datos[] = {25, 40, 36, 36, 96, 45, 25, 36, 2, 112, 48};
//        //determinar la cantidad de veces que se repite el número 36
//        int c = 0;
//        for (int i = 0; i < datos.length; i++) {
//            if (datos[i] == 36) {
//                c++;
//            }
//        }
//        System.out.println("El 36 se repite " + c + " veces");

        /*
CREAR UN ARREGLO CON LOS NÚMEROS DEL 1 AL 50
MOSTRAR CUALES SON PARES Y CUALES IMPARES
         */
//        int[] datos = new int[50];
//        for (int i = 0; i < datos.length; i++) {
//            datos[i] = i + 1;
//
//            if (datos[i] % 2 == 0) {
//                System.out.println("Par -> " + datos[i]);
//            }else{
//                System.out.println("Impar -> " + datos[i]);
//            }
//        }
/*
        carrera de atletismo
        crear un arreglo para almacenar el tiempo
        crear otro arreglo para los nombres
        el usuario debe especificar cuantos atletas
        vas a participar
        mostrar el atleta con menos tiempo
         */
//        System.out.println("Escribe la cantidad de atletas");
//        int cant = teclado.nextInt();
//        String atletas[] = new String[cant];
//        double tiempo[] = new double[cant];
//
//        int ganador = 0;
//        for (int i = 0; i < cant; i++) {
//            System.out.println("Escribe el nombre del atleta");
//            atletas[i] = teclado.next();
//            System.out.println("Escribe el tiempo en qué llegó a la meta");
//            tiempo[i] = teclado.nextDouble();
//        }
//        for (int i = 0; i < cant; i++) {
//            if (tiempo[i] < tiempo[ganador]) {
//                ganador = i;
//            }
//        }
//        System.out.println("El atleta ganador es " + atletas[ganador]
//                + " en un tiempo de " + tiempo[ganador]);

        /*
        tienda de artefactos: plancha, licuadora, lavadora, cocina
        el usuario indica lo que desea comprar y la cantidad
        si la compra supera X monto recibe un descuento de X%
         */
        String artefactos[] = {"plancha", "licuadora", "lavadora", "cocina"};
        double precios[] = {400, 300, 1000, 900};
        int cantidad[] = {0, 0, 0, 0,};
        double subtotal[] = new double[4];
        int opcion = teclado.nextInt();
        double total = 0;
        boolean seguir = false;
        String letra = "";
        do {
            System.out.println("****TIENDA GLUGLU****\n"
                    + "¿Qué desea comprar?\n\t1) Plancha\n\t2) Licuadora"
                    + "\n\t3) Lavadora\n\t4) Cocina");

            switch (opcion) {
                case 1:
                    System.out.println("Escribe la cantidad de planchas");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("Escribe la cantidad de licuadora");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("Escribe la cantidad de lavadora");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                case 4:
                    System.out.println("Escribe la cantidad de cocina");
                    opcion -= 1;
                    cantidad[opcion] = teclado.nextInt();
                    break;
                default:
                    System.out.println("No existe esa opción");
                    break;

            }
            System.out.println("¿Deseas seguir comprando? S/N");
            letra = teclado.next();
            if (letra.equals("S")) {
                seguir = true;
            } else {
                seguir = false;
            }

        } while (seguir);
        for (int i = 0; i < 4; i++) {
            subtotal[i] = precios[i] * cantidad[i];
            total += subtotal[i];
        }
        System.out.println("El total a pagar es " + total);
    }

}
