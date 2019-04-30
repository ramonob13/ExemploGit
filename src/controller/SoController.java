package controller;

public class SoController {
	
	public SoController() {
		super();
	}
	
	public String os() {
		return System.getProperty("os.name");
	}
	
	public String version() {
		return System.getProperty("os.version");
	}

}
