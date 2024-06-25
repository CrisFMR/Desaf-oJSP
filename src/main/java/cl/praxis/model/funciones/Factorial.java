package cl.praxis.model.funciones;

public class Factorial {
	
	public static int getFact(int integer) {
		// TODO Auto-generated method stub
		int value = 1;
		for (int i = 2; i <= integer; i++) {
			value *= i;
		}
		return value;
	}
}
