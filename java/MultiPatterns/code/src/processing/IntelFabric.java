package processing;

import processing.units.CPU;
import processing.units.GPU;
import processing.units.IntelCore;
import processing.units.IntelGraphics;

/**
 * @author rhau
 * Concrete fabric -> Intel CPU or GPU
 */
public class IntelFabric implements ProcessingUnitFabric {

    public static IntelFabric instance;
    
    private IntelFabric() {	
    }
 
    /*
     * Singleton concrete fabric
     */
    public static synchronized IntelFabric getInstance() {
		return instance == null ? new IntelFabric() : instance;
    }
    
	@Override
	public CPU produceCPU() {
		return new IntelCore();
	}

	@Override
	public GPU produceGPU() {
		return new IntelGraphics();
	}

}
