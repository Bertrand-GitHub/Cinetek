package bzh.eni.cinetek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class updateMovieController {

    @GetMapping({ "/update"})
    public String Insert() {

        return "updateMovie";
    }
}
