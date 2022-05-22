package com.springboot.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

@Configuration
//괄호안의 클래스가 위치한 곳부터 컴포넌트 스캐닝을 시작해라(해당 클래스는 이 프로젝트의 메인메소드가 존재하는 애플리케이션 시작 클래스)
@ComponentScan(basePackageClasses = SpringApplicationContextApplication.class)
public class ApplicationConfig {

//    @Bean
//    public BookRepository bookRepository(){
//        return new BookRepository();
//    }
//
//    @Bean
//    public BookService bookService(){
//        /*BookService bookService = new BookService();
//        bookService.setBookRepository(bookRepository());
//        return bookService;*/
//        return new BookService();
//    }

}
