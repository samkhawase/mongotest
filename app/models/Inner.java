package models;

import com.google.code.morphia.annotations.Embedded;


@Embedded
public class Inner {

	public Inner(String innerVariable) {
		super();
		this.innerVariable = innerVariable;
	}

	public String innerVariable;
	
}
