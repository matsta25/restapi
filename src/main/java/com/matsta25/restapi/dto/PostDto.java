package com.matsta25.restapi.dto;

import java.time.LocalDateTime;


public class PostDto {
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;

    private PostDto() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private long id;
        private String title;
        private String content;
        private LocalDateTime created;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public PostDto build() {
            PostDto postDto = new PostDto();

            postDto.id = this.id;
            postDto.title = this.title;
            postDto.content = this.content;
            postDto.created = this.created;

            return postDto;
        }
    }
}
