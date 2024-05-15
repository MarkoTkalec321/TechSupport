package com.techsupport.model;

import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime dateOfCreation;
    private String affectedBrand;
    private String description;
    private String maliciousUrl;
    private LocalDate domainRegistrationDate;
    private String ARecord;
    private String NSRecord;
    private String MXRecord;
    @ElementCollection
    private List<String> matchingKeywords;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "event")
    private List<CommentsModel> comments;

}
