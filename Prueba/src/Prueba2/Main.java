package Prueba2;

public class Main {
	public static void main(String args[]){
		Calculadora obj1 = new Calculadora(2,4);   //se declara un nuebo objeto y sus valores = a "Calculadora" que es la clase donde dse llamar� a las operaciones 
		obj1.suma();                               //se iguala el nuevo objeto a los metodos que deben ser utilizados en "calculadora"
		obj1.resta();
		obj1.multi();
		obj1.div();
		System.out.println("La suma es: " + obj1.resultado1);      //Se imprime la nueva l�nea y el obj1." "  a  resultado que se va a devolver, donde esta alamacenado la operaci�n
		System.out.println("La resta es: " + obj1.resultado2);
		System.out.println("La multiplicaci�n es: " + obj1.resultado3);
		System.out.println("La divisi�n es: " + obj1.resultado4);
	}

}
