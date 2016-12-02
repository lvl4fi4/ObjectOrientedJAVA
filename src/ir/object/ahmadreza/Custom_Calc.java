package ir.object.ahmadreza;

public class Custom_Calc extends Calc {
	public void multiplication(int x, int y) {
		result = x * y;
		System.out.println("The product of the given numbers:" + result);

	}

	public void multiplication(int x, int y,int z) {
	      result = x * y*z;
	      System.out.println("The product of the given numbers:"+result);
}
}