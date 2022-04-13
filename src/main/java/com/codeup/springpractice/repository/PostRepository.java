package com.codeup.springpractice.repository;

import com.codeup.springpractice.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
