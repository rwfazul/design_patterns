package processing.units;

/**
 * @author rhau
 * IntelCore family (Intel CPU subclass)
 */
public class IntelCore extends CPU {

	public IntelCore() {
		super("Intel Core");
	}

	/**
	 * @param model
	 * @param threads
	 * @param cores
	 * @param clockInterval
	 * @param hasIntegratedGraphics
	 */
	public IntelCore(String model, Integer threads, Integer cores, ClockInterval clockInterval,
			Boolean hasIntegratedGraphics) {
		super(model, threads, cores, clockInterval, hasIntegratedGraphics);
	}
	
}
