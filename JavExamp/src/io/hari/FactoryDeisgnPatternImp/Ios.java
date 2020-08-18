package io.hari.FactoryDeisgnPatternImp;

public class Ios implements OS{

	@Override
	public void spec() {
			System.out.println("Secure OS");
	}
	
	public void spec1() {
		System.out.println("Secure OS 1");
	}
	
	public void spec2() {
		System.out.println("Secure OS 2");
	}
	
	public void spec3() {
		System.out.println("Secure OS 3");
	}
}
