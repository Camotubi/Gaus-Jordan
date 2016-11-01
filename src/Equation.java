public class Equation
{
	private double[] coef = new double[100];
	private int numVars;
	public Equation(int numVars)
	{
		this.numVars=numVars;
	}
	public double[] getCoef()
	{
		return coef;
	}
	public double getCoef(int numVar)
	{
		return coef[numVar];
	}
	public void setCoef(double[] array)
	{
		coef = array;
	}
	public void setCoef(int varNum, double coef)
	{
		coef[varNum] = coef;
	}
	public int getNumVars()
	{
		return numVars;
	}
}
