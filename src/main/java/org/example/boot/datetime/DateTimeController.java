package org.example.boot.datetime;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class DateTimeController {

    @RequestMapping(value = "now", method = GET)
    public DateTimeResponse now() {
        return new DateTimeResponse();
    }

    @RequestMapping(value = "echo", method = POST)
    public DateTimeResponse echo(@RequestBody DateTimeRequest request) {
        return new DateTimeResponse(request.getTime());
    }
}
