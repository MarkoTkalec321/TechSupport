package com.techsupport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EVENTS")
public class EventModel {
    private Integer id;
    private String name;
    private LocalDateTime dateOfCreation;
    private String affectedBrand;
    private String description;
    private String maliciousUrl;
    private LocalDate domainRegistrationDate;
    private String ARecord;
    private String NSRecord;
    private String MXRecord;
    private List<String> matchingKeywords;
    private StatusEnum status;
    private List<CommentsModel> commentsModels;

}
