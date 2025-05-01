public class LitersToGallonsConverter
{
     public static final double constant = 3.78541;// This is a constant value to convert the gallon to the liter.
     public static void main(String[] args)
     {
         byte counter = 0;
         int gallon;
         double liter;
         String plural = "gallons", singular = "gallon", message;

         for(gallon = 1 ; gallon <= 100; gallon = gallon + 4)
         {
             counter++;
             if(gallon == 1)
             {
                 message = singular;
             }
             else
             {
                 message = plural;
             }
             liter = gallon * constant;
             System.out.printf("%.2f", liter);
             System.out.println(" Liters = "+gallon+" "+message);
             int result = counter % 5;
             if(result == 0 ){System.out.println();} //if reminder is zero, leave an empty space
         }
         System.out.println("We are done!!!");
     }
}
