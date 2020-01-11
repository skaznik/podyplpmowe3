package pl.edu.wszib.jwe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider {

    @Override
    public String getData() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/pl/edu/wszib/jwe/data.txt")));
        } catch (IOException e) {
            System.out.println("Wystąpił błąd : " + e.getMessage());
        }
        return " Błędne dane";
    }
}
