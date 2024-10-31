package com.kh.KHWebtoon.vo;

import lombok.Getter;

import java.sql.Date;

@Getter
public class PostVO  {
    private int postNum;
    private String postTitle;
    private String postContent;
    private Date postPublishedDate;
    private int postVisit;
    private int memberNum;
    private String memberNickname;
    private int boardNum;

    public PostVO(int postNum, String postTitle, String postContent, Date postPublishedDate, int postVisit, int memberNum) {
        this.postNum = postNum;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postPublishedDate = postPublishedDate;
        this.postVisit = postVisit;
        this.memberNum = memberNum;
    }
}
