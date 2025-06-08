package net.salesianos.file_options.fusion_files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FusionFiles {

    public static void createFile() {

        try {
            FileWriter writer = new FileWriter("src/net/salesianos/files/archivo_fusionado.txt",
                    StandardCharsets.UTF_8);

            System.out.println("Archivo creado");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error al encontrar el archivo, File Writer");
        }

    }

    public static void fusionFilesContent() {

    }

    public static void addSignatureIntoNewFile() {
        // hecho por Luis Hortua (El barto)
    }
}
