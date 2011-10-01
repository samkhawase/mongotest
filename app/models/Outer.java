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

	@Id
	public String id;
	
	public String outerVariable;
	
	@Embedded
	public Inner inner;
	
	//overridden methods, required for Play-Morphia
	@Override public Object getId() {return id;}
    @Override protected void setId_(Object id) {}
    protected static Object processId_(Object id) {return id;}	
	
}
