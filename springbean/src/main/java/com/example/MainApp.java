package com.example;



import com.annotation.beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("text.xml");

        SpellChecker sp1=new SpellChecker();

        TextEditor txt = (TextEditor) context.getBean("textEditor");
        System.out.println(txt.getSpellChecker() );
//        txt.getSpellChecker();
//        txt.spellCheck();





    }
}