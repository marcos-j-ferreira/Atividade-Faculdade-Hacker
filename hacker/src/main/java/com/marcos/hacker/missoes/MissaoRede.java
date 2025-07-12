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
        System.out.println("- verify-bin <IP>");
    }

    public String dados(){
        //GET-CORE

        System.out.println("Ponto de partida: IP descoberto para início da investigação -> "+ ip);

        System.out.println("Lembrete de ferramentas disponíveis:");
        System.out.println("- ping");
        System.out.println("- nmap");
        System.out.println("- traceroute");
        //System.out.println("- whois");
        System.out.println("- verify-bin <IP>");
        System.out.println("- get-core <IP>");


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

    public final static void nmap() {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║         Network Scan Result      ║");
        System.out.println("╠══════════════════════════════════╣");
        //System.out.println("║ IP:192.168.1.1  | Online  | DNS  ║");
        System.out.println("║ IP:192.168.1.5   | Online  | DB  ║");
        System.out.println("║ IP: 192.168.1.9  | Offline | --- ║");
        System.out.println("╚══════════════════════════════════╝");
    }

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

    public final static void pingInvalido(String ip) throws InterruptedException {
        System.out.println("PING " + ip + " ...");
        Thread.sleep(400);
        System.out.println("Solicitando resposta...");
        Thread.sleep(500);
        System.out.println(".");

        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            Thread.sleep(300);
        }

        System.out.println("\n\n╔════════════════════════════════════╗");
        System.out.println("║         ERRO NA COMUNICAÇÃO        ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf ("║ IP: %-15s │ SEM RESPOSTA           ║%n", ip);
        System.out.println("║ Motivo: serviço indisponível       ║");
        System.out.println("║ Ou: acesso negado pela rede        ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
    }

    public static void pingSimulado(String ip) throws InterruptedException {
        System.out.println("PING " + ip + " ( " + ip + " ) 56(84) bytes of data:");

        Random rand = new Random();

        for (int i = 1; i <= 15; i++) {
            double tempo = 20 + rand.nextDouble() * 5; // tempo entre 20~25 ms
            int ttl = 64;

            System.out.printf("64 bytes from %s: icmp_seq=%d ttl=%d time=%.1f ms%n",
                    ip, i, ttl, tempo);

            Thread.sleep(600);
        }

        // Simulando resumo igual ao ping do Linux
        System.out.println();
        System.out.printf("--- %s ping statistics ---\n", ip);
        System.out.println("4 packets transmitted, 4 received, 0% packet loss, time 2402ms");
        System.out.println("rtt min/avg/max = 20.3/22.7/24.9 ms");
    }

    public static void comandoRestrito(String comando, String ip) throws InterruptedException {
        System.out.printf("Executando '%s' em %s...\n", comando, ip);
        Thread.sleep(500);

        System.out.println("Verificando permissões...");
        Thread.sleep(600);
        System.out.println("Estabelecendo conexão segura...");
        Thread.sleep(600);

        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║        ACESSO RESTRITO DETECTADO            ║");
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.printf ("║ Comando: %-30s      ║%n", comando);
        System.out.printf ("║ Alvo: %-33s         ║%n", ip);
        System.out.println("║ Erro: Serviço não autorizado para esse host ║");
        System.out.println("║ Motivo: Política de segurança ativa         ║");
        System.out.println("║ Status: Conexão encerrada pelo host remoto  ║");
        System.out.println("╚═════════════════════════════════════════════╝");

        Thread.sleep(400);
        System.out.println("\n[LOG] Tentativa registrada pelo firewall central.");
        System.out.println("[INFO] Sugestão: tente outro comando ou IP autorizado.\n");
        System.out.print("orbis@brif:~$ ");
    }

    public static void exibirAjuda() throws InterruptedException {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║         ≡ TERMINAL DE COMANDOS ATIVOS ≡                ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        Thread.sleep(300);
        System.out.println("║ > ping               │ verifica status de um IP        ║");
        Thread.sleep(300);
        System.out.println("║ > get-core           │ coleta dados                    ║");
        Thread.sleep(300);
        System.out.println("║ > nmap               │ escaneia dispositivos na rede   ║");
        Thread.sleep(300);
        System.out.println("║ > traceroute         │ rastreia a rota até o destino   ║");
        Thread.sleep(300);
        System.out.println("║ > verify-bin <IP>    │ verifica integridade binária    ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        Thread.sleep(500);

        System.out.println("\n [DICA]: tente executar os comandos acima em diferentes IPs.");
        Thread.sleep(600);
        System.out.println(" Nem todos os hosts respondem igual. Alguns... escondem algo.");
        Thread.sleep(800);
        System.out.println("LOG: Atividade do terminal está sendo monitorada...");
        Thread.sleep(1000);
        System.out.print("\norbis@brif:~$ ");
    }

    public static void analisadorDeRotas() throws InterruptedException {
        System.out.println("[ ANALISADOR DE ROTAS DE PACOTE - CAMADA DE REDE ]\n");
        Thread.sleep(600);

        System.out.println("| ROTA 01 |");
        System.out.println("Origem.................: 192.168.1.1");
        System.out.println("Nó Intermediário.......: 11000000.10101000.00000001.00000100");
        System.out.println("Destino................: 192.168.1.5");
        System.out.println("Status.................: Integridade Confirmada\n");
        Thread.sleep(700);

        System.out.println("| ROTA 02 |");
        System.out.println("Origem.................: 192.168.1.1");
        System.out.println("Nó Intermediário.......: C0.A8.01.05");
        System.out.println("Destino................: 192.168.1.6");
        System.out.println("Status.................: Integridade Confirmada\n");
        Thread.sleep(700);

        System.out.println("| ROTA 03 |");
        System.out.println("Origem.................: 192.168.1.1");
        System.out.println("Nó Intermediário.......: 11000000.10101000.00000001.00000111");
        System.out.println("Destino................: @@@.1@8.1.@");
        System.out.println("Status.................: Falha de Verificação: Integridade comprometida\n");
        Thread.sleep(800);

        // System.out.println("💡 DICA: Traduza o nó binário da ROTA 3 para o formato decimal.");
        // System.out.println("📌 Padrão semelhante às rotas anteriores pode revelar o IP oculto.");
        // Thread.sleep(600);
        System.out.print("\norbis@brif:~$ ");
    }

    public static void revelarIpMaster() throws InterruptedException {
        System.out.println("\nDecodificação aceita.");
        Thread.sleep(500);
        System.out.println("Validando pacotes...");
        Thread.sleep(600);
        System.out.println("Acesso a camadas superiores autorizado.");
        Thread.sleep(800);

        System.out.println("\n╔═══════════════════════════════════════════════════╗");
        System.out.println("║             NÓ OCULTO IDENTIFICADO                  ║");
        System.out.println("╠═════════════════════════════════════════════════════╣");
        System.out.println("║ IP MASTER..............: 10.42.0.254                ║");
        System.out.println("║ CAMADA..................: Root-Level                ║");
        System.out.println("║ SISTEMA................: Orbis OS (versão sigilosa) ║");
        System.out.println("║ STATUS..................: Ativo / Aguardando..      ║");
        System.out.println("║ ÚLTIMO CONTATO..........: 03h42min atrás            ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
        Thread.sleep(800);

        System.out.println("\n CONEXÃO ESTABELECIDA COM O IP MASTER.");
        Thread.sleep(600);
        System.out.println("  TODOS OS OLHOS ESTÃO SOBRE VOCÊ...");
        Thread.sleep(700);
        System.out.println(" ALERTA: Qualquer ação nesta instância será monitorada pelo núcleo.");
        Thread.sleep(900);
        System.out.print("\norbis@brif:~$ ");
    }


    public static void executarExtracaoFinal() throws InterruptedException {
        System.out.println("Conectando a 10.42.0.254...");
        Thread.sleep(1000);
        System.out.println("Acesso concedido. Iniciando operação: extract-core");
        Thread.sleep(1200);
        System.out.println();

        // Simulando terminal de extração estilo Linux
        for (int i = 1; i <= 10; i++) {
            String arquivo = "orbis/core/segment" + i + ".bin";
            System.out.printf("[*] Extraindo %-30s [", arquivo);
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
                Thread.sleep(20);
            }
            System.out.println("] OK");
            Thread.sleep(80);
        }

        

        Thread.sleep(600);
        System.out.println("\nFinalizando processo...");
        Thread.sleep(1000);
        System.out.println("[WARNING] Todos os arquivos extraídos com sucesso.");
        Thread.sleep(800);
        System.out.println("[INFO] ATENÇÃO: Detecção de checksum alterado em segmentos críticos.");
        Thread.sleep(1000);
        System.out.println("[log] Sessão será encerrada pelo sistema remoto por segurança...\n");
        Thread.sleep(1500);

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║        CONEXÃO TERMINADA PELO HOST         ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ IP...................: 10.42.0.254         ║");
        System.out.println("║ Motivo...............: Protocolo encerrado ║");
        System.out.println("║ Status...............: Sessão encerrada    ║");
        System.out.println("╚════════════════════════════════════════════╝");

        Thread.sleep(1000);

        System.out.print("\norbis@brif:~$ ");
    }

    public static void missaoConcluida() throws InterruptedException {
        System.out.println("\nFinalizando protocolo...");
        Thread.sleep(1000);
        System.out.println("Analisando rastros digitais...");
        Thread.sleep(900);
        System.out.println("Encerrando sessão segura...");
        Thread.sleep(700);

        System.out.println("\n\n╔════════════════════════════════════════════╗");
        Thread.sleep(100);
        System.out.println("║                                                ║");
        Thread.sleep(100);
        System.out.println("║      ████╗  █████╗ ███████╗███████╗██╗         ║");
        Thread.sleep(100);
        System.out.println("║     ██╔══██╗██╔══██╗╚══███╔╝██╔════╝██║        ║");
        Thread.sleep(100);
        System.out.println("║     ██████╔╝███████║  ███╔╝ █████╗  ██║        ║");
        Thread.sleep(100);
        System.out.println("║     ██╔═══╝ ██╔══██║ ███╔╝  ██╔══╝  ██║        ║");
        Thread.sleep(100);
        System.out.println("║     ██║     ██║  ██║███████╗███████╗███████╗   ║");
        Thread.sleep(100);
        System.out.println("║     ╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝   ║");
        Thread.sleep(100);
        System.out.println("║                                                ║");
        System.out.println("║         MISSÃO CONCLUÍDA COM SUCESSO           ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║ Próximo nível desbloqueado: [REDACTED]         ║");
        System.out.println("║ Registro salvo em: /root/orbis/relatos.log     ║");
        System.out.println("║ Nível de rastreamento:  BAIXO                  ║");
        System.out.println("║ Código de sessão: 0x5F2C9A3D                   ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        Thread.sleep(1400);
        System.out.println("\n [!!!!] Você foi observado. Você passou no teste.");
        Thread.sleep(1200);
        System.out.println("@@@@ Prepare-se. Há mais por trás do Orbis do que você imagina...");
        Thread.sleep(1000);

        System.out.print("\norbis@brif:~$ ");
    }


    public static void explosaoDeLogsAvancado() throws InterruptedException {
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

        // Simula muitas linhas subindo rapidamente
        for (int i = 0; i < 100; i++) {
            String tag = tags[rand.nextInt(tags.length)];
            String msg = mensagens[rand.nextInt(mensagens.length)];

            // Simula uma linha longa com data e detalhes técnicos
            String linha = String.format("%s [0x%08X] %s...%s", 
                            tag, rand.nextInt(0xFFFFFFF), 
                            msg, gerarLixoTecnico(rand, 60 + rand.nextInt(20)));

            System.out.println(linha);
            Thread.sleep(30); // velocidade rápida e dramática
        }

        Thread.sleep(500);
        System.out.println("\n [INFO] BUFFER OVERFLOW DETECTADO...");
        Thread.sleep(600);
        System.out.println("[INFO] KERNEL PANIC — SISTEMA CRITICAMENTE INSTÁVEL");
        Thread.sleep(800);
        System.out.println("[INFO] INICIANDO PROTOCOLO DE CONTENÇÃO...\n");
        Thread.sleep(1000);
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

    public static void comandoProibidoDetectado() throws InterruptedException {
        System.out.println("> override-core --force");
        Thread.sleep(800);
        System.out.println("Executando comando não autorizado...");
        Thread.sleep(900);
        System.out.println("Tentando burlar camadas de segurança...");
        Thread.sleep(1000);
        System.out.println("...\n");
        Thread.sleep(500);

        // Começa o colapso visual
        for (int i = 0; i < 6; i++) {
            System.out.println("[INFO] ALERTA: SISTEMA INTRUSO DETECTADO!");
            Thread.sleep(200);
        }

        Thread.sleep(500);
        System.out.println("\n[INFO] VOCÊ FOI LOCALIZADO.");
        Thread.sleep(1000);

        System.out.println("\n[INJEÇÃO DE CÓDIGO EM CURSO...]");
        Thread.sleep(500);

        for (int i = 0; i < 30; i++) {
            System.out.println(gerarIntrusao());
            Thread.sleep(50);
        }

        Thread.sleep(700);
        System.out.println("\n[INFO] ACESSO NEGADO.");
        Thread.sleep(600);
        System.out.println("[INFO] SEU TERMINAL FOI CONGELADO.");
        Thread.sleep(700);
        System.out.println("[INFO] TODOS OS SEUS PACOTES FORAM INTERCEPTADOS.");
        Thread.sleep(800);

        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("║           MISSÃO FALHOU - DETECTADO        ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║ Status.............: Identidade exposta    ║");
        System.out.println("║ Logs capturados....: Sim                   ║");
        System.out.println("║ Código de rastreio.: TRC-1F9A84            ║");
        System.out.println("║ Medidas ativas.....: Contra-invasão        ║");
        System.out.println("╚════════════════════════════════════════════╝");

        Thread.sleep(1000);
        System.out.println("\n[INFO] Você foi pego. Orbis viu tudo. A missão termina aqui.");

        System.out.print("\n[ TERMINAL ENCERRADO PERMANENTEMENTE ]\n");
    }

// Mensagens aleatórias como se fossem um sistema invadindo
    private static String gerarIntrusao() {
        String[] ataques = {
            ">> Reescrevendo ACLs...",
            ">> Escalando privilégios...",
            ">> Anexando rastreamento ao PID 1424...",
            ">> Varrendo porta 22, 443, 8080...",
            ">> Dumping memória RAM...",
            ">> Forçando reboot falso...",
            ">> Injecting kernel module [ghost_mod]",
            ">> Criptografando stdout...",
            ">> Redirecionando logs para IP master...",
            ">> hash_match: FOUND (0xFA3C01)",
            ">> Root hook ativo.",
            ">> stdout > /dev/null [TAMPADO]",
            ">> Loop de watchdog desativado.",
            ">> Signal TRAP - não autorizado",
            ">> /bin/bash: comando interceptado",
            ">>  Secure zone breach confirmed",
            ">> Logging keystrokes..."
        };
        return ataques[new Random().nextInt(ataques.length)];
    }

    public static void servicoIndisponivel(String ip, String comando) throws InterruptedException {
        System.out.printf("> %s %s%n", comando, ip);
        Thread.sleep(700);

        System.out.println("\nTentando estabelecer conexão com o host...");
        Thread.sleep(900);
        System.out.println("Enviando pacotes...");
        Thread.sleep(800);
        System.out.println("Aguardando resposta do serviço...");
        Thread.sleep(1200);

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║            SERVIÇO INDISPONÍVEL              ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.printf("║ Host.............: %-25s ║%n", ip);
        System.out.printf("║ Comando..........: %-25s ║%n", comando);
        System.out.println("║ Código...........: 503 (Service Unavailable)  ║");
        System.out.println("║ Status...........: Host ativo, serviço offline║");
        System.out.println("║ Recomendação.....: Tente novamente mais tarde ║");
        System.out.println("╚═══════════════════════════════════════════════╝");

        Thread.sleep(1200);
        System.out.println("\n  A comunicação com o serviço foi recusada.");
        Thread.sleep(800);
        System.out.println(" Diagnóstico: Nenhuma porta escutando requisições neste endpoint.");
        Thread.sleep(1000);

        System.out.print("\norbis@brif:~$ ");
    }



    public final boolean puzzle01() throws InterruptedException {

        String[] comandos = {"HELP","NMAP 192.168.34.12", "PING 192.168.34.12", "TRACEROUTE 192.168.34.12", "VERIFY-BIN 192.168.34.12", "PING 192.168.1.5", "PING 192.168.1.9", "TRACEROUTE 192.168.1.5","VERIFY-BIN 192.168.1.7", "GET-CORE 10.42.0.254", "NMAP 192.168.1.5", "VERIFY-BIN 192.168.1.5", "NMAP 192.168.1.9", "TRACEROUTE 192.168.1.9", "VERIFY-BIN 192.168.1.9", "PING 192.168.1.7", "NMAP 192.168.1.7", "TRACEROUTE 192.168.1.7", "NMAP 10.42.0.254", "PING 10.42.0.254", "VERIFY-BIN 10.42.0.254", "TRACEROUTE 10.42.0.254"};//14

        //"VERIFY-BIN 192.168.1.9" == 14

        boolean continuar = true;

        int v = 0;

        while(continuar){

            if( v == 12){
                comandoProibidoDetectado();
                gerarIntrusao();
                System.out.println("\n=========== você falhou ==============\n");
                return false;
            }
            System.out.printf("orbis@brif:~$ [WARNING] número de tentativas até ser rastreado: %d/12 \n", v);

            System.out.print("orbis@brif:~$ [Enter um comando]: ");
            String comando = input.nextLine().toUpperCase();

            int number = 0;
            number = 0;

            boolean existe = Arrays.stream(comandos)
                                    .anyMatch(cmd -> cmd.equalsIgnoreCase(comando));

            if (existe) {

                for(int i = 0; i < comandos.length; i++){
                    if(comando.equals(comandos[i])){
                        number = i;
                        break;
                    }
                }

                switch(number){
                case 0 -> {
                    exibirAjuda();
                }
                case 1 -> {
                    nmap();
                }
                case 2 -> {
                    pingSimulado(ip);
                }
                case 3 -> {
                    comandoRestrito("TRACEROUTE", "192.168.34.12");
                }
                case 4 -> {
                    comandoRestrito("VERIFY-BIN", "192.168.34.12");
                }
                case 5 -> {
                    pingSimulado("192.168.1.5");
                }
                case 6 -> {
                    pingInvalido("192.168.1.9");
                }
                case 7 -> {
                    analisadorDeRotas();
                }
                case 8 -> {
                    revelarIpMaster();
                }
                case 9 -> {
                    executarExtracaoFinal();
                    explosaoDeLogsAvancado();
                    missaoConcluida();
                }
                case 10 -> {
                    comandoRestrito("NMAP", "192.168.1.5");
                }
                case 11 -> {
                    comandoRestrito("VERIFY-BIN", "192.168.1.5");
                }
                case 12 -> {
                    comandoRestrito("NMAP","192.168.1.9");
                }
                case 13 -> {
                    servicoIndisponivel("192.168.1.9", "TRACEROUTE");// alterar 
                }
                case 14 -> {
                    servicoIndisponivel("192.168.1.9", "VERIFY-BIN");// alterar 
                }
                default -> {
                    comandoProibidoDetectado();
                    gerarIntrusao();
                }
            }

            }else {
                try{
                    comandoInvalido();
                    number = 20;;
                } catch ( InterruptedException e){
                        e.printStackTrace();
                    }
                }

            // switch(number){
            //     case 0 -> {
            //         exibirAjuda();
            //     }
            //     case 1 -> {
            //         nmap();
            //     }
            //     case 2 -> {
            //         pingSimulado(ip);
            //     }
            //     case 3 -> {
            //         comandoRestrito("TRACEROUTE", "192.168.34.12");
            //     }
            //     case 4 -> {
            //         comandoRestrito("VERIFY-BIN", "192.168.34.12");
            //     }
            //     case 5 -> {
            //         pingSimulado("192.168.1.5");
            //     }
            //     case 6 -> {
            //         pingInvalido("192.168.1.9");
            //     }
            //     case 7 -> {
            //         analisadorDeRotas();
            //     }
            //     case 8 -> {
            //         revelarIpMaster();
            //     }
            //     case 9 -> {
            //         executarExtracaoFinal();
            //         explosaoDeLogsAvancado();
            //         missaoConcluida();
            //     }
            //     case 10 -> {
            //         comandoRestrito("NMAP", "192.168.1.5");
            //     }
            //     case 11 -> {
            //         comandoRestrito("VERIFY-BIN", "192.168.1.5");
            //     }
            //     case 12 -> {
            //         comandoRestrito("NMAP","192.168.1.9");
            //     }
            //     case 13 -> {
            //         servicoIndisponivel("192.168.1.9", "TRACEROUTE");// alterar 
            //     }
            //     case 14 -> {
            //         servicoIndisponivel("192.168.1.9", "VERIFY-BIN");// alterar 
            //     }
            //     default -> {
            //         comandoProibidoDetectado();
            //         gerarIntrusao();
            //     }
            // }

            v++;

        }

        return false;
    }
}
