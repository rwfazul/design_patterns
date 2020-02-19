package visualization.systems;

import visualization.ConcreteWindow;

/**
 * @author rhau
 * Concrete window for Windows OS
 */
public class WindowsWindow implements ConcreteWindow {

	@Override
	public void drawWindow(String title, String body) {
		System.out.println("\t@@@   \tMicrosoft Windows\t  @@@");
		System.out.println("\t\t\t" + title);
		System.out.println("\t" + body);
		System.out.println("\t@@@   \t\t\t\t  @@@");
	}

	@Override
	public void drawOption(String label, Boolean defaultValue) {
		String radio = "Clique para ";
		radio += defaultValue ? "desativar" : "ativar";
		System.out.println(label + " " + radio);
	}

}
