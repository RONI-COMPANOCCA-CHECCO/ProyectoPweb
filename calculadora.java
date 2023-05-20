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
		switch(respuesta) {
			case 1:
				resultado=num1+num2;
				System.out.println("La suma es igual a: "+resultado);
				break;
			case 2:
			    resultado=num1-num2;
			    System.out.println("La Resta es igual a: "+resultado);
			    break;				
			case 3:
			   resultado=num1*num2;
			   System.out.println("El Producto es igual a: "+resultado);
			   break;
			case 4:
			   resultado=num1/num2;
			   System.out.println("La Division es igual a: "+resultado);
			   break;
			case 5:
			   resultado=num1%num2;
			   System.out.println("El Modulo es igual a: "+resultado);
			   break;
			}

	}

}