package net.salesianos.file_options.persistence_files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import net.salesianos.tables.Table;

public class PersistenceFiles {

    final static String PATH_FILE = "src/net/salesianos/files/archivo_persistencia.txt";

    ArrayList<Table> tableList = new ArrayList<>();

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

    public static void getTable() {

    }
}
