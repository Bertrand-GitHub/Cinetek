package bzh.eni.cinetek.controllers;

import bzh.eni.cinetek.bll.MoviesService;
import bzh.eni.cinetek.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {
    private MoviesService moviesService;

    @Autowired
    public MovieController(MoviesService moviesService) {
        super();
        this.moviesService = moviesService;
    }

    @GetMapping({ "/", "/index"})
    public String afficherIndex(Model model) {

        model.addAttribute("movies", this.moviesService.selectMovies());
        return "index";
    }

    @GetMapping("/deleteMovie")
    public String deleteMovie(Model model){

        model.addAttribute("movies", this.moviesService.selectMovies());
        return "index" ;
    }

    @GetMapping({ "/updateMovie"})
    public String movieUpdate() {

        return "updateMovie";
    }

    @PostMapping ({ "/insertMovie"})
    public String addMovie(@ModelAttribute Movie movie) {
        movie.addMovie(movie);
        return "redirect:/list";
    }

    @GetMapping({ "/detailsMovie/{id}"})
    public String movieDetails(@PathVariable int id, Model model) {

        return "detailsMovie";
    }
}