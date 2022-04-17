package mypackage;

public class MyClass {

	public static void main(String[] args) 
	{
		Product p = new Product(101,"tv",1000);
		p.printData();
		
		Product p2 = new Product ();
		p2.readData();
		p2.printData();
		
		System.out.println("comapny name is "+Product.company);
		Product.printCompany();
	}

}
