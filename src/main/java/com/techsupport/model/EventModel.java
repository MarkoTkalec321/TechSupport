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
    private String A_Record;
    private String NS_Record;
    private String MX_Record;
    @ElementCollection
    @Column(name = "matching_keywords")
    private List<String> matchingKeywords;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="event_id")
    private List<CommentsModel> comments;

}
