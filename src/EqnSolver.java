public class EqnSolver
{
	private Equation[] Eqn;
	public Equation[] getEqn()
	{
		return Eqn;
	}
	public Equation sumEqns(int numEqnA,double eqnAMult, int numEqnB, double eqnBMult)
	{
			Equation eqnA = Eqn[numEqnA];
			Equation eqnB = Eqn[numEqnB];
			Equation sum= new Equation(eqnA.getNumVars());
			for(int i = 0; i<Eqn[numEqnA].getNumVars();i++)
			{
				sum.setCoef(i,(eqnA.getCoef(i)*eqnAMult)+(eqnB.getCoef(i)*eqnBMult));
			}
			return sum;

	}
}
