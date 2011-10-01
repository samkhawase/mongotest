package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	// create an Object
    	Inner inner = new Inner("innerClass");
    	Outer outer = new Outer("outerClass", inner);
    	outer.save();
        render(outer);
    }

}