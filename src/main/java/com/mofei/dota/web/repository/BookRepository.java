package com.mofei.dota.web.repository;

import com.mofei.dota.web.entity.test.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Long> {

//    @Query("select * from book where id = id")
//    findAllById(@Parameter())



}
