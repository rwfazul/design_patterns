package processing.units;

/**
 * @author rhau
 * Ryzen family (AMD CPU subclass)
 */
public class Ryzen extends CPU {

	public Ryzen() {
		super("Ryzen");
	}

	/**
	 * @param model
	 * @param threads
	 * @param cores
	 * @param clockInterval
	 * @param hasIntegratedGraphics
	 */
	public Ryzen(String model, Integer threads, Integer cores, ClockInterval clockInterval,
			Boolean hasIntegratedGraphics) {
		super(model, threads, cores, clockInterval, hasIntegratedGraphics);
	}
	
}
