package com.techsupport.controller;


import com.techsupport.model.EventModel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {


    @GetMapping("/all")
    public ResponseEntity<List<EventModel>> getAll()
    {



    }

}
