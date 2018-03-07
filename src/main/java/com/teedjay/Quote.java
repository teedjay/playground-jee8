package com.teedjay;

import java.time.LocalDateTime;
import java.util.UUID;

public class Quote {

    public String uuid;
    public String name;
    public String email;
    public Long age;
    public LocalDateTime timestamp;

    public static Quote createDebugData() {
        Quote q = new Quote();
        q.uuid = UUID.randomUUID().toString();
        q.name = "Debug Dude";
        q.email = "debug@somewhere.no";
        q.age = 18 + System.currentTimeMillis() % 50;
        q.timestamp = LocalDateTime.now();
        return q;
    }

}
