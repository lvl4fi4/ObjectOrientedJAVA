package ir.object.ahmadreza;

interface animal{
	public abstract void speak();
}

class dog implements animal{
	@Override
	public void speak() {
		System.out.println("woof woof");
		
	}
}
class cat implements animal{
	@Override
	public void speak() {
		System.out.println("Mio Mio");
		
	}
}
public class Program {

	public static void main (String[] args) {
		animal ani=new dog();
		ani.speak();
		animal ani2=new cat();
		ani2.speak();
		
		
				
		
	}

}
