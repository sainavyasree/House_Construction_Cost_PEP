import java.util.*;
import Calculations.*;

public class HouseconstructionCost {

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int square_feet,material_choice,selected_choice;
        /*
         * static input
         * Test cases
         */
        System.out.println("Test Case 1:");
        square_feet=1000;
        material_choice=2;
        selected_choice=0;
        compute(square_feet,material_choice,selected_choice);
        
        System.out.println("\nTest Case 2:");
        square_feet=2500;
        material_choice=3;
        selected_choice=1;
        compute(square_feet,material_choice,selected_choice);
        
        System.out.println("\nTest Case 3:");
        square_feet=2500;
        material_choice=2;
        selected_choice=1;
        compute(square_feet,material_choice,selected_choice);
        
        //dynamic input
        System.out.println("\n\nDynamic input\n");
        System.out.println("Enter total Area of House in Square feet");
        square_feet=ob.nextInt();
        System.out.println("Select Standard of Material");
        System.out.println("1.Standard Materials");
        System.out.println("2.Above Standard Materials");
        System.out.println("3.High Standard Materials");
        System.out.println("\nEnter your choice:");
        material_choice=ob.nextInt();
        System.out.println("Do you want fully Automated house?\n Enter 1 if YES\n Enter 0 if NO");
        selected_choice=ob.nextInt();
        compute(square_feet,material_choice,selected_choice);
        
    }
    static void compute(int square_feet,int material_choice,int selected_choice)
    {
        HouseCost h=new HouseCost();
        int cost=h.total_cost(square_feet,material_choice,selected_choice);
        if(cost!=0)
        System.out.println("Total construction cost is "+cost+"INR");
        
    }
}
