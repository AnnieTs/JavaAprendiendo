package Prueba1;
public class Suma {
		public static void main(String  arg[]){
			CalculadoraTele calculadora1 = new CalculadoraTele(2, 65);
			System.out.println("La suma es: " + calculadora1.suma());
			System.out.println("La resta es: " + calculadora1.resta());
			System.out.println("La multiplicacion es: " + calculadora1.multi());
			System.out.println("La division es: " + calculadora1.div());
			CalculadoraTele calculadora2 = new CalculadoraTele(2, 2);
			System.out.println("La potencia es: " + calculadora2.Potencia(3));
		}
}