package processing;

import processing.units.CPU;
import processing.units.GPU;

/**
 * @author rhau
 * Abstract factory 'ProcessingUnit' -> CPU or GPU
 */
public interface ProcessingUnitFabric {

	CPU produceCPU();
	GPU produceGPU();
	
}
