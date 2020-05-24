package Firstlesson;

public class Task07 {
	public static void main(String[] args) {
		int a = 5000; // сумма вклада
		double x = 2 / 100; // числовое выражение процента вклада
		double length1 = a + (a * x); // сумма вклада за первый год
		double length2 = a + (2 * a * x); // сумма вклада за второй год
		
		System.out.println ("Сумма вклада за два года составляет" + length2);
	}

}
