package visualization.systems;

import visualization.ConcreteWindow;

/**
 * @author rhau
 * Concrete window for Linux OS
 */
public class LinuxWindow implements ConcreteWindow {

	@Override
	public void drawWindow(String title, String body) {
		System.out.println("\t<Ubuntu>");
		System.out.println("\t\t" + title);
		System.out.println("\t\t" + body);
		System.out.println("\t</Ubuntu>");
	}

	@Override
	public void drawOption(String label, Boolean defaultValue) {
		String radio = defaultValue ? "TRUE" : "FALSE";
		System.out.println(radio + " " + label);
	}

}
