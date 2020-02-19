package operational.systems;

/**
 * @author rhau
 * Linux Ubuntu OS
 */
public class Ubuntu extends OperatingSystem {

	public Ubuntu() {
		setTradeName("Ubuntu OS");
		setVersion("Ubuntu 19.10");
		setAlias("Ubuntu open source OS");
	}
	
	@Override
	public void showSystemInfo() {
		System.out.print("- OS: Ubuntu -> ");
		System.out.println(this.toString());	
	}

}
