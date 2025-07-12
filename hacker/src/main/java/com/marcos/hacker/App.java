package com.marcos.hacker;

import com.marcos.hacker.utils.TerminalUtils;
import com.marcos.hacker.utils.Wait;
import com.marcos.hacker.missoes.MissaoRede;

/**
 * Hello world!
 *
 */
public class App 
{

     
    public static void main( String[] args ) throws InterruptedException
    {

        MissaoRede m1 = new MissaoRede();
        Wait esp = new Wait();
        TerminalUtils ter = new TerminalUtils();


        // ter.limparTerminal();
        // m1.brif();
        // esp.esperar(2);
        // ter.limparTerminal();
        // m1.dados();
        // esp.esperar(2);
        // ter.limparTerminal();
        m1.terminal();
        m1.puzzle01();
        System.out.println("  ");
        


    }
}
