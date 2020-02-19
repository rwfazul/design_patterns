package visualization;

/**
 * @author rhau
 * Concrete window
 */
public interface ConcreteWindow {

	void drawWindow(String title, String body);
	void drawOption(String label, Boolean defaultValue);
	
}
