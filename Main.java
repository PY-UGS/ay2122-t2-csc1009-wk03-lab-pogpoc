package Pract3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Loan loan;
		double annualInterestRate, loanAmount;
		int noOfYears;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter annual interest rate, for example, 8.25: ");
		annualInterestRate = scanner.nextDouble();
		System.out.print("Enter number of years as an integer: ");
		noOfYears = scanner.nextInt();
		System.out.print("Enter loan amount, for example, 120000.95: ");
		loanAmount = scanner.nextDouble();

		loan = new Loan(annualInterestRate, noOfYears, loanAmount);

		System.out.println("The loan was created on " + loan.getLoanDate().toString());
		System.out.printf("The monthly payment is %.2f\n", loan.getMonthlyPayment());
		System.out.printf("The total payment is %.2f", loan.getTotalPayment());

		scanner.close();
	}
}