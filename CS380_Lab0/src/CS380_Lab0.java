package packagetest;

public class CS380_Lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First lab CS 380");
		System.out.println(reverseInt(12345));
	}
	public static int reverseInt(int num) {
	    int reversed = 0;
	    while (num != 0) {
	        int digit = num % 10;
	        reversed = reversed * 10 + digit;
	        num /= 10;
	    }
	    return reversed;
	}
}

