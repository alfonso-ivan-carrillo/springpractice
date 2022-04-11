package com.codeup.springpractice.repository;

import com.codeup.springpractice.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
}
