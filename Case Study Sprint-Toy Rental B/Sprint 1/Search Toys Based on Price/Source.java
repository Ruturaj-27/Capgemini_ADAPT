import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source
{

    String[][] toys = new String [5][5];

    Source()
    {

    toys [0][0]="1";
    toys[0][1]="Stickle Bricks";

    toys [1][0]="2";
    toys [1][1] ="Robot Dog";

    toys [2][0]="3";
    toys [2][1]="Magic 8 Ball";

    toys [3][0]="4";
    toys [3][1]="Juggling Clubs";

    toys [4][0]="5";
    toys[4][1]="Chutes and Ladders";

    }

    public static String getToy(int price)
    {
        String nameString;
        switch(price)
        {
            case 350: 
                nameString = "Stickle Bricks";
                return nameString;
            
            case 450:
                nameString = "Robot Dog";
                return nameString;
                
            case 300:
                nameString = "Magic 8 Ball";
                return nameString;
                
            case 550:
                nameString = "Juggling Clubs";
                return nameString;
                
            case 750:
                nameString = "Chutes and Ladders";
                return nameString;
                
            default:
                nameString = "No Toys Available in this Range";
                return nameString;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int price = sc.nextInt ();

        System.out.println(getToy(price));

        sc.close();
    }
}

    