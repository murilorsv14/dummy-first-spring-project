package com.trybe.trybespring.application;

import java.util.ArrayList;
import java.util.List;

import com.trybe.trybespring.domain.Book;

// import org.springframework.http.ResponseEntity;
// import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
  private List<Book> books = new ArrayList<>();
  
  @PostMapping("/books")
  Book newbook() {
      Book book = new Book("sherlock", "book");
      books.add(book);
      return book;
  }

  @GetMapping("/books")
  List<Book> all() {
    return books;
  }
}