package com.rapid_backend_11.rapid_backend_11.controllers;


import com.rapid_backend_11.rapid_backend_11.dtos.ContentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rapid_backend_11.rapid_backend_11.services.ContentService;

import java.util.List;

@RestController
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/messages")
    public ResponseEntity<List<ContentDto>> messages(){
        return ResponseEntity.ok(contentService.getMessages());
    }

    @PostMapping("/messages")
    public ResponseEntity<ContentDto> createMessages(@RequestBody ContentDto contentDto) {
        return ResponseEntity.ok(contentService.createMessages(contentDto));
    }
}
