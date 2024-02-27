package com.yash.JPAAssignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.yash.JPAAssignment.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, String>{
	
BookEntity findByBookid(String bookid);
List<BookEntity> findByAuthor(String author);
List<BookEntity> findByGenre(String genre);
List<BookEntity> findByPriceLessThan(float price);
List<BookEntity> findByGenreAndLangauge(String genre,String langauge);
List<BookEntity> findByPublicationyear(int publicationyear);
List<BookEntity> findByPagesLessThan(int pages);


}
