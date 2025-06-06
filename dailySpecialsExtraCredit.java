import java.util.Scanner;
public class dailySpecialsExtraCredit
{
    public static void main(String[] args)
    {
        String specials;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the week excluding weekends Monday - Friday only!");
        specials = input.next();
        // in the world of coffee, I need a name of a coffee beverage and a price.
        String coffee;
        double price;
        boolean saturday = false;
        boolean sunday = false;
        while(specials.equals("Saturday") || specials.equals("saturday") || specials.equals("SATURDAY") || specials.equals("Sunday") || specials.equals("sunday") || specials.equals("SUNDAY"))
        {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }
        
        String lowerStr = specials.toLowerCase();
        specials = capitalizeFirstLetter(lowerStr);

        switch(specials)
        {
            //my cases will be the day of the week.
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                Calculate(coffee,specials,price);
                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                Calculate(coffee,specials,price);
                break;

            case "Wednesday":
                coffee = "Cappucino";
                price = 4.35;
                Calculate(coffee,specials,price);
                break;

            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                Calculate(coffee,specials,price);
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                Calculate(coffee,specials,price);
                break;
        }
    }

    public static String capitalizeFirstLetter(String str)
    {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void Calculate(String Coffee,String Specials, double Price)
    {
        Scanner input = new Scanner(System.in);
        double calculation;
        byte order;
        System.out.println(Specials+"'s coffee of the day is a " +Coffee+ " and price will be $" +Price);
        System.out.println("How many " +Coffee+ " would you like to order?");
        order = input.nextByte();
        if( order == 0){System.out.println("Looks like you don't like "+Coffee+"! So sad!!!");}
        else if(order == 1){System.out.println("Looks like you will be ordering only 1 "+Coffee+" today!");}
        else
        {
            calculation = order * Price;
            System.out.print(order+" "+Coffee+"s have been ordered totalling $");
            System.out.printf("%.2f",calculation);
            System.out.print(" dollars. ");
            System.out.print("Thank you for your order!");
        }
    }
}
