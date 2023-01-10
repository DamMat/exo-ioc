package com.example.models;

public class Guitare implements IInstrument {

	private String instrument;

	public Guitare() {
		// TODO Auto-generated constructor stub
	}

	public Guitare(String instrument) {
		super();
		this.instrument = instrument;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Guitare [instrument=" + instrument + "]";
	}

	public String jouer() {
		return instrument;		
	}

}

