package ir.object.ahmadreza;

class Calc {
	public int result;

	public void addition(int x, int y) {
		result = x + y;
		System.out.println("The sum of the given numbers:" + result);
	}
	//overloading
	public void addition(int x, int y,int z) {
		result = x + y+z;
		System.out.println("The sum of the given numbers:" + result);
	}

	public void Subtraction(int x, int y) {
		result = x - y;
		System.out.println("The difference between the given numbers:" + result);
	}
}
