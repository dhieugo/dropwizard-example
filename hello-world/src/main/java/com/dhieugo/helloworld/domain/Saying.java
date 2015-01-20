package com.edgeworks.singerapp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hieu on 1/20/15.
 */
public class Saying {
    private long id;

    @Length(max = 3)
    private String content;

    public Saying() {
        // jackson
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
