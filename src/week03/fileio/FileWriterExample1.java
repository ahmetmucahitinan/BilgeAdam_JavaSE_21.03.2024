package week03.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("fileWriter.txt");
            fileWriter.write("Merhaba File! ");
            fileWriter.write("abc \n");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("abc");
            fileWriter.write("\r\n");
            fileWriter.write("nextLine");
            fileWriter.flush(); // Bu komut ile txt dosyasına verinin dolmasını beklemeden veriyi yollar
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
        FileReader fileReader = new FileReader("fileWriter.txt");
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();
    }
}
