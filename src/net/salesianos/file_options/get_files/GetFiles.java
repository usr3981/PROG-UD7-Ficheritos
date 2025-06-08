package net.salesianos.file_options.get_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GetFiles {

    public static void getFileContent() {

        // Leo el archivo con file reader, para obtener el numerito de los caracteres, y
        // al mostrar el mensaje lo parseo a char para ver la letra que corresponde

        try {

            FileReader reader = new FileReader("src/net/salesianos/files/archivo2.txt", StandardCharsets.UTF_8);
            String text = "";

            while (true) {
                int numLetter = reader.read();

                if (numLetter == -1) {
                    break;
                }

                text += ((char) numLetter + "_" + numLetter + ",");
            }

            System.out.println(text);
            reader.close();

        } catch (IOException e) {
            System.out.println("Error al encontrar el archivo, FileReader");
        }

    }

}
