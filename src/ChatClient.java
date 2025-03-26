import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.*;
import java.util.List;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        long start1 = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0;i<1000000;i++){
            linkedList.add(i);
        }
        long end1 = System.nanoTime();
        long duration1 = end1 - start1; // Time taken in nanoseconds
        System.out.println("Execution Time for linked: " + duration1 / 1_000_000.0 + " ms");
}}
