package rs.textparser.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParseController {

    @RequestMapping(method = RequestMethod.GET)
    public String parse() {
        return "hello";
    }
}
