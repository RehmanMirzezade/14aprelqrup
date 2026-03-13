package lesson2;

public class tpap {
	
	    public int Square(int number)
	    {
	        return number * number;
	    }

	    public static int Max(int a, int b)
	    {
	        return a > b ? a : b;
	    }

	    public boolean IsOdd(int number)
	    {
	        return number % 2 != 0;
	    }
		public class Main {
		    public static void main(String[] args) {

		        tpap obj = new tpap();

		        System.out.println(obj.Square(6));  // 36
		        System.out.println(obj.IsOdd(9));   // true

		        System.out.println(tpap.Max(3, 7)); // 7
		    }
		}

	}





