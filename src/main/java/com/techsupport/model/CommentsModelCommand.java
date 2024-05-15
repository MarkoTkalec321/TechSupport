package com.techsupport.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentsModelCommand {
    private String text;
    private LocalDateTime timestamp;
}
