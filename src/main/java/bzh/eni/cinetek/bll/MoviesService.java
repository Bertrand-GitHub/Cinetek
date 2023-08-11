package bzh.eni.cinetek.bll;

import bzh.eni.cinetek.bo.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie>selectMovies();
    Movie findMovieById(int id);
    void addMovie(Movie movie);

}
