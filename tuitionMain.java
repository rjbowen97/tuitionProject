import java.util.Scanner;

public class tuitionMain {
	
	private static double tuitionCost = 0;
	private static double repaymentAPR = 0;
	private static double yearsToRepay = 0;
	private static double totalCost = 0;
	private static double tuitionPercentIncrease = 0;
	
	public static void main(String[] args)
	{
		//scanner block
		Scanner userInput = new Scanner(System.in);
		System.out.println("Current tuition cost: ");
		tuitionCost = userInput.nextDouble();
		System.out.println("APR percentage for student loan: "); //percentage charged for borrowing
		repaymentAPR = userInput.nextDouble()/100;
		System.out.println("Years to repay loan: ");
		yearsToRepay = userInput.nextDouble();
		//end scanner block
		
		for (double year = 0; year < 4; year++) //go through each year and calculate and sum individual tuitions
		{
			System.out.println("Percent increase of tuition for year " + year + ": ");
			tuitionPercentIncrease = userInput.nextDouble()/100;
			tuitionCost *= (1+tuitionPercentIncrease); //increase tuition cost by given percentage
			totalCost += futureValueCalculator(tuitionCost, repaymentAPR, 1); //call futureValueCalculator and add returned value to the student's total cost
		}
		
		System.out.printf("Total: $%2.2f", totalCost); //format with dollar sign in front and round to two decimal places
		System.out.println("");
		System.out.printf("$%2.2f per year for " + yearsToRepay + " years", totalCost/yearsToRepay); //display total amount owed divided by years to pay
	}
	
	/**
	 * This method calculates the future value of the tuition
	 *
	 * @param  presentValue The value of the tuition in the present iteration
	 * @param  APR The value of the APR
	 * @param  investmentPeriod The amount of years the investment takes place over (always one in this case)
	 * 
	 * @return      the future value of the tuition taking into account all of the variables
	 * @see         Image
	 */
	public static double futureValueCalculator(double presentValue, double APR, double investmentPeriod)
	{
		return(presentValue * Math.pow((1+APR),investmentPeriod));
	}

}
