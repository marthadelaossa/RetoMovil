package exito.app.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LeerFichero {

    public static String linea(int numeroLinea) throws IOException {

        String FILENAME = "./src/main/resources/datosIngreso.txt";
        String linea;
        Path filePath = Paths.get(FILENAME);
        try (Stream<String> lines = Files.lines(filePath)) {
             linea = lines.skip(numeroLinea-1).findFirst().get();
        }
        return linea;
    }
}
