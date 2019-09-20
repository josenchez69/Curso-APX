package com.bbva.capx.dto.calculator.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bbva.capx.dto.viajes.DtoOut;

import junit.framework.Assert;

/**
 * @author root
 *
 */
public class DtoOutTest {

	@Before
	public void starting() {
		String pruebaResultado;
		int HashcodePrueba;
		String PruebaOperador;
		boolean prueba;
		DtoOut base = new DtoOut();
		base.setDistance("400 km");
		pruebaResultado = base.getDistance();
		base.setTime("2 horas");
		pruebaResultado = base.getTime();
		
		
		HashcodePrueba = base.hashCode();
		prueba = base.equals(base);	
	}
	
	@Test
	public void testToString(){
		DtoOut base = new DtoOut();
		Assert.assertEquals(base.toString(), "ViajeDataOut [distance=null, time=null]");
	}
	
	@Test
	public void testToEquals() {
		DtoOut salida1 = new DtoOut();
		DtoOut salida2 = new DtoOut();
		salida1.equals(salida2);
		Assert.assertEquals(salida1, salida2);
		
		DtoOut salida3 = new DtoOut();
		salida3.setDistance("400 km");
		DtoOut salida4 = new DtoOut();
		salida4.setTime("2 horas");
		salida3.equals(salida4);
		salida3.equals(salida3);
		salida3.equals(null);
		salida3.equals("Hola mundo");
	}

}

