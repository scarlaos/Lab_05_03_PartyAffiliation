import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "Democrat (D)\t Republican (R)\t Independent (I)\t Other (O)\nChoose your party: ";

        System.out.print(menu);
        menuChoice = in.nextLine();

        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey! ");
        }
        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant! ");
        }
        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent Man!");
        }
        else if(menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You get a Other Character! ");
        }
        else
        {
            System.out.println("You did not choose one of the options above: " + menuChoice);
        }

    }
}