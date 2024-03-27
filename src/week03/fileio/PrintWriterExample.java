package week03.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("printWriter.txt");
        printWriter.println("hello");
        printWriter.println("world");
        printWriter.println();
        printWriter.println("java");
        printWriter.flush();
        printWriter.close();
    }
}
