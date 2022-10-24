import java.sql.SQLOutput;
import java.util.Scanner;

//It is a Quiz game.

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Game1 game1 = new Game1();
        Game2 game2 = new Game2();
        Game3 game3 = new Game3();
        int answerMenu;

        printingTitle();
        System.out.println("--------------- MENU -----------------");        //printing Menu
        System.out.println("1 - Let's Play");
        System.out.println("2 - EXIT the Game");
        answerMenu = input.nextInt();

        if (answerMenu == 1) {
            game1.askingNextQuestionLevel1();
            if (game1.isUserWon1()) {
                System.out.printf("******* CONGRATULATIONS! You won the guaranteed prize of 1 000 €. *******\n");
                System.out.println();
                System.out.println();
                System.out.println("-------- NEXT LEVEL--------");
                System.out.println();
                game2.askingNextQuestionLevel2();
                if (game2.isUserWon2()) {
                    System.out.println("******* CONGRATULATIONS! You won the guaranteed prize of 32 000 €. *******\n");
                    System.out.println();
                    System.out.println("-------- NEXT LEVEL--------");
                    System.out.println();
                    game3.askingNextQuestionLevel3();
                    if (game3.isUserWon3()) {
                        System.out.println("~°~°~°~°~°~°~°~° CONGRATULATIONS! °~°~°~°~°~°~°~°~");
                        System.out.println("                You won the quiz!");
                        System.out.println("~°~°~°~°~°~°~ YOU ARE A MILLIONAIRE! ~°~°~°~°~°~°~");
                    }
                }
            }
        }
    }

    public static void printingTitle(){                                    //printing the title part
        System.out.println("-------- BE A MILLIONAIRE TONIGHT --------");
        System.out.println("---------- Let's have some Fun! ----------");
        System.out.println();
        System.out.println("   You will have to answer 15 questions.");
        System.out.println("-------------- THE PRIZES ----------------");
        System.out.println("            _________________");
        System.out.println("            15      1 000 000 ");
        System.out.println("            =================");
        System.out.println("            14        500 000 ");
        System.out.println("            13        250 000 ");
        System.out.println("            12        125 000 ");
        System.out.println("            11         64 000 ");
        System.out.println("            _________________");
        System.out.println("            10         32 000 ");
        System.out.println("            =================");
        System.out.println("             9         16 000 ");
        System.out.println("             8          8 000 ");
        System.out.println("             7          4 000 ");
        System.out.println("             6          2 000 ");
        System.out.println("            _________________");
        System.out.println("             5          1 000 ");
        System.out.println("            =================");
        System.out.println("             4            500 ");
        System.out.println("             3            300 ");
        System.out.println("             2            200 ");
        System.out.println("             1            100 ");
        System.out.println();
        System.out.println();
    }
}