package com.marcos.hacker.utils;

import java.io.IOException;
import java.util.Random;

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

    public void explosaoDeLogsAvancado() throws InterruptedException {
        Random rand = new Random();
        String[] tags = {"[INFO]", "[WARNING]", "[ERROR]", "[DEBUG]", "[CRITICAL]", "[FAIL]", "[TRACE]", "[SYSLOG]"};
        String[] mensagens = {
            "Thread killed due to memory leak",
            "Auth timeout at sector",
            "Connection lost to node",
            "Reloading /etc/orbis/core.conf",
            "Packet dropped: malformed header",
            "Binary checksum failed",
            "Overriding system lockout...",
            "SIGKILL received on main process",
            "Temporary buffer corrupted",
            "Filesystem mounted readonly",
            "Encrypting memory space",
            "Device 0xA34C disconnected",
            "Invalid response from 10.42.0.254",
            "Root daemon restarting",
            "Unauthorized access attempt",
            "Writing to swap partition",
            "watchdog: system not responding",
            "Rolling log... sequence mismatch",
            "Core overflow. Attempting fallback",
            "Entering emergency mode..."
        };

        for (int i = 0; i < 25; i++) {
            String tag = tags[rand.nextInt(tags.length)];
            String msg = mensagens[rand.nextInt(mensagens.length)];
            String linha = String.format("%s [0x%08X] %s...%s", 
                            tag, rand.nextInt(0xFFFFFFF), 
                            msg, gerarLixoTecnico(rand, 60 + rand.nextInt(20)));

            System.out.println(linha);
            Thread.sleep(40);
        }

        Thread.sleep(500);
        System.out.print("orbis@brif:~$ ");
    }

    private static String gerarLixoTecnico(Random rand, int comprimento) {
        String simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789/\\|@#$%^&*-_=+<>~";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < comprimento; i++) {
            sb.append(simbolos.charAt(rand.nextInt(simbolos.length())));
        }
        return sb.toString();
    }
}
