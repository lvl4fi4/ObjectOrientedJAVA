package ir.object.ahmadreza;

public class LightRoom {
	private boolean ison;
	LightRoom(){
		ison=false;
	}
	public void presslamp(){
		ison=!ison;
	}
	
}
