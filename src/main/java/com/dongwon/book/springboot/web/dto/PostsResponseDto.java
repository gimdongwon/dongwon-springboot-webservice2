package com.dongwon.book.springboot.web.dto;

import com.dongwon.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entiry){
        this.id = entiry.getId();
        this.title = entiry.getTitle();
        this.content = entiry.getContent();
        this.author = entiry.getAuthor();
    }
}
