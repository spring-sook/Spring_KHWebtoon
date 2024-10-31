package com.kh.KHWebtoon.controller;

import com.kh.KHWebtoon.dao.WebtoonDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webtoon")  // http://localhost:8112/webtoon
public class WebtoonController {
    private final WebtoonDAO webtoonDAO;

    public WebtoonController(WebtoonDAO webtoonDAO) {
        this.webtoonDAO = webtoonDAO;
    }

}
