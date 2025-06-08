package net.salesianos.file_options.save_files;

import java.util.Scanner;

public class SaveFiles {

    public static void createFile(String nombreFichero, String textoFichero) {

        Scanner scanner = new Scanner(System.in);

        while (textoFichero.length() < 30) {

            System.out.println("Ingresa un texto (minimo 30 caracteres): ");

            textoFichero = scanner.nextLine();

        }

        System.out.println("fuera: " + textoFichero.length());

        scanner.close();
    }

}
