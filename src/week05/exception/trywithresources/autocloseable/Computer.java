package week05.exception.trywithresources.autocloseable;

import java.io.IOException;

public class Computer implements AutoCloseable{
    public void run(){
        System.out.println("Computer is runnig... ");
    }
    @Override
    public void close() throws IOException {

    }
}
