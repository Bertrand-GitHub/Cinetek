package bzh.eni.cinetek.dal;

import bzh.eni.cinetek.bo.Actor;
import bzh.eni.cinetek.bo.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDAOImpl implements MovieDAO {
    List<Movie> movies;
    List<Actor> actors;

    public MovieDAOImpl() {

        actors.add(new Actor(1, "Tim", "Robbins"));
        actors.add(new Actor(2, "Morgan", "Freeman"));
        actors.add(new Actor(3, "Marlon", "Brando"));
        actors.add(new Actor(4, "Al", "Pacino"));
        actors.add(new Actor(5, "John", "Travolta"));
        actors.add(new Actor(6, "Samuel L.", "Jackson"));
        actors.add(new Actor(7, "Brad", "Pitt"));
        actors.add(new Actor(8, "Edward", "Norton"));
        actors.add(new Actor(9, "Keanu", "Reeves"));
        actors.add(new Actor(10, "Laurence", "Fishburne"));
        actors.add(new Actor(11, "Mark", "Hamill"));
        actors.add(new Actor(12, "Harrison", "Ford"));
        actors.add(new Actor(13, "Elijah", "Wood"));
        actors.add(new Actor(14, "Ian", "McKellen"));
        actors.add(new Actor(15, "Tom", "Hanks"));
        actors.add(new Actor(16, "Robin", "Wright"));
        actors.add(new Actor(17, "Leonardo", "DiCaprio"));
        actors.add(new Actor(18, "Joseph", "Gordon-Levitt"));
        actors.add(new Actor(19, "Christian", "Bale"));
        actors.add(new Actor(20, "Heath", "Ledger"));
        actors.add(new Actor(21, "Jodie", "Foster"));
        actors.add(new Actor(22, "Anthony", "Hopkins"));
        actors.add(new Actor(23, "Michael J.", "Fox"));
        actors.add(new Actor(24, "Christopher", "Lloyd"));
        actors.add(new Actor(25, "Jeff", "Bridges"));
        actors.add(new Actor(26, "John", "Goodman"));
        actors.add(new Actor(27, "Harrison", "Ford"));
        actors.add(new Actor(28, "Rutger", "Hauer"));
        actors.add(new Actor(29, "Emilio", "Estevez"));
        actors.add(new Actor(30, "Judd", "Nelson"));
        actors.add(new Actor(31, "Henry", "Thomas"));
        actors.add(new Actor(32, "Drew", "Barrymore"));
        actors.add(new Actor(33, "Sam", "Neill"));
        actors.add(new Actor(34, "Laura", "Dern"));
        actors.add(new Actor(35, "Cary", "Elwes"));
        actors.add(new Actor(36, "Robin", "Wright"));
        actors.add(new Actor(37, "Sylvester", "Stallone"));
        actors.add(new Actor(38, "Talia", "Shire"));
        actors.add(new Actor(39, "Arnold", "Schwarzenegger"));
        actors.add(new Actor(40, "Linda", "Hamilton"));


        movies = new ArrayList<Movie>();
        movies.add(new Movie(1, "The Shawshank Redemption", 1994, 142, "Frank Darabont", Arrays.asList(actors.get(0), actors.get(1)).toString(), "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        movies.add(new Movie(2, "The Godfather", 1972, 175, "Francis Ford Coppola", Arrays.asList(actors.get(2), actors.get(3)).toString(), "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.add(new Movie(3, "Pulp Fiction", 1994, 154, "Quentin Tarantino", Arrays.asList(actors.get(4), actors.get(5)).toString(), "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
        movies.add(new Movie(4, "Fight Club", 1999, 139, "David Fincher", Arrays.asList(actors.get(6), actors.get(7)).toString(), "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more."));
        movies.add(new Movie(5, "The Matrix", 1999, 136, "The Wachowskis", Arrays.asList(actors.get(8), actors.get(9)).toString(), "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
        movies.add(new Movie(6, "Star Wars: Episode IV - A New Hope", 1977, 121, "George Lucas", Arrays.asList(actors.get(10), actors.get(11)).toString(), "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee, and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader."));
        movies.add(new Movie(7, "The Lord of the Rings: The Fellowship of the Ring", 2001, 178, "Peter Jackson", Arrays.asList(actors.get(12), actors.get(13)).toString(), "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."));
        movies.add(new Movie(8, "Forrest Gump", 1994, 142, "Robert Zemeckis", Arrays.asList(actors.get(14), actors.get(15)).toString(), "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal, and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart."));
        movies.add(new Movie(9, "Inception", 2010, 148, "Christopher Nolan", Arrays.asList(actors.get(16), actors.get(17)).toString(), "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O."));
        movies.add(new Movie(10, "The Dark Knight", 2008, 152, "Christopher Nolan", Arrays.asList(actors.get(18), actors.get(19)).toString(), "When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham. The Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
        movies.add(new Movie(11, "The Silence of the Lambs", 1991, 118, "Jonathan Demme", Arrays.asList(actors.get(20), actors.get(21)).toString(), "A young FBI cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims."));
        movies.add(new Movie(12, "Back to the Future", 1985, 116, "Robert Zemeckis", Arrays.asList(actors.get(22), actors.get(23)).toString(), "Marty McFly, a teenager, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, eccentric scientist Doc Brown."));
        movies.add(new Movie(13, "The Big Lebowski", 1998, 117, "Joel Coen", Arrays.asList(actors.get(24), actors.get(25)).toString(), "Jeff 'The Dude' Lebowski, mistaken for a millionaire of the same name, seeks restitution for his ruined rug and enlists his bowling buddies to help get it."));
        movies.add(new Movie(14, "Blade Runner", 1982, 117, "Ridley Scott", Arrays.asList(actors.get(26), actors.get(27)).toString(), "A blade runner must pursue and terminate four replicants who stole a ship in space, and have returned to Earth to find their creator."));
        movies.add(new Movie(15, "The Breakfast Club", 1985, 97, "John Hughes", Arrays.asList(actors.get(28), actors.get(29)).toString(), "Five high school students meet in Saturday detention and discover how they have a lot more in common than they thought."));

    }

    @Override
    public List<Movie> selectMovies() {
        return null;
    }

    @Override
    public void addMovie(Movie movie) {

    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public void insertMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public Movie selectOneById(int movieId) {
        return null;
    }
}
