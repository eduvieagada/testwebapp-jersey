package com.eduvie.services;

import com.eduvie.models.Messages;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Messages> getAllMessages() {
        Messages m1 = new Messages(1L, "Hello world", "Eduvie");
        Messages m2 = new Messages(1L, "Hello world", "Eduvie");
        Messages m3 = new Messages(1L, "Hello world", "Eduvie");

        List<Messages> messages = new ArrayList<>();

        messages.add(m1);
        messages.add(m2);
        messages.add(m3);

        return messages;
    }
}
