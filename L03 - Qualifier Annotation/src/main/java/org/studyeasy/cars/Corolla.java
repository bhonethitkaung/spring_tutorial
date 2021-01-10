package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;

	@Override
	public String specs() {
		String specs = "Sedan from Toyota with engine type" + engine.type();
		return specs;
	}

}
