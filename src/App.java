package src;

import java.io.FileNotFoundException;
import java.util.LinkedList;


public class App {
    public static void main(String[] group3) throws FileNotFoundException{
        InOut io = new InOut(); 
        LinkedList<String> names = new LinkedList<>();
        System.out.println("Print Your Name Below:");
        System.out.println("Timothy");
        System.out.println("Andrew");
        System.out.println("Cornelius");

        System.out.println("Expected Name List:");
        io.displayFile(names);
        io.printToFile(names);
        io.closeFileScanner();
        io.saveToFile();
    }
}