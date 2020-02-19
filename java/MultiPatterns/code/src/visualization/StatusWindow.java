package visualization;

/**
 * @author rhau
 * Status window for all OS
 */
public class StatusWindow extends AbstractWindow {

	/**
	 * @param window
	 */
	public StatusWindow(ConcreteWindow window) {
		super(window);
		this.draw();
	}

	@Override
	public void draw() {
		drawWindow("Status", "O sistema está operando normalmente");
	}

}
