package com.techsupport.repository;

import com.techsupport.model.CommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepositoryJPA extends JpaRepository<CommentsModel, Long> {
    CommentsModel save(CommentsModel commentsModel);
}
