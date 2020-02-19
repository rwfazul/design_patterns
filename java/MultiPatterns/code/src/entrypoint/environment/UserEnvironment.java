package entrypoint.environment;

import entrypoint.SystemFacade;
import operational.OperatingSystemFabric;
import operational.WindowsFabric;
import processing.AMDFabric;
import processing.ProcessingUnitFabric;
import storage.FileComposite;
import visualization.StartupWindow;
import visualization.systems.WindowsWindow;

/**
 * @author rhau
 * Config for user env
 */
public class UserEnvironment extends SystemFacade {
	
	@Override
	public void startSystem() {
		createVirtualProcessingUnits();
		createOperatingSystem();
		createFileSystem();
		createSystemInterface();
	}

	@Override
	public void createSystemInterface() {
		this.setSystemInterface(new StartupWindow(new WindowsWindow()));
	}

	@Override
	public void createFileSystem() {
		this.setFileSystem(new FileComposite("C://"));
		System.out.println("- Mounting point: " + this.getFileSystem().getFilename());
	}

	@Override
	public void createOperatingSystem() {
		OperatingSystemFabric operationalSystemFabric = new WindowsFabric();
		this.setOperatingSystem(operationalSystemFabric.createOperatingSystem());	
		this.getOperatingSystem().showSystemInfo();
	}

	@Override
	public void createVirtualProcessingUnits() {
		ProcessingUnitFabric processingUnitfabric = AMDFabric.getInstance();
		this.setCpuComponent(processingUnitfabric.produceCPU());
		this.setGpuComponent(processingUnitfabric.produceGPU());
		System.out.println("- CPU: " + this.getCpuComponent().getModel());
		System.out.println("- GPU: " + this.getGpuComponent().getModel());
	}
	
}
