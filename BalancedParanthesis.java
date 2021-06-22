package com.bridgeLabz.dataStructurePrograms
public class BalancedParentheses
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter max size: ");
		int n=sc.nextInt();
	

		/* Creating Stack */
		StackLogic stack = new StackLogic(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String expression = sc.next();        
		int len = expression.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = expression.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
 }
