
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
        System.out.println("1- Facil");
        System.out.println("2- Medio");
        System.out.println("3- Dificil");
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
    String player =  "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;

    String perguntas[] = { "Pergunta 1", "Pergunta 2", "Pergunta 3", "Pergunta 4", "Pergunta 5" };

    if (b == 1) {

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
              System.out.println(player+ " um inimigo apareceu");// caixa de dialogo
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
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
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
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
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
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
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
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
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

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;
    int controleP = 1;
    int indicePergunta  = 0;

    String perguntas[] = perguntaMediana();

    if (c == 1) {

      switch (c) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            controleP = 1;
            do {// do While Pergunta 1
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("35b = 69");
              alternativas.add("69 = b - 35");
              alternativas.add("b + 35 = 69"); // Resposta Correta

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");

              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[0]);

              Collections.shuffle(alternativas);

              int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                System.out.println(elemento1 + " " + elemento2);

                if(elemento2.equalsIgnoreCase("b + 35 = 69")){
                  indicePergunta = i;
                }

              }

              String respostas = ler.next();

              if (sequencia.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                System.out.println("Você matou o inimigo");
                controleP++;
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
            
            if(controleP == 2) {// if Pergunta 2
              // Historia
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("R$ 142.000,00");
              alternativas.add("R$ 135.000,00");
              alternativas.add("R$ 90.000,00");
              alternativas.add("R$ 120.000,00"); // Resposta Correta

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do{//do While Pergunta 2
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[1]);

                Collections.shuffle(alternativas);

                int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

                for (int i = 0; i < tamanhoMaiorLista; i++) {
                  String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                  String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                  System.out.println(elemento1 + " " + elemento2);

                  if(elemento2.equalsIgnoreCase("R$ 120.000,00")){
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                  System.out.println("voce matou o inimigo");
                  controleP++;
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

              }while(repitir == 1);// Fim do While Pergunta 2

            };// Fim if pergunta 2

            if(controleP == 3){// if Pergunta 3
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("74"); // Resposta Correta
              alternativas.add("75");
              alternativas.add("76");
              alternativas.add("77");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do{//do While Pergunta 3
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);

              
                Collections.shuffle(alternativas);

                int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());

                for (int i = 0; i < tamanhoMaiorLista; i++) {
                  String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                  String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                  System.out.println(elemento1 + " " + elemento2);

                  if(elemento2.equalsIgnoreCase("74")){
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                  System.out.println("voce matou o inimigo");
                  controleP++;
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
              }while(repitir == 1);//Fim do While Pergunta 3

            };// Fim do if pergunta 3

            if(controleP == 4) {// if Pergunta 4
              // Historia

              

              // Fim Historia
              do{//do While Pergunta 4
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[3]);
                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("4")) {
                  System.out.println("Você matou o inimigo");
                  controleP++;
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
            }while(repitir == 1);//Fim do While Pergunta 4

            }// Fim do if pergunta 4

            if(controleP == 5) {// if Pergunta 5
              // Historia


              // Fim Historia
              do{// do While Pergunta 5
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);
              String respostas = ler.next();

              if (respostas.equalsIgnoreCase("1")) {
                System.out.println("Você matou o inimigo");
                controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 5

            }// Fim if pergunta 5

            if(controleP == 6) {// if Pergunta 6
              // Historia


              // Fim Historia
              do{// do While Pergunta 6
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[5]);
              System.out.println("Digite a menor Raiz");
              String respostas = ler.next();
              System.out.println("Digite a maior Raiz");
              String resposta2 = ler.next();

              if (respostas.equalsIgnoreCase("1") && resposta2.equalsIgnoreCase("5")) {
                System.out.println("Você matou o inimigo");
                controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 6

            }// Fim if pergunta 6

            if(controleP == 7) {// if Pergunta 7
              // Historia


              // Fim Historia
              do{// do While Pergunta 7
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[6]);
              System.out.println("Digite a menor Raiz");
              String respostas = ler.next();
              System.out.println("Digite a maior Raiz");
              String resposta2 = ler.next();

              if (respostas.equalsIgnoreCase("-1") && resposta2.equalsIgnoreCase("2,5")) {
                System.out.println("Você matou o inimigo");
                controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 7

            }// Fim if pergunta 7
            
            if(controleP == 8) {// if Pergunta 8
              // Historia


              // Fim Historia
              do{// do While Pergunta 8
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[7]);
              System.out.println("Digite a menor Raiz");
              String respostas = ler.next();
              System.out.println("Digite a maior Raiz");
              String resposta2 = ler.next();

              if (respostas.equalsIgnoreCase("-1")){
                if(resposta2.equalsIgnoreCase("3/4") || resposta2.equalsIgnoreCase("0,75")){
                  System.out.println("Você matou o inimigo");
                  controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 8

            }// Fim if pergunta 8

            if(controleP == 9) {// if Pergunta 9
              // Historia


              // Fim Historia
              do{// do While Pergunta 9
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[8]);
              System.out.println("Digite a menor Raiz");
              String respostas = ler.next();
              System.out.println("Digite a maior Raiz");
              String resposta2 = ler.next();

              if (respostas.equalsIgnoreCase("0")) {
                if(resposta2.equalsIgnoreCase("1/5") || resposta2.equalsIgnoreCase("0,2") ){
                  System.out.println("Você matou o inimigo");
                  controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 9

            }// Fim if pergunta 9

            if(controleP == 10) {// if Pergunta 10
              // Historia


              // Fim Historia
              do{// do While Pergunta 10
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[9]);
              System.out.println("Digite a menor Raiz");
              String respostas = ler.next();
              System.out.println("Digite a maior Raiz");
              String resposta2 = ler.next();

              if (respostas.equalsIgnoreCase("-1") && resposta2.equalsIgnoreCase("1")) {
                  System.out.println("Você matou o inimigo");
                  controleP++;
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
            }while(repitir == 1);// fim do While Pergunta 10

            }// Fim if pergunta 10

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioFacil(int d) {

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int comecoInstrcoe;
    
    int vidaPlayer = 3;
    int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int respc = 0;
    int repitir = 0;
    int volta0 = 0;
    int recomecar = 0;
    int indicePergunta = 0;

    String perguntas[] = perguntaFacil();
    if (d == 1) {

      switch (d) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("43");
              alternativas.add("38");//Resposta Correta
              alternativas.add("24");
              alternativas.add("32");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {// do While Pergunta 1
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[0]);

                Collections.shuffle(alternativas);

                int tamanhoMaiorLista = Math.max(sequencia.size(), alternativas.size());
                
                for (int i = 0; i < tamanhoMaiorLista; i++) {
                  String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                  String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                  System.out.println(elemento1 + " " + elemento2);

                  if(elemento2.equalsIgnoreCase("38")){
                    indicePergunta = i;
                  }
                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                  System.out.println("voce matou o inimigo");
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
              ArrayList<String> alternativas2 = new ArrayList<String>();
              ArrayList<String> sequencia2 = new ArrayList<String>();
              alternativas2.add("40 figurinhas");
              alternativas2.add("44 figurinhas");//Resposta Correta
              alternativas2.add("52 figurinhas");
              alternativas2.add("60 figurinhas");

              sequencia2.add("(A)");
              sequencia2.add("(B)");
              sequencia2.add("(C)");
              sequencia2.add("(D)");

              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[1]);

              Collections.shuffle(alternativas2);

              int tamanhoMaiorLista1 = Math.max(sequencia2.size(), alternativas2.size());

              for (int i = 0; i < tamanhoMaiorLista1; i++) {
                String elemento1 = (i < sequencia2.size()) ? sequencia2.get(i) : "";
                String elemento2 = (i < alternativas2.size()) ? alternativas2.get(i) : "";

                System.out.println(elemento1 + " " + elemento2);
                if(elemento2.equalsIgnoreCase("44 figurinhas")){
                  indicePergunta = i;
                }

              }

              String respostas = ler.next();

              if (sequencia2.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                System.out.println("voce matou o inimigo");
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

              }//Fim do While pergunta 2

            } while (repitir == 1);// IF pergunta 2

            do {// do While Pergunta 3
              // Historia

              ArrayList<String> alternativas3 = new ArrayList<String>();
              ArrayList<String> sequencia3 = new ArrayList<String>();
              alternativas3.add("60");
              alternativas3.add("51");//Resposta Correta
              alternativas3.add("48");
              alternativas3.add("42");

              sequencia3.add("(A)");
              sequencia3.add("(B)");
              sequencia3.add("(C)");
              sequencia3.add("(D)");

              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[2]);

              Collections.shuffle(alternativas3);

              int tamanhoMaiorLista = Math.max(sequencia3.size(), alternativas3.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia3.size()) ? sequencia3.get(i) : "";
                String elemento2 = (i < alternativas3.size()) ? alternativas3.get(i) : "";

                System.out.println(elemento1 + " " + elemento2);
                if(elemento2.equalsIgnoreCase("51")){
                  indicePergunta = i;
                }
              }

              String respostas = ler.next();

              if (sequencia3.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                System.out.println("voce matou o inimigo");
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

              ArrayList<String> alternativas4 = new ArrayList<String>();
              ArrayList<String> sequencia4 = new ArrayList<String>();
              alternativas4.add("50");
              alternativas4.add("45");
              alternativas4.add("40");
              alternativas4.add("30");//Resposta Correta

              sequencia4.add("(A)");
              sequencia4.add("(B)");
              sequencia4.add("(C)");
              sequencia4.add("(D)");

              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[3]);

              Collections.shuffle(alternativas4);

              int tamanhoMaiorLista = Math.max(sequencia4.size(), alternativas4.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia4.size()) ? sequencia4.get(i) : "";
                String elemento2 = (i < alternativas4.size()) ? alternativas4.get(i) : "";

                System.out.println(elemento1 + " " + elemento2);
                if(elemento2.equalsIgnoreCase("30")){
                  indicePergunta = i;
                }

              }
              String respostas = ler.next();

              if (sequencia4.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                System.out.println("voce matou o inimigo");
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

              ArrayList<String> alternativas5 = new ArrayList<String>();
              ArrayList<String> sequencia5 = new ArrayList<String>();
              alternativas5.add("25");
              alternativas5.add("30");
              alternativas5.add("35");
              alternativas5.add("20");// Resposta Correta

              sequencia5.add("(A)");
              sequencia5.add("(B)");
              sequencia5.add("(C)");
              sequencia5.add("(D)");

              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[4]);

              Collections.shuffle(alternativas5);

              int tamanhoMaiorLista = Math.max(sequencia5.size(), alternativas5.size());

              for (int i = 0; i < tamanhoMaiorLista; i++) {
                String elemento1 = (i < sequencia5.size()) ? sequencia5.get(i) : "";
                String elemento2 = (i < alternativas5.size()) ? alternativas5.get(i) : "";

                System.out.println(elemento1 + " " + elemento2);
                if(elemento2.equalsIgnoreCase("20")){
                  indicePergunta = i;
                }

              }
              String respostas = ler.next();

              if (sequencia5.get(indicePergunta).equalsIgnoreCase("("+respostas+")")){
                System.out.println("voce matou o inimigo");
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


            do {// do While Pergunta 6
              // Historia


              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[5]);

    
              int respostas = ler.nextInt();

              if (respostas == 2 ){
                System.out.println("voce matou o inimigo");
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

            } while (repitir == 1);// Fim do While pergunta 6


            do {// do While Pergunta 7
              // Historia


              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[6]);

    
              int respostas = ler.nextInt();

              if (respostas == 10 ){
                System.out.println("voce matou o inimigo");
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

            } while (repitir == 1);// Fim do While pergunta 7

            do {// do While Pergunta 8
              // Historia


              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[7]);

    
              int respostas = ler.nextInt();

              if (respostas == 5 ){
                System.out.println("voce matou o inimigo");
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

            } while (repitir == 1);// Fim do While pergunta 8

            do {// do While Pergunta 9
              // Historia


              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[8]);

    
              int respostas = ler.nextInt();

              if (respostas == -3){
                System.out.println("voce matou o inimigo");
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

            } while (repitir == 1);// Fim do While pergunta 9

            do {// do While Pergunta 10
              // Historia


              // Fim Historia
              System.out.println(player + " um inimigo apareceu");// caixa de dialogo
              System.out.println(" ");
              System.out.println("Responda a seguinte pergunta:");
              System.out.println("");
              System.out.println(perguntas[9]);

    
              int respostas = ler.nextInt();

              if (respostas == 9 ){
                System.out.println("voce matou o inimigo");
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

            } while (repitir == 1);// Fim do While pergunta 10

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();
  }

  static String[] perguntaFacil(){
    String[] perguntas = 

    {// Perguntas de Equação 1° Grau Modelagem
     "6 unidades somadas ao dobro de um número é igual a 82. Qual é esse número?",
     "A quantidade de figurinhas que Renata tem mais 8 é igual ao dobro da quantidade de figurinhas que Rogério tem menos 12. Se Rogério possui 20 figurinhas, então o número de figurinhas que Renata possui é igual a:",
     "Um número possui 14 unidades a mais que o outro. Sabendo que a soma desses números é igual a 88, então o valor do maior deles é:",
     "Em um estacionamento há carros e motos, totalizando 120 veículos. Se o número de carros é igual ao triplo do número de motos, o total de motos nesse estacionamento é:",
     "Um retângulo com 100 cm de perímetro apresenta a medida do lado maior com 10 cm a mais que o lado menor. Quanto mede o lado menor dessa figura geométrica?",
     //Fim Perguntas de Equação 1° Grau modelagem
     //Equação 2° Grau Completa
     "Qual é a menor raiz da equação x² -7x + 10 = 0:",
     "Qual é a maior raiz da equação x² -12x + 20 = 0:",
     "Qual é a maior raiz da equação x² -8x + 15 = 0:",
     // Fim Equação do 2° Grau Completa
     // Equação do 2° Grau incompleta
     "Qual é a menor raiz da Equação x² - 9 = 0",
     "Qual é a maior raiz da Equação x² - 9x = 0"
    };
    return perguntas;
  }
  
  static String[] perguntaMediana(){
    String[] perg = 
    {// Perg Equação 1° Grau Modelagem
      "Reinaldo e Gabi venderam caixas de cookies para a campanha de arrecadação de fundos para seu time de futebol. Reinaldo vendeu b caixas de cookies e Gabi vendeu 35 caixas de cookies. Juntos, eles venderam um total de 69 caixas de cookies: Selecione a equação que corresponde a esta situação:",
      "Raul e Kárita têm, juntos, R$ 210.000,00 para fazer um investimento. A quantia que Raul possui é três quartos da quantia que Kárita possui. Qual é o valor a ser investido por Kárita?",
      "A soma de um número com o seu sucessor e o seu antecessor é igual a 222. Esse número é igual a:",
      // Fim Perg Equação 1° Grau Modelagem
      //Equação do 2° Grau Completa
      "Qual é a menor raiz da equação 2° grau - x² + 9x - 20 = 0:",
      "Qual é a maior raiz da equação 2° grau 2x² + x - 3 = 0:",
      "Qual é a maior e menor raiz da equação 2° grau - 3x² + 18x - 15 = 0:",
      "Qual é a maior e menor raiz da equação 2° grau - 2x² + 3x + 5 = 0:",
      "Qual é a menor e maior raiz da equação 2° grau 4x² + x - 3 = 0:",
      //Fim Equação do 2° Grau Completa
      //Equação do 2° Grau incompleta
      "Qual é a menor e maior raiz da equação 2° grau incompleta 5x² - x = 0",
      "Qual é a menor e maior raiz da equação 2° grau incompleta 2x² - 2 = 0"
      //Fim Equação do 2° Grau Incompleta

    };

    return perg;
  }

  static String[] perguntaDificil(){
    String perg[] =
    {

    };
    return perg;
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
