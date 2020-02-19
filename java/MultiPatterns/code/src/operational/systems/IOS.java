package operational.systems;

/**
 * @author rhau
 * Apple iOS
 */
public class IOS extends OperatingSystem {

	public IOS() {
		setTradeName("iOS");
		setVersion("iOS 13");
		setAlias("Apple's Operating System");
	}
	
	@Override
	public void showSystemInfo() {
		System.out.print("- OS: IOS -> ");
		System.out.println(this.toString());
	}
	
}
