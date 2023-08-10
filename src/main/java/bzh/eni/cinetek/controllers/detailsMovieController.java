package bzh.eni.cinetek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class detailsMovieController {

    @GetMapping({ "/details"})
    public String Insert() {

        return "details";
    }
}
