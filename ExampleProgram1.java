class ExampleProgram1
{
	public static void main(String args[])
	{
		int num=237569;
		int last=num%1000;
		int first=num/1000;
		//int temp=0;
		if(first%2==0 && last%2==0)
		{
		        int temp=first;
			first=last;
			last=temp;
			System.out.println("first value is : "+first);
			System.out.println("last value is : "+last);
		}
		else if(first%2==0 || last%2==0)
		{
			int num1=5;
			int firstLast=first%10;
			int lastLast=last%10;
			if(firstLast==num1 && lastLast==num1)
			   System.out.println("The last digit is 5 ");
			else
			   System.out.println("5 is not a Last Digit");
		}
		else
		{
			if(first%7==0 && last%9==0 )
			   System.out.println("7 is divisble");
			else if(first%9==0 && last%7==0)
			   System.out.println("9 is divisible ");
			else
			   System.out.println("7 and 9 is not divisible");
		}
		
	}

}