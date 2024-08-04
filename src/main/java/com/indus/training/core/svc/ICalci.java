package com.indus.training.core.svc;

/**
 * Defines methods for performing basic arithmetic operations
 */
public interface ICalci {

	/**
	 * Description: Performs Addition of two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return
	 */

	public static double addition(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 + param2;
		}
		return result;

	}

	/**
	 * Description:Performs Subtraction of two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return
	 */

	public static double subtraction(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 - param2;
		}
		return result;

	}

	/**
	 * Description:Performs multiplication of two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return
	 */

	public static double multiplication(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 * param2;
		}
		return result;

	}

	/**
	 * Description: Performs division between two double values
	 * 
	 * @param param1 the first parameter
	 * @param param2 the second parameter
	 * @return
	 */

	public static double division(double param1, double param2) {
		double result = 0.0;
		{
			result = param1 / param2;
		}
		return result;

	}
}
