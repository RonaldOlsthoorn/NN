// Variables associate values with names.
// Copyright 1996 by Darius Bacon; see the file COPYING.

package expr;

import java.util.Hashtable;

/**
 * A variable is a simple expression with a name (like "x") and a
 * settable value.
 */
public class Variable extends Expr {
	
    private static Hashtable<String, Variable> variables = new Hashtable<String, Variable>();
    private String name;
    private double val;
    
    /**
     * Return a unique variable named `name'.  There can be only one
     * variable with the same name returned by this method; that is,
     * make(s1) == make(s2) if and only if s1.equals(s2).
     * @param name the variable's name
     * @return the variable; create it initialized to 0 if it doesn't
     *         yet exist */
    static public synchronized Variable make(String name) {
    	
	Variable result = variables.get(name);
	if (result == null)
		result = new Variable(name);
	    variables.put(name, result);
	return result;
    }
    
    /**
     * Return a unique variable named `name'.  There can be only one
     * variable with the same name returned by this method; that is,
     * make(s1) == make(s2) if and only if s1.equals(s2).
     * @param name the variable's name
     * @param v the variables value
     * @return the variable; create it initialized to v if it doesn't
     *         yet exist */
    static public synchronized Variable make(String name, double v) {
    	
	Variable result = variables.get(name);
	if (result == null)
		result = new Variable(name,v);
	    variables.put(name, result);
	return result;
    }

    /**
     * Create a new variable, with initial value 0.
     * @param name the variable's name
     */
    public Variable(String name) { 
	this.name = name; val = 0; 
    }
    
    /**
     * Create a new variable, with initial value v.
     * @param name the variable's name
     * @param v the variable's value
     */
    public Variable(String name, double v) { 
	this.name = name; val = v; 
    }

    /** Return the name. */
    public String toString() { return name; }

    /** Get the value.
     * @return the current value */
    public double value() { 
	return val; 
    }
    /** Set the value.
     * @param value the new value */
    public void setValue(double value) { 
	val = value; 
    }
}
