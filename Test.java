package lab13_PB;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		Actor willSmith = new Actor("Will Smith");
    	Actor tommy = new Actor("Tommy Lee Jones");
    	Film menInBlack = new Film("Men in Black", new HashSet<Actor>(Arrays.asList(tommy, willSmith)));
    	willSmith.addFilm(menInBlack);
    	tommy.addFilm(menInBlack);
    	
    	Films_DB my_DB = new Films_DB();
    	
    	try {
	    	my_DB.addActor(willSmith);
	    	my_DB.addActor(tommy);
	    	my_DB.addFilm(menInBlack); 
    	} catch (EmptyNameException e) {
    		System.out.println(e.getMessage());
    	} catch (NullPointerException e) {
    		System.out.println(e.getMessage());
    	}    	
    	
    	Actor emptyActor = new Actor("");
    	try {
    		my_DB.addActor(emptyActor);
    	} catch (EmptyNameException e) {
    		System.out.println(e.getMessage());
    	} catch (NullPointerException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	try {
    		my_DB.addActor(null);
    	} catch (EmptyNameException e) {
    		System.out.println(e.getMessage());
    	} catch (NullPointerException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	System.out.println(my_DB.getFilms());
    	my_DB.removeFilm(menInBlack);
    	System.out.println(my_DB.getFilms());
	}
}
