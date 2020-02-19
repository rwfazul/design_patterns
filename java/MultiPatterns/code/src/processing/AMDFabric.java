package processing;

import processing.units.CPU;
import processing.units.GPU;
import processing.units.Radeon;
import processing.units.Ryzen;

/**
 * @author rhau
 * Concrete fabric -> AMD CPU or GPU
 */
public class AMDFabric implements ProcessingUnitFabric {

    public static AMDFabric instance;
    
    private AMDFabric() {
    }
 
    /*
     * Singleton concrete fabric
     */
    public static synchronized AMDFabric getInstance() {
		return instance == null ? new AMDFabric() : instance;
    }
	
	@Override
	public CPU produceCPU() {
		return new Ryzen();
	}

	@Override
	public GPU produceGPU() {
		return new Radeon();
	}

}
