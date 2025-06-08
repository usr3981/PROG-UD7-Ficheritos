package net.salesianos.file_options.persistence_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import net.salesianos.tables.Table;

public class PersistenceFiles {

    final static String PATH_FILE = "src/net/salesianos/files/archivo_persistencia.txt";

    public static void createFile() {

        try {
            FileWriter writer = new FileWriter(PATH_FILE,
                    StandardCharsets.UTF_8);

            System.out.println("Archivo creado");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error al encontrar el archivo, File Writer");
        }

    }

    public static void saveTable(Table table) {

        try {
            FileWriter writer = new FileWriter(PATH_FILE, StandardCharsets.UTF_8,
                    true);

            writer.write(table + "\n");

            writer.close();
            System.out.println("Mesa agregada correctamente");

        } catch (IOException e) {
            System.out.println("Archivo no encontrado, File Reader");
        }
    }

    public static void getTables() {

        String text = "";
        String auxText = "";

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("src/net/salesianos/files/archivo_persistencia.txt", StandardCharsets.UTF_8));

            // Valido que el contenido no sea null, y le asigno a un auxiliar el contenido
            // en caso de no ser null para no sobreescribirlo

            while (true) {

                text = reader.readLine();

                if (text != null) {
                    auxText += text + "\n";
                } else {
                    break;
                }
            }

            System.out.println(".: Listado de mesas :.\n");
            System.out.println(auxText);

            reader.close();

        } catch (IOException e) {
            System.out.println("Error no se encontro el archivo");
        }

    }
}
