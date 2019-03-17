package Calculations;

public class HouseCost {

    public int total_cost(int square_feet,int material_choice,int selected_choice)
    {
        int total_sum=0;
        if(material_choice!=3 && selected_choice==1)
        {
            System.out.println("You need to opt HIGH STANDARD MATERIALS to have a fully automated house");
        }
        else
        {
            switch(material_choice)
            {
            case 1:
                   total_sum=square_feet*1200;
                   break;
            case 2:
                total_sum=square_feet*1500;
                break;
            case 3:
                {
                    if(selected_choice==1)
                    {
                        total_sum=square_feet*2500;
                    }
                    else
                    {
                        total_sum=square_feet*1800;
                    }
                }
                break;  
            }
            return total_sum;
        }
        return 0;
    }
}
