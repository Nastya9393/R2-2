package Firstlesson;

public class Task09 {
	public static void main(String[] args) {
		double[] numbers = {3.14, 2.5, 5.0, 10.0};
			
		for (int i = 0; i < numbers.length; i++) {
		
		   if (numbers[i] % 1 == 0) {
		   System.out.println ("число " + numbers[i] + " не имеет вещественной части");		
		   continue;
		   }
		   System.out.println ("число " + numbers[i] + " имеет вещественную часть");
		}
	}
}
        