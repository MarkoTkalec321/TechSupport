package com.techsupport.service;

import com.techsupport.model.CommentsModel;
import com.techsupport.model.CommentsModelCommand;
import com.techsupport.repository.CommentsRepositoryJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CommentsServiceImpl implements CommentsService{
    private CommentsRepositoryJPA commentsRepositoryJPA;
    @Override
    public CommentsModel addComent(CommentsModelCommand command) {
        CommentsModel commentsModel = new CommentsModel();
        commentsModel.setText(command.getText());
        commentsModel.setTimestamp(command.getTimestamp());
        return commentsRepositoryJPA.save(commentsModel);
    }
}
