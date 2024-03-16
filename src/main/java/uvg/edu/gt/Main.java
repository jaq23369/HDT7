package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Traductor Inglés-Español.");
        System.out.println("Este programa traducirá el contenido de 'texto.txt' usando el diccionario definido en 'diccionario.txt'.");

        BinaryTree<Association<String, String>> dictionary = new BinaryTree<Association<String, String>>();
        final String dictionaryPath = "src\\main\\java\\uvg\\edu\\gt\\diccionario.txt";
        final String textPath = "src\\main\\java\\uvg\\edu\\gt\\texto.txt";

        System.out.println("\nCargando diccionario desde " + dictionaryPath + "...");

        try (BufferedReader br = new BufferedReader(new FileReader(dictionaryPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.replaceAll("[()]", "").split(" ");
                if (parts.length == 2) {
                    dictionary.insert(new Association<>(parts[0].toLowerCase(), parts[1]));
                }
            }
            System.out.println("Diccionario cargado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo diccionario.txt: " + e.getMessage());
            return;
        }

        System.out.println("\nTraduciendo el archivo " + textPath + "...");
        try (BufferedReader br = new BufferedReader(new FileReader(textPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split(" ")) {
                    String cleanedWord = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    // En Main.java dentro del bucle de traducción
                    Association<String, String> searchResult = dictionary.find(new Association<>(cleanedWord, ""));
                    if (searchResult != null) {
                        System.out.print(searchResult.getValue() + " ");
                    } else {
                        System.out.print("*" + word + "* ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo texto.txt: " + e.getMessage());
        }

        System.out.println("\nTraducción completada. ¡Gracias por utilizar el traductor!");
    }
}

