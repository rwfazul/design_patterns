package operational.systems;

/**
 * @author rhau
 * Microsoft Windows OS
 */
public class Windows extends OperatingSystem {

	public Windows() {
		setTradeName("Windows OS");
		setVersion("Windows 10");
		setAlias("Microsoft Windows OS");
	}
	
	@Override
	public void showSystemInfo() {
		System.out.print("- OS: Microsoft Windows -> ");
		System.out.println(this.toString());
	}

}
