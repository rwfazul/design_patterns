package processing.units;

/**
 * @author rhau
 * IntelGraphics family (GPU subclass)
 */
public class IntelGraphics extends GPU {
			
	public IntelGraphics() {
		super("Intel HD Graphics");
	}
	
	/**
	 * @param model
	 * @param year
	 * @param memory
	 * @param clockInterval
	 */
	public IntelGraphics(String model, Integer year, String memory, ClockInterval clockInterval) {
		super(model, year, memory, clockInterval);
	}

}
