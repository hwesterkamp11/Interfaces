import javax.swing.*;
import java.io.*;

import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                System.out.println("Short words under 5 letters found in this file: ");
                Scanner scan = new Scanner(selectedFile);
                ShortWordFilter filter = new ShortWordFilter();
                while(scan.hasNext()) {
                    String word = scan.next();
                    if(filter.accept(word)) {
                        System.out.println(word);
                    }
                } scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: file not found");
            }
        } else {
            System.out.println("No file selected");
        }
    }
}
