package com.techsupport.service;

import com.techsupport.model.EventModel;
import com.techsupport.model.EventModelCommand;

import java.time.LocalDate;
import java.util.List;

public interface EventsService {

    List<EventModel> findAll();

    List<EventModel> findAllByName(String name);

    EventModel addNew(EventModelCommand eventModelCommand);

    EventModel update(EventModelCommand command, Long id);

    List<EventModel> search(String name, LocalDate domainRegistrationDate, String affectedBrand, String A_Record, List<String> keywords);


}

