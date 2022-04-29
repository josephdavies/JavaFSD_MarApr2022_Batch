package myotherpackage;

import mypackage.MyBaseClass;

class OtherPackageDerivedClass extends MyBaseClass
{
	public void otherPackageDerivedClassMethod()
	{
		a=5;
		b=10; //cant access private
		c=15;
		d=20;
	}
}

class OtherPackageOtherClass
{
	public void otherPackageOtherClassMethod()
	{
		MyBaseClass mb = new MyBaseClass();
		mb.a=5;
		mb.b=5;
		mb.c=5;
		mb.d=5;
	}
}


public class MyClass 
{
	public static void main(String[] args) 
	{
	OtherPackageDerivedClass obj = new OtherPackageDerivedClass(); 
	System.out.println(obj.a);
	}
}