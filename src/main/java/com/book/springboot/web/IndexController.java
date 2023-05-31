package com.book.springboot.web;

import com.book.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final PostsService postsService;

    /*
    @GetMapping("/")
    public String index() {
        return "index";
    }
     */

    //게시글 작성
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    //게시글 전체 조회
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }
}