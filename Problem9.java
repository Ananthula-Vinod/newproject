class Problem9
{
	public static void main(String args[])
	{
		char ch='I';
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			if(ch>='a' && ch<='z')
			{
			  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				System.out.println(ch+"it is small vowel");
			  else
				System.out.println(ch+"it is small consonant");
			}
			else
			{
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				    System.out.println(ch+"it is  capital vowel");
				else
				   System.out.println(ch+"it is capital Consonant");
			}
		}
		else 
			System.out.println(ch+"it is not a character");
	}
}