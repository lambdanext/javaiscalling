package javaiscalling;

import clojure.lang.IFn;
import clojure.java.api.Clojure;

public class JavaGreeting {
	final static IFn symbol  = Clojure.var("clojure.core", "symbol");
	final static IFn require = Clojure.var("clojure.core", "require");
	
	static {
		require.invoke(symbol.invoke("javaiscalling.greeting"));
	}
	
	final static IFn cljGreet = Clojure.var("javaiscalling.greeting", "greet");
	
	static public String greet(String person) {
		return (String)cljGreet.invoke(person);
	}
}
