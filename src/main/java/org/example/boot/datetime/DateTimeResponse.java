package org.example.boot.datetime;

import org.joda.time.DateTime;

public class DateTimeResponse {

    private DateTime time = DateTime.now();

    public DateTimeResponse(){}

    public DateTimeResponse(DateTime time) {
        this.time = time;
    }

    public DateTime getTime() {
        return time;
    }

    public void setTime(DateTime time) {
        this.time = time;
    }
}
