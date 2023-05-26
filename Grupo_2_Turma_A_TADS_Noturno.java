

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Grupo_2_Turma_A_TADS_Noturno {

  int inicio;

  int creditos;

  static void dificuldade(int m) {
    int dific;
    Scanner ler = new Scanner(System.in);

    if (m == 1) {
      do {
        System.out.println("Selecione a dificuladade");
        System.out.println("");
        System.out.println("");
        System.out.println("1-Facil");
        System.out.println("2-Medio");
        System.out.println("3-Dificil");
        dific = ler.nextInt();

        if (dific == 1) {
          int facil = 1;
          inicioFacil(facil);
        }

        if (dific == 2) {
          int medio = 1;
          inicioMedio(medio);
        }

        if (dific == 3) {
          int dificil = 1;
          inincioDificil(dificil);
        }

      } while (dific != 1 && dific != 2 && dific != 3 && dific != 4);

    }

  }

  static void inincioDificil(int b) {
    System.out.println("3");
    String[] players = { "Alan Turing", "Ada Lovelace" };

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    int escolhaPlayer;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;

    String perguntas[] = { "Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5" };

    if (b == 1) {

      do {
        System.out.println("Escolha seu personagem");
        System.out.println("1." + players[0] + " Mago da Algebra");
        System.out.println("2." + players[1] + " a Feticeira Matematica");
        escolhaPlayer = ler.nextInt();
      } while (escolhaPlayer < 1 || escolhaPlayer > 2);
      // Fim da Escolha do Personagem

      switch (b) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            do {// do While Pergunta 1
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[0]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 1

            do {// do While Pergunta 2
              // Historia
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("150");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[1]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 2

            do {// do While Pergunta 3
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 3

            do {// do While Pergunta 4
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[3]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 4

            do {// do While Pergunta 5
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 5

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioMedio(int c) {
    System.out.println("2");

    String[] players = { "Alan Turing", "Ada Lovelace" };

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    int escolhaPlayer;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;

    String perguntas[] = { "Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5" };

    if (c == 1) {

      do {
        System.out.println("Escolha seu personagem");
        System.out.println("1." + players[0] + " Mago da Algebra");
        System.out.println("2." + players[1] + " a Feticeira Matematica");
        escolhaPlayer = ler.nextInt();
      } while (escolhaPlayer < 1 || escolhaPlayer > 2);
      // Fim da Escolha do Personagem

      switch (c) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            do {// do While Pergunta 1
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[0]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 1

            do {// do While Pergunta 2
              // Historia
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("150");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[1]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 2

            do {// do While Pergunta 3
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 3

            do {// do While Pergunta 4
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[3]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 4

            do {// do While Pergunta 5
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 5

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioFacil(int d) {

    String[] players = { "Alan Turing", "Ada Lovelace" };

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    int escolhaPlayer;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;

    String perguntas[] = { "Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5" };

    if (d == 1) {

      do {
        System.out.println("Escolha seu personagem");
        System.out.println("1." + players[0] + " Mago da Algebra");
        System.out.println("2." + players[1] + " a Feticeira Matematica");
        escolhaPlayer = ler.nextInt();
      } while (escolhaPlayer < 1 || escolhaPlayer > 2);
      // Fim da Escolha do Personagem

      switch (d) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            do {// do While Pergunta 1
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[0]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 1

            do {// do While Pergunta 2
              // Historia
              ArrayList<String> alternativas1 = new ArrayList<String>();
              ArrayList<String> sequencia2 = new ArrayList<String>();
              alternativas1.add("10");
              alternativas1.add("20");
              alternativas1.add("1");
              alternativas1.add("150");

              sequencia2.add("(A)");
              sequencia2.add("(B)");
              sequencia2.add("(C)");
              sequencia2.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[1]);

              Collections.shuffle(alternativas1);

              int tamanhoMaiorLista1 = Math.max(sequencia2.size(), alternativas1.size());

              for (int i = 0; i < tamanhoMaiorLista1; i++) {
                String elemento1 = (i < sequencia2.size()) ? sequencia2.get(i) : "";
                String elemento2 = (i < alternativas1.size()) ? alternativas1.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 2

            do {// do While Pergunta 3
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }

              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 3

            do {// do While Pergunta 4
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[3]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 4

            do {// do While Pergunta 5
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("10");
              alternativas.add("20");
              alternativas.add("1");
              alternativas.add("100");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              System.out.println(players[escolhaPlayer - 1] + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + "    " + elemento2);

              }
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("C")) {
                System.out.println("voce mataou o inimigo");
                vidaInimigo--;
                repitir = 0;
                break;
              }

              else {
                vidaPlayer--;
                if (vidaPlayer == 0) {
                  repitir = 0;
                  System.out.println("Você morreu deseja recomeçar");
                  System.out.println("(1) - Sim");
                  System.out.println("(2) - Não");
                  recomecar = ler.nextInt();

                  if (recomecar == 2) {
                    System.out.println("Até a Proxima!!");
                    System.exit(0);
                  }

                } else {
                  System.out.println("Você errou e tomou dano, você tem mais " + vidaPlayer + " tentativa");
                  repitir = 1;
                }

              }

            } while (repitir == 1);// Fim do While pergunta 5

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();
  }

  static void creditosFinais(int c) {
    if (c == 2) {
      System.out.println("Creditos: ");// aquicolocamos os creditos
      System.out.println("Para recomecar o jogo aperte F5");
      System.exit(0);
    }

  }

  static void sair(int s) {
    if (s == 3) {
      System.out.println("Obrigado e volte sempre!!");
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    int inicio;
    Scanner ler = new Scanner(System.in);

    do {
      System.out.println("***************Welcome the BitsWar**********");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("****************1. Jogar*******************");
      System.out.println(" ");
      System.out.println("****************2. Creditos****************");
      System.out.println(" ");
      System.out.println("****************3. Sair********************");
      System.out.println(" ");
      inicio = ler.nextInt();
      dificuldade(inicio);
    } while (inicio != 1 && inicio != 2 && inicio != 3 && inicio != 4);
    if (inicio == 2) {
      int creditosFinais = 2;
      creditosFinais(creditosFinais);
    } else if (inicio == 3) {
      int sair = 3;
      sair(sair);
    }
  }

}
