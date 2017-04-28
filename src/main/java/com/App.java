package com;

import com.abstractfactory.NameIsIrrelevant;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        NameIsIrrelevant nameIsIrrelevant=new NameIsIrrelevant();
        System.out.println( "result = "+nameIsIrrelevant.instance().getObject("456") );
    }
}