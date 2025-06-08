package net.salesianos.file_options.save_files;

import java.util.Scanner;

public class SaveFiles {

    public static void createFile(String nombreFichero, String textoFichero) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un texto (minimo 30 caracteres): ");

        while (true) {

            textoFichero = scanner.nextLine();

            if (textoFichero.length() < 30) {
                System.out
                        .println("Te faltaron [" + (30 - textoFichero.length()) + "] caracteres, \n intenta de nuevo:");
            } else {
                break;
            }
        }

        System.out.println("Exito");
    }

}
