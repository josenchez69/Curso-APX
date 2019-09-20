/**
 * 
 */
package com.bbva.capx.dto.calculator.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bbva.capx.dto.viajes.DtoIn;

import junit.framework.Assert;

/**
 * @author root
 *
 */
public class DtoIntTest {

	@Before
	public void starting() {
		String pruebaCiudad; 
		int HashcodePrueba;
		String PruebaOperador;
		boolean prueba;
		DtoIn base = new DtoIn();
		base.setOriginPoint("Bogota");
		base.setDestinationPoint("Medellin");
		pruebaCiudad = base.getDestinationPoint();
		pruebaCiudad = base.getOriginPoint();
		HashcodePrueba = base.hashCode();
		prueba = base.equals(base);
		
	}
	
	@Test
	public void testToString(){
		DtoIn base = new DtoIn();
		Assert.assertEquals(base.toString(), "ViajeDataIn [originPoint=null, destinationPoint=null]");
	}
	
	@Test
	public void testToEquals() {
		DtoIn entrada1 = new DtoIn();
		DtoIn entrada2 = new DtoIn();
		entrada1.equals(entrada2);
		Assert.assertEquals(entrada1, entrada2);
		
		DtoIn entrada3 = new DtoIn();
		entrada3.setOriginPoint("Bogota");
		entrada3.setDestinationPoint("Medellin");
		DtoIn entrada4 = new DtoIn();
		entrada4.setOriginPoint("Cali");
		entrada4.setDestinationPoint("Bucaramanga");
		entrada3.equals(entrada4);
		entrada3.equals(null);
		entrada3.equals("Hola mundo");
		DtoIn entrada5 = new DtoIn();
		entrada5.setOriginPoint("Pasto");
		entrada5.setDestinationPoint("Manizales");
		entrada3.equals(entrada5);
		int Hash = entrada5.hashCode();
		
	}

}
