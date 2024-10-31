package com.kh.KHWebtoon.vo;

import lombok.Getter;

import java.sql.Date;

@Getter
public class MemberVO {
    private int memberNum;
    private String memberId;
    private String memberPw;
    private String memberEmail;
    private Date memberBirth;
    private String memberNickname;
    private Date memberRegistrationDate;
    private int memberExist;
    private int memberTypeNum;

    public MemberVO(int memberNum, String memberId, String memberPw, String memberEmail, Date memberBirth, String memberNickname, int memberExist, int memberTypeNum) {
        this.memberNum = memberNum;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberEmail = memberEmail;
        this.memberBirth = memberBirth;
        this.memberNickname = memberNickname;
        this.memberExist = memberExist;
        this.memberTypeNum = memberTypeNum;
    }
}
