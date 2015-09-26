//Son Ngo

import java.util.Scanner;

public class Week5_Homework
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double num1, num2;
		String op;

		System.out.print("Please enter the first number: ");
		num1 = input.nextFloat();
		System.out.print("Please enter the second number: ");
		num2 = input.nextFloat();
		System.out.print("Please enter the arithmetical operation (+, -, x, /): ");
		op = input.next();

		while (!op.equals("+") && !op.equals("-") && !op.equals("x") && !op.equals("/"))
		{
			System.out.print("Please enter the operation again (+, -, x, /): ");
			op = input.next();
		}

		if (op.equals("+"))
			System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
		if (op.equals("-"))
			System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
		if (op.equals("x"))
			System.out.printf("%f x %f = %f", num1, num2, num1 * num2);
		if (op.equals("/"))
			System.out.printf("%f / %f = %f", num1, num2, num1 / num2);

	}

}
