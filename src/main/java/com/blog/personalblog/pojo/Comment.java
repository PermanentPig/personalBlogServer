package com.blog.personalblog.pojo;

import java.util.Date;

public class Comment {
    private int id;
    private String commentPerson;
    private String commentBlog;
    private Date commentTime;
    private String commentContent;
    private String commentReplyContent;
    private Date commentReplyTime;
    private String commentReplyComment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentPerson() {
        return commentPerson;
    }

    public void setCommentPerson(String commentPerson) {
        this.commentPerson = commentPerson;
    }

    public String getCommentBlog() {
        return commentBlog;
    }

    public void setCommentBlog(String commentBlog) {
        this.commentBlog = commentBlog;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentReplyContent() {
        return commentReplyContent;
    }

    public void setCommentReplyContent(String commentReplyContent) {
        this.commentReplyContent = commentReplyContent;
    }

    public Date getCommentReplyTime() {
        return commentReplyTime;
    }

    public void setCommentReplyTime(Date commentReplyTime) {
        this.commentReplyTime = commentReplyTime;
    }

    public String getCommentReplyComment() {
        return commentReplyComment;
    }

    public void setCommentReplyComment(String commentReplyComment) {
        this.commentReplyComment = commentReplyComment;
    }
}
