package lab13_PB;

import java.util.HashSet;

public class Films_DB {
	private HashSet<Film> films = new HashSet<Film>();
    private HashSet<Actor> actors = new HashSet<Actor>();

    public Films_DB() {
        this.films = new HashSet<Film>();
        this.actors = new HashSet<Actor>();
    }
    
    public Films_DB(HashSet<Film> films, HashSet<Actor> actors) {
    	this.films = films;
    	this.actors = actors;
    }

    public void addFilm(Film film) throws EmptyNameException{
    	if (film == null) {
    		throw new NullPointerException("Null passed as a parameter");
    	}
    	if (film.getName() == "") {
    		throw new EmptyNameException("Can't add the film with an empty name to the database");
    	}
        films.add(film);
    }

    public boolean removeFilm(Film film) {
        return films.remove(film);
    }

    public void addActor(Actor actor) throws EmptyNameException {
    	if (actor == null) {
    		throw new NullPointerException("Null passed as a parameter");
    	}
    	if (actor.getName() == "") {
    		throw new EmptyNameException("Can't add the actor with an empty name to the database");
    	}
        actors.add(actor);
    }

    public boolean removeActor(Actor actor) {
        return actors.remove(actor);
    }

    public HashSet<Film> getFilms() {
        return (HashSet<Film>) films.clone();
    }

    public HashSet<Actor> getActors() {
        return (HashSet<Actor>) actors.clone();
    }
    
    @Override
    public int hashCode()
    {
    	final int prime = 17;
		int result = 1;
		result = prime * result + films.hashCode();
		result = prime * result + actors.hashCode();
		return result;
    }
    
    @Override
    public boolean equals(Object o) {
    	if (this == o) {
    		return true;
    	}
    	
    	if (o == null || getClass() != o.getClass()){ 
    		return false;
    	}
    	
    	Films_DB other = (Films_DB) o;
    	
    	return other.hashCode() == hashCode();
    }
} 