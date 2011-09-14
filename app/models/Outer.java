package models;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import play.modules.morphia.Model;

@Entity
public class Outer extends Model {

	public Outer(String outerVariable, Inner inner) {
		super();
		this.outerVariable = outerVariable;
		this.inner = inner;
	}

//	@Id
//	public String id;
	
	public String outerVariable;
	
	@Embedded
	public Inner inner;
	
}
