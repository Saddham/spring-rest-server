package com.saddham;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * Created by saddhamp on 23/3/16.
 */
public class TestClass {

    public static void main(String [] args){
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource [] resources = resolver.getResources("/i18n/ValidationMessages.properties");
            System.out.println(resources.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
