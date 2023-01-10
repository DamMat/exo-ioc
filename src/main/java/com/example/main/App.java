package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.models.IMusicien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		IMusicien myMusicien = (IMusicien) context2.getBean("guitariste");
		myMusicien.jouer();

    }
}
