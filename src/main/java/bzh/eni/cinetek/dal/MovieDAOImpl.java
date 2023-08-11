package bzh.eni.cinetek.dal;

import bzh.eni.cinetek.bo.Participant;
import bzh.eni.cinetek.bo.Movie;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {
    List<Movie> movies;


    public MovieDAOImpl(ParticipantDAOImpl participantDAO) {
        List<Participant> participants;
        participants = participantDAO.getParticipantsList();
        movies = new ArrayList<Movie>();

        movies.add(new Movie(1, "The Shawshank Redemption", 1994, 142, "Frank Darabont", Arrays.asList(participants.get(0), participants.get(1)), "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        movies.add(new Movie(2, "The Godfather", 1972, 175, "Francis Ford Coppola", Arrays.asList(participants.get(2), participants.get(3)), "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.add(new Movie(3, "Pulp Fiction", 1994, 154, "Quentin Tarantino", Arrays.asList(participants.get(4), participants.get(5)), "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
        movies.add(new Movie(4, "Fight Club", 1999, 139, "David Fincher", Arrays.asList(participants.get(6), participants.get(7)), "An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more."));
        movies.add(new Movie(5, "The Matrix", 1999, 136, "The Wachowskis", Arrays.asList(participants.get(8), participants.get(9)), "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
        movies.add(new Movie(6, "Star Wars: Episode IV - A New Hope", 1977, 121, "George Lucas", Arrays.asList(participants.get(10), participants.get(11)), "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee, and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader."));
        movies.add(new Movie(7, "The Lord of the Rings: The Fellowship of the Ring", 2001, 178, "Peter Jackson", Arrays.asList(participants.get(12), participants.get(13)), "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."));
        movies.add(new Movie(8, "Forrest Gump", 1994, 142, "Robert Zemeckis", Arrays.asList(participants.get(14), participants.get(15)), "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal, and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart."));
        movies.add(new Movie(9, "Inception", 2010, 148, "Christopher Nolan", Arrays.asList(participants.get(16), participants.get(17)), "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O."));
        movies.add(new Movie(10, "The Dark Knight", 2008, 152, "Christopher Nolan",Arrays.asList(participants.get(18), participants.get(19)), "When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham. The Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
        movies.add(new Movie(11, "The Silence of the Lambs", 1991, 118, "Jonathan Demme", Arrays.asList(participants.get(20), participants.get(21)), "A young FBI cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims."));
        movies.add(new Movie(12, "Back to the Future", 1985, 116, "Robert Zemeckis", Arrays.asList(participants.get(22), participants.get(23)), "Marty McFly, a teenager, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, eccentric scientist Doc Brown."));
        movies.add(new Movie(13, "The Big Lebowski", 1998, 117, "Joel Coen", Arrays.asList(participants.get(24), participants.get(25)), "Jeff 'The Dude' Lebowski, mistaken for a millionaire of the same name, seeks restitution for his ruined rug and enlists his bowling buddies to help get it."));
        movies.add(new Movie(14, "Blade Runner", 1982, 117, "Ridley Scott", Arrays.asList(participants.get(26), participants.get(27)), "A blade runner must pursue and terminate four replicants who stole a ship in space, and have returned to Earth to find their creator."));
        movies.add(new Movie(15, "The Breakfast Club", 1985, 97, "John Hughes", Arrays.asList(participants.get(28), participants.get(29)), "Five high school students meet in Saturday detention and discover how they have a lot more in common than they thought."));
    }

    @Override
    public List<Movie> selectMovies() {
        List<Participant> participants = ParticipantDAOImpl;
        return movies;
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
