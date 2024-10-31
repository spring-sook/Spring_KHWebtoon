package com.kh.KHWebtoon.vo;

import lombok.Getter;

import java.sql.Date;

@Getter
public class ReplyVO {
    private int replyNum;
    private String replyContent;
    private Date replyPublishedDate;
    private int replyLikeCount;
    private int replyDislikeCount;
    private int memberNum;
    private String memberNickname;
    private int postNum;

    public ReplyVO(int replyNum, String replyContent, Date replyPublishedDate, int replyLikeCount, int replyDislikeCount, int memberNum, String memberNickname) {
        this.replyNum = replyNum;
        this.replyContent = replyContent;
        this.replyPublishedDate = replyPublishedDate;
        this.replyLikeCount = replyLikeCount;
        this.replyDislikeCount = replyDislikeCount;
        this.memberNum = memberNum;
        this.memberNickname = memberNickname;
    }
}
