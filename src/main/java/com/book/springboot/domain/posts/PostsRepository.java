package com.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    
    //게시글 전체 조회
    @Query("select p from Posts p order by p.id desc")
    List<Posts> findAllDesc();
}