package entrypoint;

import operational.systems.OperatingSystem;
import processing.units.CPU;
import processing.units.GPU;
import storage.FileComposite;
import storage.types.TextFile;
import visualization.AbstractWindow;

/**
 * @author rhau
 * System facade superclass
 */
public abstract class SystemFacade {

	private AbstractWindow systemInterface;
	private FileComposite fileSystem;
	private OperatingSystem operatingSystem;
	private CPU cpuComponent;
	private GPU gpuComponent;
	
	public abstract void startSystem();
	public abstract void createSystemInterface();
	public abstract void createFileSystem();
	public abstract void createOperatingSystem();
	public abstract void createVirtualProcessingUnits();
	
	public void insertFile(String filename) {
		this.getFileSystem().addFile(new TextFile(filename));
	}
	
	/**
	 * @return the systemInterface
	 */
	public AbstractWindow getSystemInterface() {
		return systemInterface;
	}
	/**
	 * @param systemInterface the systemInterface to set
	 */
	public void setSystemInterface(AbstractWindow systemInterface) {
		this.systemInterface = systemInterface;
	}
	/**
	 * @return the fileSystem
	 */
	public FileComposite getFileSystem() {
		return fileSystem;
	}
	/**
	 * @param fileSystem the fileSystem to set
	 */
	public void setFileSystem(FileComposite fileSystem) {
		this.fileSystem = fileSystem;
	}
	/**
	 * @return the operationalSystem
	 */
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}
	/**
	 * @param operatingSystem the operationalSystem to set
	 */
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	/**
	 * @return the cpuComponent
	 */
	public CPU getCpuComponent() {
		return cpuComponent;
	}
	/**
	 * @param cpuComponent the cpuComponent to set
	 */
	public void setCpuComponent(CPU cpuComponent) {
		this.cpuComponent = cpuComponent;
	}
	/**
	 * @return the gpuComponent
	 */
	public GPU getGpuComponent() {
		return gpuComponent;
	}
	/**
	 * @param gpuComponent the gpuComponent to set
	 */
	public void setGpuComponent(GPU gpuComponent) {
		this.gpuComponent = gpuComponent;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SystemFacade [systemInterface=" + systemInterface + ", fileSystem=" + fileSystem
				+ ", operationalSystem=" + operatingSystem + ", cpuComponent=" + cpuComponent + ", gpuComponent="
				+ gpuComponent + "]";
	}

}
