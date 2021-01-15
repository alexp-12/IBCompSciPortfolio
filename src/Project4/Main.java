package Project4;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static  void main(String[] args) throws IOException {
        String dir = "/Users/alexpotamkin/Documents/IBComputerScience/IBCompSciPortfolio/src/Project4/";
        File file = new File(dir + "File.txt");
        Writer writer = new Writer(dir + "SortedFile");
        Parser parser = new Parser(file, 7);
        System.out.println(Arrays.toString(parser.parserArray));
        BubbleSorter bubbleSorter = new BubbleSorter();
        writer.writeArray(bubbleSorter.numberSort(parser.parserArray));
        parser.average();



    }
}






