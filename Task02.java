package Firstlesson;

public class Task02 {
	public static void main(String[] args) {
		  int d = 356;
	        int e = 0;
	        while (d > 0){
	            e = e + (d % 10);
	            d = (d / 10);
	        }

	        System.out.println(e);

	}

}
