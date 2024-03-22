package repository;

import entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book findById(String id);
    Book findByTitle(String title);
    Book findByName(String id);
    boolean save(Book book);
    boolean update(Book book);
    boolean delete(String id);
}
