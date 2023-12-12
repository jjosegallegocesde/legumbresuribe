package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //entradas del problema
        Scanner leerDato=new Scanner(System.in);

        String nombreProducto;
        String nombreDistribuidor;
        double costoLote;
        double costoVentaPublico;
        double totalCompra;
        int cantidadCompradaProducto;

        //PROCESO
        System.out.println("***************");
        System.out.println("Frugal SAS");
        System.out.println("***************");

        System.out.print("1. Digita el nombre del producto que ingresa a bodega: ");
        nombreProducto=leerDato.nextLine();

        System.out.print("2. Digita el nombre del distribuidor de la mercancia: ");
        nombreDistribuidor=leerDato.nextLine();

        System.out.println("3. cuanto cuesta el lote que esta ingresando?: ");
        costoLote=leerDato.nextDouble();

        System.out.println("*********************************");
        System.out.println("Resumen ingreso mercancia: ");
        System.out.println("lote que entra: "+nombreProducto);
        System.out.println("costo total: $"+costoLote);
        System.out.println("Entregado por: "+nombreDistribuidor);
        System.out.println("*********************************");


        System.out.println("\n +++++++++Venta al detal+++++++++++ \n");
        costoVentaPublico=5000;

        System.out.println("Apreciado usuario, el costo unitario de "+nombreProducto+"es de: $"+costoVentaPublico);

        System.out.print("Digita la cantidad de "+nombreProducto+"que quieres comprar: ");
        cantidadCompradaProducto=leerDato.nextInt();

        //calculando el valor de una variable
        totalCompra=costoVentaPublico*cantidadCompradaProducto;

        System.out.println("El valor de su compra es de: $"+totalCompra);



    }
}