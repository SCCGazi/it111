package package_person_homework;

import java.time.Year;

public class Person
{
    // This file does not have a main method
    // We will start typing fields (variables)
    public static final double rate = 3.2;
    public static final double constant = 2;
    String  name;
    char gender;
    int age, carAge;
    String car;

    boolean violations;
    double creditScore;

    public void display()
    {
        System.out.println("Customer name: " + name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Car: "+car);
        System.out.println("Your car: "+carAge);
        System.out.println("Violations: "+violations);
        System.out.println("Credit Score: "+creditScore);
    }

    // Our logic is regarding our credit score and violations.
    public double getRate(double monthlyRate)
    {
        if(violations == true && creditScore <= 700)
        {
            monthlyRate = 500;
        }
        else
        {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate)
    {
        if(gender == 'M' && age <= 25)
        {
            adjustedRate = 100;
        }
        else
        {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double ageCost(int carAge)
    {
        if(carAge == 0 )
        {
            return 154;
        }
        else if(carAge > 0 && carAge < 30)
        {
            return  154-carAge*rate;
        }
        else if(carAge<0)
        {
            System.out.println("Error! Vehicle age is wrong");
            return 0;
        }
        else
        {
            return 154-carAge*constant;
        }
    }

}
