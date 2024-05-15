package com.techsupport.service;


import com.techsupport.model.EventModel;
import com.techsupport.model.EventModelCommand;
import com.techsupport.repository.EventsRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        EventModel eventModel = mapper(command);
        return eventsRepositoryJPA.save(eventModel);
    }

    @Override
    public EventModel update(EventModelCommand command, Long id) {
        EventModel oldModel = eventsRepositoryJPA.findById(id).get();
        EventModel eventModel = mapper(command);
        eventModel.setId(id);
        eventModel.setComments(oldModel.getComments());

        return eventsRepositoryJPA.save(eventModel);

    }

    @Override
    public List<EventModel> search(String name, LocalDate domainRegistrationDate, String affectedBrand, String A_Record, List<String> keywords) {
        List<EventModel> searchResult = eventsRepositoryJPA.findAll();
        int count = 0;
        if (name != null) {
            count++;
            searchResult = searchResult.stream()
                    .filter(data -> data.getName().equals(name))
                    .collect(Collectors.toList());
        } else if (domainRegistrationDate != null) {
            count++;
            searchResult = searchResult.stream()
                    .filter(data -> data.getDomainRegistrationDate().equals(domainRegistrationDate))
                    .collect(Collectors.toList());
        } else if (affectedBrand != null) {
            count++;
            searchResult = searchResult.stream()
                    .filter(data -> data.getAffectedBrand().equals(affectedBrand))
                    .collect(Collectors.toList());
        } else if (A_Record != null) {
            count++;
            searchResult = searchResult.stream()
                    .filter(data -> data.getA_Record().equals(A_Record))
                    .collect(Collectors.toList());
        } else if (keywords != null) {
            count++;
            searchResult = searchResult.stream()
                    .filter(data -> data.getMatchingKeywords().containsAll(keywords))
                    .collect(Collectors.toList());
        }
        if(count > 0)
            return searchResult;
        else return new ArrayList<EventModel>();
    }


    private EventModel mapper(EventModelCommand command)
    {
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
        return eventModel;
    }
}
