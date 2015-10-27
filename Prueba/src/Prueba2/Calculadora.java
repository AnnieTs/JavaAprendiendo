package Prueba2;

//Private = sólo pueden ser utilizados en la misma clase = protected
//Public = pueden ser utilizados en otras clases
public class Calculadora {
	private int n1;
	private int n2;
	public int resultado1;
	public int resultado2;
	public int resultado3;
	public int resultado4;
	
	public Calculadora(int n1, int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}

	public void suma() {
		resultado1 = n1 + n2;
	}

	public void resta() {
		resultado2 = n1 - n2;
	}

	public void multi() {
		resultado3 = n1 * n2;
	}
	

	public void div() {
		resultado4 = n1 / n2;
	}
	
	
}
