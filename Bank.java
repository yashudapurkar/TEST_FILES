package Test;

import java.util.Scanner;

public class Bank 
{

	public void deposite()
	{
		System.out.println("Deposited Successfully...");
	}
	
	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		Scanner s=new Scanner(System.in);
		
		try 
		{
		System.out.println("Enter Deposite Amount : ");
		int amt=s.nextInt();
		
			if(amt<0) 
			{
				System.out.println("You Entered Invalid Amount..!");
			}
			else
			{
				bank.deposite();						
			}
		}			
		catch(Exception e)
		{
			System.out.println("You Enter Negative Amount...\nPlease Enter Positive Number Of Amount ..!!");
		}
		
		
	s.close();	
	}

}
