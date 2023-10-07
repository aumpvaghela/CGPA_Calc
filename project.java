package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class project 
{
	Scanner sc= new Scanner(System.in);
	double cgpa=0,sum=0;
	int m[]=new int[4];
	int n;
	String name;
	int en,sem;
	void input()
	{
			System.out.println("Enter student name : ");
			name=sc.next();
			System.out.println("Enter Enrollment No. : ");
			en=sc.nextInt();
	
			System.out.println("Enter semister : ");
			sem=sc.nextInt();
			System.out.println("Enter marks of subjects  : ");
			for(int i=0;i<4;i++)
			{
				 m[i]=sc.nextInt();
			}
			for(int i=0;i<4;i++)
			{
				sum+=(m[i]/10);
			}
			cgpa=sum/4;
			
			try
			{
				FileWriter fout=new FileWriter("D:\\Java\\CGPA.txt");
				/*if(fout.createNewFile())
				{
					System.out.println("Successful...\nFile Created with Name : "+fout.getName()+"\nFile created with path : "+fout.getAbsolutePath());
				}
				else
				{
					System.out.println("\nAlready Exist");
				}*/
				fout.write("\nName : "+name);
				fout.write("\nEnrollment No. : "+en);
				fout.write("\nSemister : "+sem);
				fout.write("\nCGPA : "+cgpa);
				fout.close();
				System.out.println("Successful");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}
	
	void search()
	{
		System.out.println("Enter Enrollment No. of student you want to search record for : ");
		n=sc.nextInt();
		if(n==en)
		{
			System.out.println();
			System.out.println("Name : "+name);
			System.out.println("Enrollment No. : "+n);
			System.out.println("CGPA : "+cgpa);
		}
		else
		{
			System.out.println("Invalid Enrollment No.");
		}
	}

	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		project p=new project();
		while(true)
		{
			System.out.println("........ADMIN MENU.........");
			System.out.println("1.Add student record and marks");
			System.out.println("2.Search student");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				p.input();
			}
			if(ch==2)
			{
				p.search();
			}
		}
		
	}

}
