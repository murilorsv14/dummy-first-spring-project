package com.trybe.trybespring.domain;

import java.util.UUID;

public class Book {

  private UUID id;

  private String name;

  private String author;

  public Book(String name, String author) {
    this.id = UUID.randomUUID(); // toda nova instância terá um novo id
    this.name = name;
    this.author = author;
  }

  /**
   * @return UUID return the id
   */
  public UUID getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return String return the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(String author) {
    this.author = author;
  }

}