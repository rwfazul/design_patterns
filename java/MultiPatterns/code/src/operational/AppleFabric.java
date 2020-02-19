package operational;

import operational.systems.IOS;
import operational.systems.OperatingSystem;

/**
 * @author rhau
 * Apple iOS fabric
 */
public class AppleFabric implements OperatingSystemFabric {

	@Override
	public OperatingSystem createOperatingSystem() {
		return new IOS();
	}

}

