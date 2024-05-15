package com.techsupport.controller;


import com.techsupport.model.EventModel;
import com.techsupport.model.EventModelCommand;
import com.techsupport.service.EventsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@AllArgsConstructor
public class EventController {

    private EventsService eventsService;

    @GetMapping("/all")
    public ResponseEntity<List<EventModel>> getAll()
    {
        List<EventModel> list = eventsService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);

    }

    @PostMapping("/add")
    public ResponseEntity<EventModel> addNew(@RequestBody EventModelCommand eventModel)
    {
        EventModel eventModel1 = eventsService.addNew(eventModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventModel1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventModel> update(@RequestBody EventModelCommand eventModel, @PathVariable Long id)
    {
            EventModel eventModel1 = eventsService.update(eventModel, id);
            return ResponseEntity.status(HttpStatus.OK).body(eventModel1);


    }
}
