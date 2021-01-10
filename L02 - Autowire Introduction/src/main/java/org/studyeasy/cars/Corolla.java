package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	
	Engine engine;

	@Autowired
	public void setEngine(Engine engine) {
		engine.type = "New V8 Engine from setter";
		this.engine = engine;
	}
	
	
//	
//	public Corolla(Engine engine) {
//		engine.type = "New V8 Engine from constructor";
//		this.engine = engine;
//	}

	@Override
	public String specs() {
		String specs = "Sedan from Toyota with engine type" + engine.type;
		return specs;
	}

}
