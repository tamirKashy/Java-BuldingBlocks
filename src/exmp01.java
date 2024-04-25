import java.util.Scanner;

public class exmp01 {
    public static void exmp()
    {
        Scanner s = new Scanner(System.in);
        //
        int i,j,k;
        double Price, TotalPrice;
        float Tax = 0.17F;


        //Core:

        System.out.println("...Starting system...");

        System.out.println("What is the products before tax price?");
        Price = s.nextDouble();
        //System.out.println("What is the tax %? (100-0)");
        //Tax = s.nextInt();

        //TotalPrice = Price * (1 -(Tax/100));
        TotalPrice = Price * (1-Tax);

        System.out.printf("After taxes price is: " + "%.2f", TotalPrice);
    }
}
