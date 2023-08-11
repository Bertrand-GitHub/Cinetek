package bzh.eni.cinetek.controllers;

import bzh.eni.cinetek.bll.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private MoviesService moviesService;

    @Autowired
    public IndexController(MoviesService moviesService) {
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
}