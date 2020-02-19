package visualization;

/**
 * @author rhau
 * Abstract window superclass
 */
public abstract class AbstractWindow {

	protected ConcreteWindow window;
	
	public AbstractWindow(ConcreteWindow window) {
		this.window = window;
	}
	
	public void drawWindow(String title, String body) {
		this.window.drawWindow(title, body);
	}
	
	public void drawOption(String label, Boolean defaultValue) {
		this.window.drawOption(label, defaultValue);
	}
	
	public abstract void draw();
	
}
