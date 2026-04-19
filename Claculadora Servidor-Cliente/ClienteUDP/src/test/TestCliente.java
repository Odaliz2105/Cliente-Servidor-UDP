package test;

import entidades.Cliente;

import java.util.Scanner;

public class TestCliente {
    public static void main(String[] args) throws Exception{

            Cliente cliente = new Cliente();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar (+)");
            System.out.println("2. Restar (-)");
            System.out.println("3. Multiplicar (*)");
            System.out.println("4. Dividir (/)");

            System.out.print("Ingrese la opción: ");
            String op = scanner.next();

            cliente.enviar("172.31.116.73", 5000, n1, n2, op);



    }
}