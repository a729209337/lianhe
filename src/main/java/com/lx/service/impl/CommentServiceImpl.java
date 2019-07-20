package com.lx.service.impl;

import com.lx.mapper.CommentMapper;
import com.lx.pojo.Comment;
import com.lx.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> showComment() {
        List<Comment> commentList = commentMapper.showComment();
        return commentList;
    }
}
