public class Calculadora
{
	public int n1;
	public int n2;
	
	public Calculadora(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}

	public int suma() {
		return n1 + n2;
	}

	public int resta() {
		return n1 - n2;
	}

	public int multi() {
		return n1 * n2;
	}

	public double div() {
		return (double)n1 / (double)n2;
	}
}
