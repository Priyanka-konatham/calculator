/**
 * Program to calculate addition,subtraction and multiplication of two numbers
 */

/**
 * @author priyanka
 *
 */
public class Calcy {
	/**
	 * Returns sum of two numbers
	 * @param operand1 first number to be added
	 * @param operand2 second number to be added
	 * @return sum of operand1 and operand2
	 */
	public double add(double operand1,double operand2) {
		return (operand1+operand2);
	}
	/**
	 * Returns product of two numbers
	 * @param operand1 first number to be multiplied
	 * @param operand2 second number to be multiplied
	 * @return product of operand1 and operand2
	 */
	public double multiply(double operand1,double operand2) {
		return (operand1*operand2);
	}
	/**
	 * Returns quotient upon division of two numbers
	 * @param operand1 Dividend in the division
	 * @param operand2 Divisor in the division
	 * @return
	 */
	public double divide(double operand1,double operand2) {
		if(operand2!=0) {
			return (operand1/operand2);
		}
		else 
			return 0;
	}
}
