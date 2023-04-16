package practic2;

public class maximumlengthword 
{
public static void main(String[] args) 
{
	String s="Aspire Tranining123 INstitute Pune";
	int maxword=0;
	String temp=" ";
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++) 
	{
		if(a[i].length()>maxword) 
		{
			maxword=a[i].length();
			temp=a[i];
		}
		}
	System.out.println(temp);
	}
}

