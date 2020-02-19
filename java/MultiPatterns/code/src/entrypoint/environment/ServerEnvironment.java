package entrypoint.environment;

import entrypoint.SystemFacade;
import operational.LinuxFabric;
import operational.OperatingSystemFabric;
import processing.IntelFabric;
import processing.ProcessingUnitFabric;
import storage.FileComposite;
import visualization.StartupWindow;
import visualization.systems.LinuxWindow;

/**
 * @author rhau
 * Config for server env
 */
public class ServerEnvironment extends SystemFacade {

	@Override
	public void startSystem() {
		createVirtualProcessingUnits();
		createOperatingSystem();
		createFileSystem();
		createSystemInterface();
	}

	@Override
	public void createSystemInterface() {
		this.setSystemInterface(new StartupWindow(new LinuxWindow()));
	}

	@Override
	public void createFileSystem() {
		this.setFileSystem(new FileComposite("/root"));
		System.out.println("- Mounting point: " + this.getFileSystem().getFilename());
	}

	@Override
	public void createOperatingSystem() {
		OperatingSystemFabric operationalSystemFabric = new LinuxFabric();
		this.setOperatingSystem(operationalSystemFabric.createOperatingSystem());	
		this.getOperatingSystem().showSystemInfo();
	}

	@Override
	public void createVirtualProcessingUnits() {
		ProcessingUnitFabric processingUnitfabric = IntelFabric.getInstance();
		this.setCpuComponent(processingUnitfabric.produceCPU());
		this.setGpuComponent(processingUnitfabric.produceGPU());
		System.out.println("- CPU: " + this.getCpuComponent().getModel());
		System.out.println("- GPU: " + this.getGpuComponent().getModel());
	}

}
