package Lab_TextProcessing.Excercise_TextProcessing;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filePath = scan.nextLine();

        String extension = filePath.substring(filePath.lastIndexOf("." )+1);
        String name = filePath.substring(
                filePath.lastIndexOf("\\") + 1
                , filePath.length() - extension.length()-1);

        System.out.printf("File name: %s%nFile extension: %s%n", name, extension);
    }
}
