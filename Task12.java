package Firstlesson;

public class Task12 {
	public static void main(String[] args) {
		int n = 56; // количество учеников в школе
		int a = 0; // стакан молока
		int b; // пакет молока 0,9л
		int c = n; // пирожок
		int m; //вес ученика, кг
		int d = 100; //процент учеников с весом меньше 30кг задается вручную
		
		for (double i = 0; i < ((n * d) / 100 ); i++ ) {	
				c++; a++;
		}
		b = a * 200 /900;
		// int result = (int)Math. ceil(b);
		
		System.out.println(b + " пакетов молока необходимо купить");
		System.out.println(c + " пирожков необходимо купить");
	
		
	}

}
