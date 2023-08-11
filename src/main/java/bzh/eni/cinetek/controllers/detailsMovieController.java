package bzh.eni.cinetek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class detailsMovieController {

    @GetMapping({ "/detailsMovie/{id}"})
    public String Insert(@PathVariable int id,Model model) {


        return "detailsMovie";
    }
}
