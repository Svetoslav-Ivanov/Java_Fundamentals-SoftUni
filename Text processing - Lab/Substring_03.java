package Lab_TextProcessing;

import java.util.Scanner;


public class Substring_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bannedWord = scan.next();
        String output = scan.next();
        StringBuilder outputAsBuilder = new StringBuilder(output);

        while(output.contains(bannedWord)){
            outputAsBuilder.replace(output.indexOf(bannedWord),
                    output.indexOf(bannedWord) + bannedWord.length()
                    ,"");
            output = outputAsBuilder.toString();
        }
        System.out.println(output);

    }
}
