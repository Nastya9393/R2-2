package Firstlesson;

public class Task10 {
	public static void main(String[] args) {
		
		final int height = 60; //кг
		final int weight = 170; //см
		
		
		if ((weight - height) > 110) {
			System.out.println ("Вам необходимо набрать вес");
		}
		if ((weight - height) < 110) {
			System.out.println ("Вам необходимо сбросить вес");
		}
		if ((weight - height) == 110) {
			System.out.println ("Ваш вес идеальный");
		}
}
}