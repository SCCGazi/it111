package package_person_homework;

public class PersonDetails
{
    // this file will have a main method
    public static void main(String[] args)
    {
        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;
        // I am in the process of creating an object from my Person class
        // We just created an object named firstPerson
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();
        // We will be entering the info, assigning values to our fields
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.carAge = 0;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Mustang";
        secondPerson.carAge = 50;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = "Lexus";
        thirdPerson.carAge = 12;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for "+firstPerson.name+": " +firstPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+firstPerson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Vehicle age adjustments: ");
        System.out.printf("%.2f", firstPerson.ageCost(firstPerson.carAge));
        System.out.println(" dollars");
        System.out.print("Here is "+firstPerson.name+"'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate)+firstPerson.ageCost(firstPerson.carAge));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for "+secondPerson.name+": " +secondPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+secondPerson.assumeGender(adjustedRate)+"dollars");
        System.out.print("Vehicle age adjustments: ");
        System.out.printf("%.2f", secondPerson.ageCost(secondPerson.carAge));
        System.out.println(" dollars");
        System.out.print("Here is "+secondPerson.name+"'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.ageCost(secondPerson.carAge));
        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for "+thirdPerson.name+": " +thirdPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+thirdPerson.assumeGender(adjustedRate)+"dollars");
        System.out.print("Vehicle age adjustments: ");
        System.out.printf("%.2f",thirdPerson.ageCost(thirdPerson.carAge));
        System.out.println(" dollars");
        System.out.print("Here is "+thirdPerson.name+"'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate) + thirdPerson.ageCost(thirdPerson.carAge));
    }
}

