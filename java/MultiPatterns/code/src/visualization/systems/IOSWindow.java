package visualization.systems;

import visualization.ConcreteWindow;

/**
 * @author rhau
 * Concrete window for iOS
 */
public class IOSWindow implements ConcreteWindow {

	@Override
	public void drawWindow(String title, String body) {
		System.out.println("\t------------------ iOS ------------------");
		System.out.println("\t\t\t" + title);
		System.out.println("\t" + body);
		System.out.println("\t-----------------------------------------");
	}

	@Override
	public void drawOption(String label, Boolean defaultValue) {
		String radio = defaultValue ? "(X)" : "( )";
		System.out.println(radio + " " + label);
	}

}
