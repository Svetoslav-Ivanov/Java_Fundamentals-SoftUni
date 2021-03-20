package MoreExercise_BasicSyntaxAndConditionalStatementsAndLoops_01;

import java.util.Scanner;

public class RageExpenses_11_EXAM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetsBroken = 0;
        int mouseBroken = 0;
        int keyboardsBroken = 0;
        int displaysBroken = 0;

        int gameCounter = 0;
        int headsetsCounter = 0;
        int mouseCounter = 0;
        int keyboardCounter = 0;


        for (int i = 1; i <= lostGames; i++) {
            mouseCounter ++;
            gameCounter++;
            headsetsCounter ++;

// Когато в една и съща игра си чупи и мишката и слушалките,чупи и клавиатурата си
            if (headsetsCounter == 2 && mouseCounter == 3) {
                keyboardsBroken++;
                keyboardCounter++;
            }
            // Всяка ВТОРА игра си чупи слушалките
            if (headsetsCounter == 2) {
                headsetsBroken++;
                headsetsCounter = 0;
            }
            // Всяка ТРЕТА игра си чупи мишката
            if (mouseCounter == 3) {
                mouseBroken++;
                mouseCounter = 0;
            }
            // Всеки втори път, в който си чупи клавиатурата, си чупи и монитора
            if (keyboardCounter == 2) {
                displaysBroken++;
                keyboardCounter = 0;
            }

        }
        double expenses = (mouseBroken * mousePrice) + (keyboardsBroken * keyboardPrice) +
                (headsetsBroken * headSetPrice)+(displaysBroken * displayPrice)  ;

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
