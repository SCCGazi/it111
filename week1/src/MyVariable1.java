public class MyVariable1
{
    public static void main(String[] args)
    {
        String name = "Gazi";//after a statement do not forget the semicolon!
        int hours = 40;// we are assigning 40 to the hours variable
        //please note, when we have a string value, it is nested in ""
        //when we are referring to numbers/integers, no quotes!!!
        System.out.println(name);
        System.out.println(hours);

        String building, tree, lake, ocean;
        tree = "Redwood";
        building = "Empire State";
        lake = "Lake Superior";
        ocean = "Pacific Ocean";

        int weeks, decades, months, years;
        weeks = 4;
        decades = 10;
        months = 3;
        years = 5;

        System.out.println(tree);
        System.out.println(building);
        System.out.println(lake);
        System.out.println(ocean);
        System.out.println(weeks);
        System.out.println(decades);
        System.out.println(months);
        System.out.println(years);

        boolean dry = false;

        if(dry)
        {
            System.out.println("Time to hang up those curtains!!!");
        }
        else
        {
            System.out.println("We will have to wait a spell!");
        }
        char best = 'A';
        System.out.println(++best);
    }
}