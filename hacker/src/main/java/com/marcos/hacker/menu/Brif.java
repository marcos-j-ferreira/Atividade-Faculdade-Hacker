package com.marcos.hacker.menu;

import java.util.Scanner;

import com.marcos.hacker.utils.TerminalUtils;
import com.marcos.hacker.utils.Wait;
import com.marcos.hacker.missoes.MissaoRede;

public class Brif{

    public final void menuTerminal() throws InterruptedException{

        Scanner input = new Scanner(System.in);
        MissaoRede m1 = new MissaoRede();
        Wait esp = new Wait();
        TerminalUtils ter = new TerminalUtils();

        ter.limparTerminal();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE INVASÃO - ORBIS       ║");
        System.out.println("║      [ACESSO RESTRITO AO USUÁRIO]    ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        System.out.println("[Sistema] Inicializando protocolo de acesso...");
        esp.esperar(1);
        System.out.println("[Sistema] Verificando identidade do agente...");
        esp.esperar(1);
        System.out.println("[Sistema] Conexão segura estabelecida.\n");
        System.out.print("*BIP.");
        for (int i = 0; i < 7; i++) {
            System.out.print(". ");
            Thread.sleep(400);
        }

        ter.explosaoDeLogsAvancado();

        System.out.println("\n[INFO] Pressione [ENTER] para continuar para o briefing.");
        input.nextLine();

        ter.limparTerminal();
        m1.brif();

        System.out.println("\n[INFO] Pressione [ENTER] para continuar para análise de dados.");
        input.nextLine();

        ter.limparTerminal();
        m1.dados();

        System.out.println("\n[INFO] Pressione [ENTER] para acessar o terminal.");
        input.nextLine();

        ter.limparTerminal();
        m1.terminal();

        System.out.println("\n[SISTEMA] Você está prestes a executar sua primeira invasão.");
        System.out.println("[ALVO] IPs protegidos por protocolos binários.");
        System.out.println("[OBJETIVO] Decodifique a rota e acesse o servidor seguro.");
        System.out.println("\n[INFO] Pressione [ENTER] para iniciar o primeiro desafio.");
        input.nextLine();

        ter.limparTerminal();
        m1.puzzle01();
        System.out.println(" ");
    }
}