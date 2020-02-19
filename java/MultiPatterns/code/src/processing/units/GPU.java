package processing.units;

/**
 * @author rhau
 * GPU model class
 */
public class GPU {
	
	private String model;
	private Integer year;
	private String memory;
	private ClockInterval clockInterval;
	
	public GPU() {
	}
	
	/**
	 * @param model
	 */
	public GPU(String model) {
		this.model = model;
	}
	
	/**
	 * @param model
	 * @param year
	 * @param memory
	 * @param clockInterval
	 */
	public GPU(String model, Integer year, String memory, ClockInterval clockInterval) {
		this.model = model;
		this.year = year;
		this.memory = memory;
		this.clockInterval = clockInterval;
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
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}
	/**
	 * @param memory the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GPU [model=" + model + ", year=" + year + ", memory=" + memory + ", clockInterval=" + clockInterval
				+ ", getModel()=" + getModel() + ", getYear()=" + getYear() + ", getMemory()=" + getMemory()
				+ ", getClockInterval()=" + getClockInterval() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
