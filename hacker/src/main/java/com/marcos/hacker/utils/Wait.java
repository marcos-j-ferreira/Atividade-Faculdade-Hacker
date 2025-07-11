package com.marcos.hacker.utils;

public class Wait {

    public final void esperar( int y){

        try{
        Thread.sleep(y * 1000L);
        } catch (InterruptedException e){

        }
    }   
}
