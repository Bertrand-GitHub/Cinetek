package bzh.eni.cinetek.bll;

import bzh.eni.cinetek.bo.Movie;
import bzh.eni.cinetek.dal.MovieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoviesServiceImpl implements MoviesService{

    private MovieDAO movieDAO;

    @Autowired
    public MoviesServiceImpl(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }
    @Override
    public List<Movie> selectMovies() {
        return this.movieDAO.selectMovies();
    }
}
