package processing.units;

/**
 * @author rhau
 * Base and turbo clock for CPU and GPU
 */
public class ClockInterval {

	private Double baseClock;
	private Double turboClock;
	
	/**
	 * @param baseClock
	 * @param turboClock
	 */
	public ClockInterval(Double baseClock, Double turboClock) {
		this.baseClock = baseClock;
		this.turboClock = turboClock;
	}
	/**
	 * @return the baseClock
	 */
	public Double getBaseClock() {
		return baseClock;
	}
	/**
	 * @param baseClock the baseClock to set
	 */
	public void setBaseClock(Double baseClock) {
		this.baseClock = baseClock;
	}
	/**
	 * @return the turboClock
	 */
	public Double getTurboClock() {
		return turboClock;
	}
	/**
	 * @param turboClock the turboClock to set
	 */
	public void setTurboClock(Double turboClock) {
		this.turboClock = turboClock;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClockInterval [baseClock=" + baseClock + ", turboClock=" + turboClock + ", getBaseClock()="
				+ getBaseClock() + ", getTurboClock()=" + getTurboClock() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
