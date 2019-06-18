package com.example.soapclient;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class CalculatorClient {

	public void useCalculator() {
		// Create a service object
		Calculator calc = new Calculator();
		// get the object of the port for SOAP message exchange
		CalculatorSoap port = calc.getCalculatorSoap();
		try {
			int response = port.add(5, 15); // RHS is request
			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
