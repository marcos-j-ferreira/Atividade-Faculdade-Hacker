package com.marcos.hacker.missoes;

import com.marcos.hacker.utils.TerminalUtils;
import java.io.IOException;

import java.util.Scanner; 
import java.util.Random;
import java.util.Arrays;

public class MissaoRede{

    private String ip = "192.168.34.12";
    private Scanner input = new Scanner(System.in);

    public void brif(){
        System.out.println("Relatório de Inteligência (B.R.I.F):");
        System.out.println("Empresa: OrbisData Corp");
        System.out.println("Objetivo: Obter acesso ao servidor de arquivos internos (Servidor-Alvo: ORB-SRV02).");
        System.out.println("Rede com múltiplas sub-redes internas, roteadores com monitoramento parcial.");
        System.out.println("Algumas portas e serviços estão ativos mas não documentados.");
        System.out.println("Tarefa: Escanear, investigar e infiltrar-se discretamente até o servidor-alvo.");
        System.out.println("Recompensa: +1 Nível de Acesso | +10 Pontos de Reputação Hacker\n");

        System.out.println("Ferramentas disponíveis:");
        System.out.println("- ping");
        System.out.println("- nmap");
        System.out.println("- traceroute");
        //System.out.println("- whois");
        System.out.println("- verify-bin <IP>");
    }

    public String dados(){

        System.out.println("Ponto de partida: IP descoberto para início da investigação -> "+ ip);

        System.out.println("Lembrete de ferramentas disponíveis:");
        System.out.println("- ping");
        System.out.println("- nmap");
        System.out.println("- traceroute");
        System.out.println("- whois");
        System.out.println("- verify-bin <IP>");

        String nome = "marcos";

        return nome;
    }

    public void terminal(){

        //Scanner input = new Scanner(System.in);

        try {
            Thread.sleep(1000);
            System.out.println("Autenticando usuário...");
            Thread.sleep(1000);
            System.out.println("Acesso concedido.\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            System.out.println("\nEstabelecendo conexão com o host remoto...");
            for (int i = 0; i < 3; i++) {
                System.out.print("Carregando");
                for (int j = 0; j < 3; j++) {
                    Thread.sleep(500);
                    System.out.print(".");
                }
                System.out.println();
            }

            Thread.sleep(800);
            System.out.println("\nConexão estabelecida com sucesso.");
            Thread.sleep(1000);
            System.out.println("Iniciando terminal seguro...\n");
            Thread.sleep(1500);

            // Simulação de terminal tipo Linux
            System.out.println("╔════════════════════════════════════════════════════════╗");
            System.out.println("║              TERMINAL DE INFILTRAÇÃO ATIVO             ║");
            System.out.println("║              Sessão: orbis@brif | Host: ORB-SRV02      ║");
            System.out.println("╚════════════════════════════════════════════════════════╝\n");
            Thread.sleep(300);
            System.out.println("IP da conexão: "+ ip);

            // Interface estática tipo terminal

            for(int i = 0; i < 10; i++){
                System.out.println("orbis@brif:~$ ");
                Thread.sleep(500);

            }
            //System.out.print("orbis@brif:~$ ");
            //String comando = input.nextLine();

            // System.out.println("orbis@brif:~$ █");
            // System.out.println("orbis@brif:~$ █");
            // System.out.println("orbis@brif:~$ █");
            // System.out.print("orbis@brif:~$ █");

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public final static void nmap(){
        System.out.println("192.168.1.1 - Online - Serviço: DNS\n 192.168.1.5 - Online - Serviço: DB\n 192.168.1.7 - Offline");
    } 

    // public final static void none(){
    //     System.out.println("E: nenhum comando encontrado\n WARNIG: you to be desconc of network\n Falid desconect");
    //     System.out.print("orbis@brif:~$");
    // }

    public final static void comandoInvalido() throws InterruptedException {
        Random rand = new Random();
        int option = rand.nextInt(3); // 0, 1 ou 2

        System.out.println(); // espaço antes do erro

        switch (option) {
            case 0 -> {
                System.out.println("E: comando não reconhecido...");
                Thread.sleep(250);
                System.out.println("attempting override...");
                Thread.sleep(200);
                System.out.println("override denied. permission missing.");
                Thread.sleep(180);
                System.out.println("system status: [degraded]");
            }

            case 1 -> {
                System.out.println("WARNING: protocol mismatch");
                Thread.sleep(180);
                System.out.println("connection dropped.");
                Thread.sleep(220);
                System.out.println("attempting to re-route...");
                Thread.sleep(250);
                System.out.println("ERR:: route table not found.");
            }

            case 2 -> {
                System.out.println("ALERT: corrupted input stream detected.");
                Thread.sleep(200);
                System.out.println("E: falha crítica no shell principal...");
                Thread.sleep(250);
                System.out.println("fallback shell engaged.");
            }
        }

        Thread.sleep(150);
        System.out.print("orbis@brif:~$ ");
    }

    public final boolean puzzle01(){

        //Scanner input = new Scanner(System.in);

        // System.out.println("- traceroute");
        // //System.out.println("- whois");
        // System.out.println("- verify-bin <IP>");



        String[] comandos = {"NMPA 192.168.34.12", "PING 192.168.34.12", "TRACEROUTE 192.168.34.12", "VERIFY-BIN 192.168.34.12" };

        boolean continuar = true;

        while(continuar){

            System.out.print("orbis@brif:~$ [Enter um comando]: ");
            String comando = input.nextLine().toUpperCase();

            int number = 0;

            boolean existe = Arrays.stream(comandos)
                                    .anyMatch(cmd -> cmd.equalsIgnoreCase(comando));

            if (existe) {

                for(int i = 0; i < 4; i++){
                    if(comando.equals(comandos[i])){
                        number = i + 1;
                        break;
                    }
                }
            }else {
                try{
                    comandoInvalido();
                } catch ( InterruptedException e){
                        e.printStackTrace();
                    }
                }

            switch(number){
                case 1 -> {
                    nmap();
                }
                case 2 -> {
                    System.out.println("foi");
                }
            }
            
        }

        return false;
    }
}
