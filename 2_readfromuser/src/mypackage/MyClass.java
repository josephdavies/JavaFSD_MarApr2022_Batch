package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)
	{
		// variable declaration
        Scanner obj = new Scanner(System.in);
        String name;
        float salary;
        int age;
        
        //read data from user
        System.out.println("enter name:");
        name=obj.nextLine();
        System.out.println("enter salary:");
        salary=obj.nextFloat();
        System.out.println("enter age:");
        age=obj.nextInt();
        
        System.out.println("Name="+name);
        System.out.println("salary="+salary);
        System.out.println("age ="+age);
	}

}
