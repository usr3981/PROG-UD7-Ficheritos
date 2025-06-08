package net.salesianos.file_options.save_files;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SaveFiles {

    public static void createFile() {

        String textoFichero = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un texto (minimo 30 caracteres): ");

        // Esto verifica que sean 30 caracteres

        while (true) {

            textoFichero = scanner.nextLine();

            if (textoFichero.length() < 30) {
                System.out
                        .println("Te faltaron [" + (30 - textoFichero.length()) + "] caracteres, \n intenta de nuevo:");
            } else {
                break;
            }
        }

        // Esto formatea el texto a mayusculas y sustituye espacios por barrabajas
        // (A-Z,espacio-_), <- no se si es asi pero se ve chido :)

        textoFichero = textoFichero.toUpperCase().replace(" ", "_");

        // Accedo al fochero, con FileWriter para poder escribir en el

        try {

            FileWriter writer = new FileWriter("src/net/salesianos/files/archivo.txt", StandardCharsets.UTF_8);

            writer.write(textoFichero);

            writer.close();
        } catch (Exception e) {
            System.out.println("Error porque no se encontro el archivo, FileWriter");
        }

        scanner.close();
    }

}
