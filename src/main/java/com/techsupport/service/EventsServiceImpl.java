package com.techsupport.service;


import com.techsupport.model.EventModel;
import com.techsupport.repository.EventsRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventsServiceImpl implements EventsService {

    private EventsRepositoryJPA eventsRepositoryJPA;


    @Override
    public List<EventModel> findAll() {
        return eventsRepositoryJPA.findAll();
    }

    @Override
    public List<EventModel> findAllByName(String name) {
        return eventsRepositoryJPA.findAllByNameIgnoreCase(name);
    }
}
