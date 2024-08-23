package com.rapid_backend_11.rapid_backend_11.services;

import com.rapid_backend_11.rapid_backend_11.dtos.ContentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private final List<ContentDto> messages = new ArrayList<>();

    public List<ContentDto> getMessages() {
        return messages;
    }

    public ContentDto createMessages(ContentDto contendDto) {
        messages.add(contendDto);
        return contendDto;
    }
}
