package com.matsta25.restapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Comment {

    @Id
    private Long id;

    private Long postId;

    private String content;
    private LocalDateTime created;
}
