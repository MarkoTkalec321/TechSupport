package com.techsupport.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
public class EventModelCommand {
    private String name;
    private String affectedBrand;
    private String description;
    private String maliciousUrl;
    private LocalDate domainRegistrationDate;
    private String A_Record;
    private String NS_Record;
    private String MX_Record;
    private List<String> matchingKeywords;
    private StatusEnum status;
}
