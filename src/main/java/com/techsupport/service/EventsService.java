package com.techsupport.service;

import com.techsupport.model.EventModel;

import java.util.List;

public interface EventsService {

    List<EventModel> findAll();

    List<EventModel> findAllByName(String name);


}
