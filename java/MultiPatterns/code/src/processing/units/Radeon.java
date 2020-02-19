package processing.units;

/**
 * @author rhau
 * Radeon family (AMD GPU subclass)
 */
public class Radeon extends GPU {

	public Radeon() {
		super("Radeon");
	}
	
	/**
	 * @param model
	 * @param year
	 * @param memory
	 * @param clockInterval
	 */
	public Radeon(String model, Integer year, String memory, ClockInterval clockInterval) {
		super(model, year, memory, clockInterval);
	}
	
}
