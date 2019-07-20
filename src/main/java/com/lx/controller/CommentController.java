package com.lx.controller;

import com.lx.pojo.Comment;
import com.lx.service.CommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired
    CommentService commentService;

    /**
     * 展示社区评论接口
     * @return
     */
    @RequestMapping("/showComment")
    @ApiOperation(value = "展示社区评论接口")
    public List<Comment> showComment() {
        List<Comment> commentList = commentService.showComment();
        return commentList;
    }
}
