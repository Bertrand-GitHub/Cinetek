package bzh.eni.cinetek.dal;

import bzh.eni.cinetek.bo.Movie;

import java.util.List;

public interface MovieDAO {
    public List<Movie> selectMovies();
    public void addMovie(Movie movie);
    public void updateMovie(Movie movie);
    public  void insertMovie(Movie movie);
    public void deleteMovie(Movie movie);
    public Movie selectOneById(int movieId);
}
