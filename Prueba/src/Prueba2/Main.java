package Prueba2;

public class Main {
	public static void main(String args[]){
		Calculadora obj1 = new Calculadora(2,4);
		obj1.suma();
		obj1.resta();
		obj1.multi();
		obj1.div();
		System.out.println("La suma es: " + obj1.resultado1);
		System.out.println("La resta es: " + obj1.resultado2);
		System.out.println("La multiplicación es: " + obj1.resultado3);
		System.out.println("La división es: " + obj1.resultado4);
	}

}
