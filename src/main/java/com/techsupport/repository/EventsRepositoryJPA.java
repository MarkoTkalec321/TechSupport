package com.techsupport.repository;


import com.techsupport.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepositoryJPA extends JpaRepository<EventModel, Long> {

    List<EventModel> findAll();

    List<EventModel> findAllByNameIgnoreCase(String name);

    EventModel save(EventModel eventModel);


}
