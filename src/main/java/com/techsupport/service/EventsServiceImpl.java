package com.techsupport.service;


import com.techsupport.model.EventModel;
import com.techsupport.model.EventModelCommand;
import com.techsupport.repository.EventsRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    @Override
    public EventModel addNew(EventModelCommand command) {
        System.out.println(command);
        EventModel eventModel = new EventModel();
        eventModel.setId(null);
        eventModel.setName(command.getName());
        eventModel.setAffectedBrand(command.getAffectedBrand());
        eventModel.setDescription(command.getDescription());
        eventModel.setMaliciousUrl(command.getMaliciousUrl());
        eventModel.setDomainRegistrationDate(command.getDomainRegistrationDate());
        eventModel.setA_Record(command.getA_Record());
        eventModel.setNS_Record(command.getNS_Record());
        eventModel.setMX_Record(command.getMX_Record());
        eventModel.setMatchingKeywords(command.getMatchingKeywords());
        eventModel.setStatus(command.getStatus());
        eventModel.setComments(null);
        eventModel.setDateOfCreation(LocalDateTime.now());
        return eventsRepositoryJPA.save(eventModel);
    }
}
