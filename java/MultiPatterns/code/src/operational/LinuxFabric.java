package operational;

import operational.systems.OperatingSystem;
import operational.systems.Ubuntu;

/**
 * @author rhau
 * Linux OS fabric
 */
public class LinuxFabric implements OperatingSystemFabric {

	@Override
	public OperatingSystem createOperatingSystem() {
		return new Ubuntu();
	}

}
