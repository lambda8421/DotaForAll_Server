package com.mofei.dota.web.controller;

import com.mofei.dota.web.entity.test.Book;
import com.mofei.dota.web.repository.TestRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestControllwr {

    @Autowired
    TestRepositroy testRepositroy;

    @GetMapping(value = "/test")
    public void test(){
        Book book = new Book();
        book.setTitle("XX");

        testRepositroy.addPerson(book);

        List<Book> books = testRepositroy.listPersons();
    }
}
