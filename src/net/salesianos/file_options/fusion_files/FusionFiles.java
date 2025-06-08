package net.salesianos.file_options.fusion_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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

        String textOne = "";
        String textTwo = "";
        String auxOne = "- Contenido del Fichero Uno: ";
        String auxTwo = "- Contenido del Fichero Dos: ";

        try {

            // COn esto puedo obtener el contenido de los fihceros 1 y 2

            BufferedReader fileOne = new BufferedReader(
                    new FileReader("src/net/salesianos/files/archivo.txt", StandardCharsets.UTF_8));

            // Valido que el contenido no sea null, y le asigno a un auxiliar el contenido
            // en caso de no ser null para no sobreescribirlo

            while (true) {

                textOne = fileOne.readLine();

                if (textOne != null) {
                    auxOne += textOne;
                } else {
                    break;
                }
            }

            System.out.println(auxOne);

            fileOne.close();

            // Abro y cierro el flujo de ejecucion para no sobreponerlos y que no peten

            BufferedReader fileTwo = new BufferedReader(
                    new FileReader("src/net/salesianos/files/archivo2.txt", StandardCharsets.UTF_8));

            while (true) {

                textTwo = fileTwo.readLine();

                if (textTwo != null) {
                    auxTwo += textTwo;
                } else {
                    break;
                }
            }

            System.out.println(auxTwo);

            fileTwo.close();

            // Con esto puedo escribir en el nuevo fichero

            FileWriter writer = new FileWriter("src/net/salesianos/files/archivo_fusionado.txt", StandardCharsets.UTF_8,
                    true);

            writer.write(auxOne + "\n");
            writer.write(auxTwo + "\n");

            writer.close();

            addSignatureIntoNewFile();

        } catch (IOException e) {
            System.out.println("Archivo no encontrado, File Reader");
        }

    }

    public static void addSignatureIntoNewFile() {

        try {
            FileWriter writer = new FileWriter("src/net/salesianos/files/archivo_fusionado.txt", StandardCharsets.UTF_8,
                    true);

            // Aqui firmo el documento
            writer.write("Hecho por Luis Hortua (El Batman)");

            writer.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado, File Reader");
        }
    }
}
