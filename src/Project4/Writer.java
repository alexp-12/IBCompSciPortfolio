package Project4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    private FileWriter fw;
    public Writer(String fileName) throws IOException {
        fw = new FileWriter(fileName);
    }
    public void addText(String text) throws IOException {
        fw.append(text);
        fw.close();
    }
    public void writeArray(double[] array) throws IOException {
        for (double v : array) {
            fw.append(Double.toString(v)).append("\n");
        }
        fw.close();
    }
}