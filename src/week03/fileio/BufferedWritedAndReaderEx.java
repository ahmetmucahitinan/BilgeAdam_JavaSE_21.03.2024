package week03.fileio;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferedWritedAndReaderEx {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("buffered.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello");
        bufferedWriter.write("world");
        bufferedWriter.newLine();
        bufferedWriter.write("java");
        bufferedWriter.close();
        fileWriter.close();

        FileReader fileReader = new FileReader("buffered.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String data = null;
        while ((data = bufferedReader.readLine()) != null){
            System.out.println(data);
        }
        fileReader.close();
        bufferedReader.close();
    }
}
