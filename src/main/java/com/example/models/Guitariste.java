package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitariste implements IMusicien {

	@Autowired
	private IInstrument instrument;

	public Guitariste() {
		// TODO Auto-generated constructor stub
	}

	public void jouer() {
		System.out.println("Le guitariste joue : " + this.instrument.jouer());		
	}

}

