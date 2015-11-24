package org.example.boot.datetime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DateTimeController {

    @RequestMapping(value="now", method = GET)
    public DateTimeResponse now(){
        return new DateTimeResponse();
    }
}
