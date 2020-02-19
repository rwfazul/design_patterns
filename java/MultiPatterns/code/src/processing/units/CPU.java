package processing.units;

/**
 * @author rhau
 * CPU model class
 */
public class CPU {
	
	private String model;
	private Integer threads;
	private Integer cores;
	private ClockInterval clockInterval;
	private Boolean hasIntegratedGraphics;
	
	public CPU() {
	}
	
	/**
	 * @param model
	 */
	public CPU(String model) {
		this.model = model;
	}
	
	/**
	 * @param model
	 * @param threads
	 * @param cores
	 * @param clockInterval
	 * @param hasIntegratedGraphics
	 */
	public CPU(String model, Integer threads, Integer cores, ClockInterval clockInterval,
			Boolean hasIntegratedGraphics) {
		this.model = model;
		this.threads = threads;
		this.cores = cores;
		this.clockInterval = clockInterval;
		this.hasIntegratedGraphics = hasIntegratedGraphics;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the threads
	 */
	public Integer getThreads() {
		return threads;
	}
	/**
	 * @param threads the threads to set
	 */
	public void setThreads(Integer threads) {
		this.threads = threads;
	}
	/**
	 * @return the cores
	 */
	public Integer getCores() {
		return cores;
	}
	/**
	 * @param cores the cores to set
	 */
	public void setCores(Integer cores) {
		this.cores = cores;
	}
	/**
	 * @return the clockInterval
	 */
	public ClockInterval getClockInterval() {
		return clockInterval;
	}
	/**
	 * @param clockInterval the clockInterval to set
	 */
	public void setClockInterval(ClockInterval clockInterval) {
		this.clockInterval = clockInterval;
	}
	/**
	 * @return the hasIntegratedGraphics
	 */
	public Boolean getHasIntegratedGraphics() {
		return hasIntegratedGraphics;
	}
	/**
	 * @param hasIntegratedGraphics the hasIntegratedGraphics to set
	 */
	public void setHasIntegratedGraphics(Boolean hasIntegratedGraphics) {
		this.hasIntegratedGraphics = hasIntegratedGraphics;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CPU [model=" + model + ", threads=" + threads + ", cores=" + cores + ", clockInterval=" + clockInterval
				+ ", hasIntegratedGraphics=" + hasIntegratedGraphics + "]";
	}
	
}