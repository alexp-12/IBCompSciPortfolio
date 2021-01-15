package Project4;

import java.io.*;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;
    private File file;
    int fileLength;
    double[] parserArray;
    int key = 0;

    public Parser (File file, int fileLength) {
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("no file was found");
            e.printStackTrace();
        }
        this.fileLength = fileLength;
        parserArray = new double[fileLength];
        toArray();
    }
    public void toArray(){
        while (scanner.hasNext()){
            parserArray[key] = Double.parseDouble(scanner.next());
            key += 1;
        }
    }
    public void average(){
        double total = 0;
        for (int i = 0; i < parserArray.length ; i++) {
            total += parserArray[i];
        }
        System.out.println(total = total/parserArray.length);
    }

}