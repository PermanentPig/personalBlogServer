package com.blog.personalblog.pojo;

import java.util.Date;

public class Blog {
    private int id;
    private String blogTitle;
    private String blogTag;
    private String blogType;
    private String blogAuthor;
    private String blogContent;
    private Date blogCreateTime;
    private Date blogModifyTime;
    private String BlogComment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(String blogTag) {
        this.blogTag = blogTag;
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Date getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(Date blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public Date getBlogModifyTime() {
        return blogModifyTime;
    }

    public void setBlogModifyTime(Date blogModifyTime) {
        this.blogModifyTime = blogModifyTime;
    }

    public String getBlogComment() {
        return BlogComment;
    }

    public void setBlogComment(String blogComment) {
        BlogComment = blogComment;
    }
}
