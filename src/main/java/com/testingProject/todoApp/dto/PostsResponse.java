package com.testingProject.todoApp.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class PostsResponse {

    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}