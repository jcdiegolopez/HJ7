package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        loadDictionary("diccionario.txt", dictionary);

        
        System.out.println("Recorrido in-order del árbol:");
        inOrderTraversal(dictionary);

        
        translateFile("texto.txt", dictionary);
    }

    public static void loadDictionary(String filePath, Dictionary dictionary) {

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                
                String[] values = line.replaceAll("[(),]", "").split("\\s+");
                dictionary.insert(values[0],values[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 

    public static void inOrderTraversal(Dictionary dictionary) {
        inOrderTraversal(dictionary.getTree());
    }

    public static void inOrderTraversal(BinaryTree<Association<String, String>> tree) {
        if (tree != null) {
            inOrderTraversal(tree.getLeft());
            System.out.println(tree.getData().getKey() + " -> " + tree.getData().getValue());
            inOrderTraversal(tree.getRight());
        }
    }

    public static void translateFile(String filePath, Dictionary dictionary) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    System.out.print(dictionary.translate(word) + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
