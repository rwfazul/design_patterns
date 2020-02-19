package visualization;

/**
 * @author rhau
 * Startup window for all OS
 */
public class StartupWindow extends AbstractWindow {

	/**
	 * @param window
	 */
	public StartupWindow(ConcreteWindow window) {
		super(window);
		this.draw();
	}

	@Override
	public void draw() {
		drawWindow("Status", "O sistema foi inicializado com sucesso");
	}

}
