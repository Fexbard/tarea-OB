package Tarea789;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import static java.lang.System.in;
import static java.lang.System.out;
//import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("--------------------*****--------------------");
        System.out.println("Ejercicio Cero");

//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".


        Scanner dato = new Scanner(in);
        out.println("ingrese la  palabra");
        String palabra = dato.nextLine();
        for (int i=palabra.length(); i>0; i--) {
            out.println(palabra.charAt(i-1));
        }


        System.out.println("Primer ejercicio");
        System.out.println();
//1 Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] CelestialObjetcs = new String[3];
        CelestialObjetcs[0] = "Satélites";
        CelestialObjetcs[1] = "Estrellas";
        CelestialObjetcs[2] = "Planetas";


        for (int i=0; i<CelestialObjetcs.length; i++){
            System.out.println(CelestialObjetcs[i]);
        }
        System.out.println("--------------------*****--------------------");
        System.out.println("Segundo ejercicio");
//
////2 Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    int ChessRanking[][] = new int[3][3];
        ChessRanking[0][0] = 2859;
        ChessRanking[0][1] = 2811;
        ChessRanking[0][2] = 2793;
        ChessRanking[1][0] = 2785;
        ChessRanking[1][1] = 2768;
        ChessRanking[1][2] = 2766;
                System.out.println("Ranking FIDE");
        for (int i=0; i<ChessRanking.length-1; i++){

            for (int j=0; j<ChessRanking[i].length; j++){
                int count= j+1;
                if(i==1){
                    count = j+4;
                }
                System.out.println("Número " +count+ " del Mundo ELO: " + ChessRanking[i][j]);


            }

        }
        System.out.println("--------------------*****--------------------");
        System.out.println("Tercer ejercicio");
//
////3 Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(1);
        vector.remove(2);
        System.out.println("Los Vectores restantes son: "+vector);

        System.out.println("--------------------*****--------------------");
        System.out.println("Cuarto ejercicio");
//
////4 Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.println("Sabemos que el limite  por defecto de un vector es 10, si este es sobrepasado(capacityIncrement), " +
                "su dimensión se duplicará y esto hará que se use más memoria de la necesaria.");
        System.out.println("--------------------*****--------------------");
        System.out.println("Quinto ejercicio");
//
////5 Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Avellanas");
        lista.add("Nueces");
        lista.add("Almendras");
        lista.add("Maníes");

        LinkedList<String> listaCopia = new LinkedList<String>();

        System.out.println("Lista original de Frutos Secos: ");

        for (int i=0; i<lista.size(); i++) {
            listaCopia.add(lista.get(i));
            System.out.println(lista.get(i));
        }
    System.out.println("Lista copiada a una LinkedList: "+listaCopia);


        System.out.println("--------------------*****--------------------");
        System.out.println("Sexto ejercicio");


// //6 Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
//// recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
// // puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
//
        ArrayList<Integer> elements = new ArrayList<Integer>();
        for (int i=1; i<=10; i++){
            elements.add(i);
        }
        System.out.println("Originals Elements: "+elements);

        for (int j=0; j<elements.size(); j++){
            if (elements.get(j)%2 == 0){
                elements.remove(j);
            }
            }
        System.out.println("Elements without pairs numbers: "+elements);

        System.out.println("--------------------*****--------------------");
        System.out.println("Séptimo ejercicio");

//----------------------
        /*
7 Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
"Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código". */

        Scanner division = new Scanner(System.in);
        out.println("Ingrese el primer número: ");
        int a = division.nextInt();
        out.println("Ingrese el segundo número: ");
        int b = division.nextInt();

        try{
            int resultado = DividePorCero(a,b);
            out.println("El resultado es: "+ resultado);
        }
        catch (ArithmeticException e){
            out.println("Esto no puede hacerse, corrija el error "+ e.getMessage());
        }
        finally {
            out.println("Demo de código");
        }

        System.out.println("--------------------*****--------------------");
        System.out.println("Octavo ejercicio");
/*
8 Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut". */

        Scanner input = new Scanner(in);
        out.println("Ingrese el archivo de origen: ");
        String fileIn = input.nextLine();
        out.println("Ingrese el archivo de destino: ");
        String fileOut = input.nextLine();

        System.out.println("--------------------*****--------------------");
        System.out.println("Octavo ejercicio");
/*
9 Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un
ArrayList, LinkedList o array.      */
        System.out.println("----------------++++++--------------------");
        System.out.println("Valor de las Piezas del Ajedrez");
        System.out.println("----------------++++++--------------------");

        ArrayList<String> piezas = new ArrayList<String>();
        piezas.add("Rey");
        piezas.add("Dama");
        piezas.add("Torre");
        piezas.add("Caballo");
        piezas.add("Alfil");
        piezas.add("Peón");

        ArrayList<Integer> valor = new ArrayList<Integer>();
        valor.add(9);
        valor.add(5);
        valor.add(3);
        valor.add(3);
        valor.add(1);

        Scanner ingresoDeDatos = new Scanner(System.in);
        out.println("Ingrese el nombre de la pieza: ");
        try {
            String nombre = ingresoDeDatos.nextLine();
            String UpperNombre = nombre.toUpperCase();
            switch (UpperNombre) {
                case "REY" ->
                        out.println("El Rey es la única pieza del Ajedrez que no tiene valor numérico en este juego");
                case "DAMA" -> out.println("El valor de la " + piezas.get(1) + " es: " + valor.get(0));
                case "TORRE" -> out.println("El valor del Torre es: " + valor.get(1));
                case "CABALLO" -> out.println("El valor del Caballo es: " + valor.get(2));
                case "ALFIL" -> out.println("El valor del Alfil es: " + valor.get(3));
                case "PEON" -> out.println("El valor del Peón es: " + valor.get(4));
                default -> throw new IllegalStateException("Unexpected value: " + UpperNombre);
            }
        } catch (Exception e) {
            System.out.println("El nombre de la pieza no puede contener caracteres especiales");
        }

        HashMap<String, Integer> ListaDatos = new HashMap<String, Integer>();
        ListaDatos.put("Dama", 9);
        ListaDatos.put("Torre", 5);
        ListaDatos.put("Caballo", 3);
        ListaDatos.put("Alfil", 3);
        ListaDatos.put("Peón", 1);
        PrintStream sali= new PrintStream("fil.txt");
        for (Map.Entry<String, Integer> entry : ListaDatos.entrySet()) {
//            out.println("Lista completa: " + entry.getKey() + " es: " + entry.getValue());
        sali.write(("Lista completa: " + entry.getKey() + " es: " + entry.getValue() + "\n").getBytes());
        }

        Scanner saveMode = new Scanner(System.in);
        out.println("Desea guardar el archivo? (S/N): ");
        String guardar = saveMode.nextLine();
        if (guardar.equalsIgnoreCase("S")) {
            Scanner sal = new Scanner(System.in);
            out.println("Ingrese el nombre del archivo: ");
            String guardar2 = sal.nextLine();
              chessBase(guardar, guardar2);

        }else if (guardar.equalsIgnoreCase("N")) {
                out.println("Gracias por usar el programa");
            }

        }// FIN del main

        // AQUÍ ABAJO ZONA DE  FUNCIONES

//         Función ejercicio 7
    public static int DividePorCero(int a, int b) throws ArithmeticException{
        return a/b;
    }
//         Función ejercicio 8
    public static void Functioncopy(String fileIn, String fileOut) {
    try{
        InputStream lectura= new FileInputStream(fileIn);
        byte[] datos = lectura.readAllBytes();
        lectura.close();

        PrintStream salida= new PrintStream(fileOut);
        salida.write(datos);
        salida.close();

    } catch (IOException e) {
        System.out.println(e.getMessage());;
    }

    }
        public static void chessBase(String ent, String guardar2){
            try {
                InputStream entrada = new FileInputStream("fil.txt");
                byte[] datos = entrada.readAllBytes();
                entrada.close();

            } catch (IOException e) {
                out.println("No se pudo escribir el fichero");
            }


    }

    // AQUÍ ARRIBA ZONA DE FUNCIONES

}      // Fin del class Main

