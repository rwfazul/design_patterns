package entrypoint.environment;

import entrypoint.SystemFacade;
import operational.AppleFabric;
import operational.OperatingSystemFabric;
import processing.AMDFabric;
import processing.IntelFabric;
import processing.ProcessingUnitFabric;
import storage.FileComposite;
import visualization.StartupWindow;
import visualization.systems.IOSWindow;

/**
 * @author rhau
 * System config for dev env
 */
public class DevelopmentEnvironment extends SystemFacade {

	@Override
	public void startSystem() {
		createVirtualProcessingUnits();
		createOperatingSystem();
		createFileSystem();
		createSystemInterface();
	}

	@Override
	public void createSystemInterface() {
		System.out.println("- Startup message: ");
		this.setSystemInterface(new StartupWindow(new IOSWindow()));
	}

	@Override
	public void createFileSystem() {
		this.setFileSystem(new FileComposite("/usr"));
		System.out.println("- Mounting point: " + this.getFileSystem().getFilename());
	}

	@Override
	public void createOperatingSystem() {
		OperatingSystemFabric operationalSystemFabric = new AppleFabric();
		this.setOperatingSystem(operationalSystemFabric.createOperatingSystem());	
		this.getOperatingSystem().showSystemInfo();
	}

	@Override
	public void createVirtualProcessingUnits() {
		ProcessingUnitFabric cpuFabric = IntelFabric.getInstance();
		ProcessingUnitFabric gpuFabric = AMDFabric.getInstance();
		this.setCpuComponent(cpuFabric.produceCPU());
		this.setGpuComponent(gpuFabric.produceGPU());
		System.out.println("- CPU: " + this.getCpuComponent().getModel());
		System.out.println("- GPU: " + this.getGpuComponent().getModel());
	}

}
