package com.techsupport.service;

import com.techsupport.model.CommentsModel;
import com.techsupport.model.CommentsModelCommand;



public interface CommentsService {
    CommentsModel addComent(CommentsModelCommand command);
}
