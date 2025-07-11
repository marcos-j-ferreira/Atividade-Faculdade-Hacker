package com.marcos.hacker.utils;

/**
 * Classe responsável por limpar o teminal.
 */

import java.io.IOException;

public class TerminalUtils{

    public final void limparTerminal(){

        try{
            if(System.getProperty("os.name").contains("Linux")){
                new ProcessBuilder("Clear").inheritIO().start().waitFor();
            }
        }catch (IOException | InterruptedException e){

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } 
}
