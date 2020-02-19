package visualization;

/**
 * @author rhau
 * Configuration window for all OS
 */
public class ConfigurationWindow extends AbstractWindow {

	/**
	 * @param window
	 */
	public ConfigurationWindow(ConcreteWindow window) {
		super(window);
		this.draw();
	}

	@Override
	public void draw() {
		drawOption("WiFi", true);
		drawOption("Notificações", true);
		drawOption("Modo noturno", true);
		drawOption("Bluetooth", false);
		drawOption("Modo Avião", false);
	}

}