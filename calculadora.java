import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num1, num2, resultado, respuesta;
		System.out.println("Ingrese el primer numero");
		num1 = obj.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = obj.nextInt();
		System.out.println("¿Cual es la operacion que va a realizar?");
		System.out.println("Elija una opcion");
		System.out.println("1._Suma 2._Resta 3._Multiplicacion 4._Division 5._Modulo");
		respuesta=obj.nextInt();
		

	}

}