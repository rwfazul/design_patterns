package operational;

import operational.systems.OperatingSystem;
import operational.systems.Windows;

/**
 * @author rhau
 * Microsoft Windows OS fabric
 */
public class WindowsFabric implements OperatingSystemFabric {

	@Override
	public OperatingSystem createOperatingSystem() {
		return new Windows();
	}
}
