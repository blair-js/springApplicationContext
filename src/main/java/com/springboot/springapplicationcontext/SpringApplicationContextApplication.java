package com.springboot.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class SpringApplicationContextApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringApplicationContextApplication.class, args);

        //ClassPathXmlApplicationContext(xml 파일) : ClassPath에 위치한 xml 파일을 읽어 설정 정보를 로딩, root로부터 경로를 지정
        //ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        //context 객체를 통해 해당 xml 파일에 등록된 빈들의 이름을 배열로 얻는다.
        //String[] beanDefinitionNames = context.getBeanDefinitionNames();

        //확인해보기 : 우리가 application.xml 파일에 등록한 빈들의 이름을 확인할 수 있다.
        //결과 : [bookService, bookRepository]
        //System.out.println(Arrays.toString(beanDefinitionNames));

        //빈 이름으로 실제 빈을 얻기 : getBean() 의 반환형이 Object라 형 변환을 해주어야 한다.
        //BookService bookService = (BookService)context.getBean("bookService");

        //그 다음 얻은 빈 bookService 객체의 필드 bookRepository가 null이 아닌지 확인해보기.
        //결과 : true (즉, 의존성 주입이 잘 되어있다는 의미이다.)
        //System.out.println(bookService.bookRepository != null);

        //////////////////////////////////////////////////////////////////////////////////////////////

        //매개변수로 전달된 클래스를 빈 설정 파일로 정했다는 코드이다.
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService)context.getBean("bookService");
        System.out.println(bookService.bookRepository != null);

    }


}
