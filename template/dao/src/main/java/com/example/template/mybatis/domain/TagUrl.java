package com.example.template.mybatis.domain;

public class TagUrl {

    private Integer id;
    private Integer tagId;
    private Integer urlId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    @Override
    public String toString() {
        return "TagUrl{" +
                "id=" + id +
                ", tagId=" + tagId +
                ", urlId=" + urlId +
                '}';
    }
}
