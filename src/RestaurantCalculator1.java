//Syeda Ishtiaq, 1787202
import java.util.Scanner;

public class RestaurantCalculator1 {

    private static double FinalTotal;

    public static void main(String args [])
    {
    double itemTotal=0.0, CalculatedTax=0.0, FinalTax=0.0, tip=0.0;

        System.out.println("Enter Number of Items:");
    Scanner input = new Scanner(System.in);

        int numberOfItem = input.nextInt();

    for(int i=0; i<numberOfItem; i++)
    {
        System.out.println("Enter the price for item number"+(i+1));
        itemTotal+=input.nextDouble();

    }
    if(itemTotal>100) {
        tip = itemTotal * (0.20);
    }
    else if (itemTotal>50) {
        tip = itemTotal * (0.15);
    }
    else if(itemTotal>25) {
        tip = itemTotal * (0.05);
    }
    else
    {
        tip=0;
    }
    CalculatedTax = itemTotal*(0.0825);
    FinalTotal = (itemTotal+CalculatedTax+tip);

    System.out.println("TicketSummary");
    System.out.println("Item Total: " + itemTotal);
    System.out.println("CalculatedTax: "+ CalculatedTax);
    System.out.println("Tip: "+ tip);
    System.out.println("Final Total: "+FinalTotal);




}
}
