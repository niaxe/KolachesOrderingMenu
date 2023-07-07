import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class FoodOrder {

    //declar variables for  food items and price
    ArrayList<String> userChoice = new ArrayList<String>();
    double userSavoryTotal = 0;
    double userSweetTotal =0;
    int choice;
    float tax = (float) 0.0725f;
    Date today=new Date();

    Scanner scnr = new Scanner(System.in);


    //method for printing receipt
    public void getRecipt()
    {
        System.out.println("========================");
        System.out.println("    Czechian Kolaches!");
        System.out.print("     "+today.getDate()+"/");
        System.out.print((today.getMonth()+1)+"/");
        System.out.print((today.getYear()+1900)+" ");
        System.out.print(today.getHours()+":");
        System.out.println(today.getMinutes());
        System.out.println("========================");

        for (int i=0 ; i<userChoice.size(); i++)
        {
            System.out.println(userChoice.get(i));
        }

        System.out.println("========================");
        System.out.println("SubTotal= $"+Double.sum(userSavoryTotal, userSweetTotal));
        System.out.println("Tax     = $"+(int) (
                (Double.sum(userSavoryTotal, userSweetTotal) * tax) * 100) / 100.0
        );
        System.out.println("Total   = $"+ (int) (
                (Double.sum(userSavoryTotal, userSweetTotal) * tax * 100) + Double.sum(userSavoryTotal, userSweetTotal) * 100) / 100.0
        );
        System.out.println("========================");
        System.out.println("Thank You for You Order!");
    }

    //method for ordering food
    public void order()
    {
        do {
            System.out.println("--------------------------------");
            System.out.println("This is what you've got so far!");
            System.out.println("");
            for (int i=0 ; i<userChoice.size();i++) {
                System.out.println(userChoice.get(i));
            }
            System.out.println("--------------------------------");
            System.out.println("********************************");
            System.out.println();
            System.out.println();
            System.out.println("What would you like to order?");
            choice = scnr.nextInt();

            if (choice != 0){

                switch(choice){

                    case 1:
                        // added output for users -N
                        userSavoryTotal += 3.75;
                        userChoice.add("Bacon Egg and Cheese: $3.75");

                        break;

                    case 2:
                        // added output for users -N
                        userSavoryTotal += 3.75;
                        userChoice.add("Sausage Egg and Cheese: $3.75");

                        break;

                    case 3:
                        // added output for users -N
                        userSavoryTotal += 3.75;
                        userChoice.add("Ham Egg and Cheese: $3.75");

                        break;

                    case 4:
                        // added output for users -N
                        userSweetTotal += 2.50;
                        userChoice.add("Raspberry and Cream: $2.50");

                        break;

                    case 5:
                        // added output for users -N
                        userSweetTotal += 2.50;
                        userChoice.add("Cinnamon and Cream: $2.50");

                        break;

                    case 6:
                        // added output for users -N
                        userSweetTotal += 2.50;
                        userChoice.add("Maple Pecan: $2.50");

                        break;

                    case 0:
                        System.exit(0);


                    default:
                        System.out.println("error");
                }
            }
        } while (choice != 0);

    }
}

