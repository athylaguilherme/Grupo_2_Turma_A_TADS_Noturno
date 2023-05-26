
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
    ler.close();
  }

  static void inincioDificil(int b) {
    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    // int comecoInstrcoe;
    int vidaPlayer = 3;
    int controleP = 1;
    int indicePergunta = 0;
    // int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int repitir = 0;
    int recomecar = 0;

    String perguntas[] = perguntaDificil();

    if (b == 1) {

      switch (b) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            controleP = 1;
            do {// do While Pergunta 1
              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("R$14,00");
              alternativas.add("R$17,00");
              alternativas.add("R$22,00");
              alternativas.add("R$32,00"); // Resposta Correta

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

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

                if (elemento2.equalsIgnoreCase("R$32,00")) {
                  indicePergunta = i;
                }

              }

              String respostas = ler.next();

              if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
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

            if (controleP == 2) {// if Pergunta 2
              // Historia
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("20/33");
              alternativas.add("33/20");
              alternativas.add("15/2"); // Resposta Correta
              alternativas.add("1");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {// do While Pergunta 2
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

                  if (elemento2.equalsIgnoreCase("15/2")) {
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
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

              } while (repitir == 1);// Fim do While Pergunta 2

            }
            ;// Fim if pergunta 2

            if (controleP == 3) {// if Pergunta 3
              // Historia

              // Fim Historia
              do {// do While Pergunta 3
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[2]);
                System.out.println("Digite a Menor Raiz");
                String respostas = ler.next();
                System.out.println("Digite a Maior Raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-3/2") || respostas.equalsIgnoreCase("-1,5")) {
                  if (respostas2.equalsIgnoreCase("5")) {
                    System.out.println("Você matou o inimigo");
                    controleP++;
                    vidaInimigo--;
                    repitir = 0;
                    break;
                  } else {
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
              } while (repitir == 1);// fim do While Pergunta 3

            } // Fim if pergunta 3

            if (controleP == 4) {// if Pergunta 4
              // Historia

              // Fim Historia
              do {// do While Pergunta 4
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[3]);
                System.out.println("Digite a Menor Raiz");
                String respostas = ler.next();
                System.out.println("Digite a Maior Raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-1/2") || respostas.equalsIgnoreCase("-0,5")) {
                  if (respostas2.equalsIgnoreCase("1/3") || respostas2.equalsIgnoreCase("0,33")) {
                    System.out.println("Você matou o inimigo");
                    controleP++;
                    vidaInimigo--;
                    repitir = 0;
                    break;
                  } else {
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
              } while (repitir == 1);// fim do While Pergunta 4

            } // Fim if pergunta 4

            if (controleP == 5) {// if Pergunta 5
              // Historia

              // Fim Historia
              do {// do While Pergunta 5
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[4]);
                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("2/5") || respostas.equalsIgnoreCase("0,4")) {
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
              } while (repitir == 1);// fim do While Pergunta 5

            } // Fim if pergunta 5

            if (controleP == 6) {// if Pergunta 6
              // Historia

              // Fim Historia
              do {// do While Pergunta 6
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[5]);
                System.out.println("Digite a menor raiz");
                String respostas = ler.next();
                System.out.println("Digite a maior raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-5") && respostas2.equalsIgnoreCase("5")) {
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
              } while (repitir == 1);// fim do While Pergunta 6

            } // Fim if pergunta 6

            if (controleP == 7) {// if Pergunta 7
              // Historia

              // Fim Historia
              do {// do While Pergunta 7
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[6]);
                System.out.println("Digite a menor raiz");
                String respostas = ler.next();
                System.out.println("Digite a maior raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-10") && respostas2.equalsIgnoreCase("10")) {
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
              } while (repitir == 1);// fim do While Pergunta 7

            } // Fim if pergunta 7

            if (controleP == 8) {// if Pergunta 8
              // Historia

              // Fim Historia
              do {// do While Pergunta 8
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[7]);
                System.out.println("Digite a menor raiz");
                String respostas = ler.next();
                System.out.println("Digite a maior raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-10") || respostas2.equalsIgnoreCase("0")) {
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
              } while (repitir == 1);// fim do While Pergunta 8

            } // Fim if pergunta 8

            if (controleP == 9) {// if Pergunta 9
              // Historia

              // Fim Historia
              do {// do While Pergunta 9
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[8]);
                System.out.println("Digite a menor raiz");
                String respostas = ler.next();
                System.out.println("Digite a maior raiz");
                String respostas2 = ler.next();

                if (respostas.equalsIgnoreCase("-7") || respostas2.equalsIgnoreCase("0")) {
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
              } while (repitir == 1);// fim do While Pergunta 9

            } // Fim if pergunta 9

            if (controleP == 10) {// if Pergunta 10
              // Historia

              // Fim Historia
              do {// do While Pergunta 10
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[9]);
                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("0")) {
                  System.out.println("Você matou o inimigo");
                  recomecar = 0;
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
              } while (repitir == 1);// fim do While Pergunta 10

            } // Fim if pergunta 10

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioMedio(int c) {
    System.out.println("2");

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    // int comecoInstrcoe;
    int vidaPlayer = 3;
    // int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int repitir = 0;
    int recomecar = 0;
    int controleP = 1;
    int indicePergunta = 0;

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

                if (elemento2.equalsIgnoreCase("b + 35 = 69")) {
                  indicePergunta = i;
                }

              }

              String respostas = ler.next();

              if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
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

            if (controleP == 2) {// if Pergunta 2
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
              do {// do While Pergunta 2
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

                  if (elemento2.equalsIgnoreCase("R$ 120.000,00")) {
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
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

              } while (repitir == 1);// Fim do While Pergunta 2

            }
            ;// Fim if pergunta 2

            if (controleP == 3) {// if Pergunta 3
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
              do {// do While Pergunta 3
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

                  if (elemento2.equalsIgnoreCase("74")) {
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
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
              } while (repitir == 1);// Fim do While Pergunta 3

            }
            ;// Fim do if pergunta 3

            if (controleP == 4) {// if Pergunta 4
              // Historia

              // Fim Historia
              do {// do While Pergunta 4
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
              } while (repitir == 1);// Fim do While Pergunta 4

            } // Fim do if pergunta 4

            if (controleP == 5) {// if Pergunta 5
              // Historia

              // Fim Historia
              do {// do While Pergunta 5
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
              } while (repitir == 1);// fim do While Pergunta 5

            } // Fim if pergunta 5

            if (controleP == 6) {// if Pergunta 6
              // Historia

              // Fim Historia
              do {// do While Pergunta 6
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
              } while (repitir == 1);// fim do While Pergunta 6

            } // Fim if pergunta 6

            if (controleP == 7) {// if Pergunta 7
              // Historia

              // Fim Historia
              do {// do While Pergunta 7
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
              } while (repitir == 1);// fim do While Pergunta 7

            } // Fim if pergunta 7

            if (controleP == 8) {// if Pergunta 8
              // Historia

              // Fim Historia
              do {// do While Pergunta 8
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[7]);
                System.out.println("Digite a menor Raiz");
                String respostas = ler.next();
                System.out.println("Digite a maior Raiz");
                String resposta2 = ler.next();

                if (respostas.equalsIgnoreCase("-1")) {
                  if (resposta2.equalsIgnoreCase("3/4") || resposta2.equalsIgnoreCase("0,75")) {
                    System.out.println("Você matou o inimigo");
                    controleP++;
                    vidaInimigo--;
                    repitir = 0;
                    break;
                  } else {
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
              } while (repitir == 1);// fim do While Pergunta 8

            } // Fim if pergunta 8

            if (controleP == 9) {// if Pergunta 9
              // Historia

              // Fim Historia
              do {// do While Pergunta 9
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
                  if (resposta2.equalsIgnoreCase("1/5") || resposta2.equalsIgnoreCase("0,2")) {
                    System.out.println("Você matou o inimigo");
                    controleP++;
                    vidaInimigo--;
                    repitir = 0;
                    break;
                  } else {
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
              } while (repitir == 1);// fim do While Pergunta 9

            } // Fim if pergunta 9

            if (controleP == 10) {// if Pergunta 10
              // Historia

              // Fim Historia
              do {// do While Pergunta 10
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
                  recomecar = 0;
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
              } while (repitir == 1);// fim do While Pergunta 10

            } // Fim if pergunta 10

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioFacil(int d) {

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    // int comecoInstrcoe;

    int vidaPlayer = 3;
    // int pontos; // se tiver pontos
    int vidaInimigo = 5;
    int repitir = 0;
    int recomecar = 0;
    int indicePergunta = 0;
    int controleP = 1;

    String perguntas[] = perguntaFacil();
    if (d == 1) {

      switch (d) {

        case 1:

          do {// Inicio loop recomeçar
            vidaPlayer = 3;
            controleP = 1;
            // Historia
            do {// do While Pergunta 1
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("43");
              alternativas.add("38");// Resposta Correta
              alternativas.add("24");
              alternativas.add("32");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

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

                if (elemento2.equalsIgnoreCase("38")) {
                  indicePergunta = i;
                }
              }

              String respostas = ler.next();

              if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
                System.out.println("voce matou o inimigo");
                vidaInimigo--;
                controleP++;
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

            if (controleP == 2) {// if Pergunta 2
              // Historia
              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("40 figurinhas");
              alternativas.add("44 figurinhas");// Resposta Correta
              alternativas.add("52 figurinhas");
              alternativas.add("60 figurinhas");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[1]);

                Collections.shuffle(alternativas);

                int tamanhoMaiorLista1 = Math.max(sequencia.size(), alternativas.size());

                for (int i = 0; i < tamanhoMaiorLista1; i++) {
                  String elemento1 = (i < sequencia.size()) ? sequencia.get(i) : "";
                  String elemento2 = (i < alternativas.size()) ? alternativas.get(i) : "";

                  System.out.println(elemento1 + " " + elemento2);
                  if (elemento2.equalsIgnoreCase("44 figurinhas")) {
                    indicePergunta = i;
                  }

                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // fim IF pergunta 2

            if (controleP == 3) { // if Pergunta 3

              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("60");
              alternativas.add("51");// Resposta Correta
              alternativas.add("48");
              alternativas.add("42");

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {// do While Pergunta 3
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
                  if (elemento2.equalsIgnoreCase("51")) {
                    indicePergunta = i;
                  }
                }

                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // Fim if pergunta 3

            if (controleP == 4) { // if Pergunta 4

              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("50");
              alternativas.add("45");
              alternativas.add("40");
              alternativas.add("30");// Resposta Correta

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {// do While Pergunta 4
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

                  System.out.println(elemento1 + " " + elemento2);
                  if (elemento2.equalsIgnoreCase("30")) {
                    indicePergunta = i;
                  }

                }
                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // Fim If pergunta 4

            if (controleP == 5) { // if Pergunta 5

              // Historia

              ArrayList<String> alternativas = new ArrayList<String>();
              ArrayList<String> sequencia = new ArrayList<String>();
              alternativas.add("25");
              alternativas.add("30");
              alternativas.add("35");
              alternativas.add("20");// Resposta Correta

              sequencia.add("(A)");
              sequencia.add("(B)");
              sequencia.add("(C)");
              sequencia.add("(D)");

              // Fim Historia
              do {// do While Pergunta 5
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

                  System.out.println(elemento1 + " " + elemento2);
                  if (elemento2.equalsIgnoreCase("20")) {
                    indicePergunta = i;
                  }

                }
                String respostas = ler.next();

                if (sequencia.get(indicePergunta).equalsIgnoreCase("(" + respostas + ")")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // Fim if pergunta 5

            if (controleP == 6) { // if Pergunta 6

              // Historia

              // Fim Historia
              do {// do While Pergunta 6
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[5]);

                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("2")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // Fim if pergunta 6

            if (controleP == 7) { // if Pergunta 7

              // Historia

              // Fim Historia
              do {// do While Pergunta 7
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[6]);

                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("10")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            } // Fim if Pergunta 7

            if (controleP == 8) { // if Pergunta 8

              // Historia

              // Fim Historia
              do {// do While Pergunta 8
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[7]);
                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("5")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            }

            if (controleP == 9) { // if Pergunta 9

              // Historia

              // Fim Historia
              do {// do While Pergunta 9
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[8]);

                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("-3")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
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
            }

            if (controleP == 10) { // if Pergunta 10

              // Historia

              // Fim Historia
              do {// do While Pergunta 10
                System.out.println(player + " um inimigo apareceu");// caixa de dialogo
                System.out.println(" ");
                System.out.println("Responda a seguinte pergunta:");
                System.out.println("");
                System.out.println(perguntas[9]);

                String respostas = ler.next();

                if (respostas.equalsIgnoreCase("9")) {
                  System.out.println("voce matou o inimigo");
                  vidaInimigo--;
                  controleP++;
                  repitir = 0;
                  recomecar = 0;
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
            } // Fim if pergunta 10

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();
  }

  static String[] perguntaFacil() {
    String[] perguntas =

        { // Perguntas de Equação 1° Grau Modelagem
            "6 unidades somadas ao dobro de um número é igual a 82. Qual é esse número?",
            "A quantidade de figurinhas que Renata tem mais 8 é igual ao dobro da quantidade de figurinhas que Rogério tem menos 12. Se Rogério possui 20 figurinhas, então o número de figurinhas que Renata possui é igual a:",
            "Um número possui 14 unidades a mais que o outro. Sabendo que a soma desses números é igual a 88, então o valor do maior deles é:",
            "Em um estacionamento há carros e motos, totalizando 120 veículos. Se o número de carros é igual ao triplo do número de motos, o total de motos nesse estacionamento é:",
            "Um retângulo com 100 cm de perímetro apresenta a medida do lado maior com 10 cm a mais que o lado menor. Quanto mede o lado menor dessa figura geométrica?",
            // Fim Perguntas de Equação 1° Grau modelagem
            // Equação 2° Grau Completa
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

  static String[] perguntaMediana() {
    String[] perg = { // Perg Equação 1° Grau Modelagem
        "Reinaldo e Gabi venderam caixas de cookies para a campanha de arrecadação de fundos para seu time de futebol. Reinaldo vendeu b caixas de cookies e Gabi vendeu 35 caixas de cookies. Juntos, eles venderam um total de 69 caixas de cookies: Selecione a equação que corresponde a esta situação:",
        "Raul e Kárita têm, juntos, R$ 210.000,00 para fazer um investimento. A quantia que Raul possui é três quartos da quantia que Kárita possui. Qual é o valor a ser investido por Kárita?",
        "A soma de um número com o seu sucessor e o seu antecessor é igual a 222. Esse número é igual a:",
        // Fim Perg Equação 1° Grau Modelagem
        // Equação do 2° Grau Completa
        "Qual é a menor raiz da equação 2° grau - x² + 9x - 20 = 0:",
        "Qual é a maior raiz da equação 2° grau 2x² + x - 3 = 0:",
        "Qual é a maior e menor raiz da equação 2° grau - 3x² + 18x - 15 = 0:",
        "Qual é a maior e menor raiz da equação 2° grau - 2x² + 3x + 5 = 0:",
        "Qual é a menor e maior raiz da equação 2° grau 4x² + x - 3 = 0:",
        // Fim Equação do 2° Grau Completa
        // Equação do 2° Grau incompleta
        "Qual é a menor e maior raiz da equação 2° grau incompleta 5x² - x = 0",
        "Qual é a menor e maior raiz da equação 2° grau incompleta 2x² - 2 = 0"
        // Fim Equação do 2° Grau Incompleta

    };

    return perg;
  }

  static String[] perguntaDificil() {
    String perg[] = { // Equação 1° Modelagem
        "Um grupo de 50 pessoas fez um orçamento inicial para organizar uma festa, que seria dividido entre elas em cotas iguais. Verificou-se ao final que, para arcar com todas as despesas, faltavam R$ 510,00, e que 5 novas pessoas haviam ingressado no grupo. No acerto foi decidido que a despesa total seria dividida em partes iguais pelas 55 pessoas. Quem não havia ainda contribuído pagaria a sua parte, e cada uma das 50 pessoas do grupo inicial deveria contribuir com mais R$ 7,00. De acordo com essas informações, qual foi o valor da cota calculada no acerto final para cada uma das 55 pessoas?",
        "3/5 de um número somados a 1/2 é igual a 2/3 desse mesmo número. Indique a opção que apresenta esse número.",
        "Qual é a maior e menor raiz da equação do 2° grau 2x² - 7x = 15:",
        "Qual é a maior e menor raiz da equação 2° grau 6x² + x - 1 = 0:",
        "Qual é o valor de x da seguinte equação do 2°Grau 25x² = 20x - 4:",
        "Qual é maior e a menor raiz da equação do 2° Grau 5x² - 125 = 0: ",
        "Qual é maior e a menor raiz da equação do 2° Grau 10x² - 1000 = 0 :",
        "Qual é maior e a menor raiz da equação do 2° Grau x² + 10x = 0:",
        "Qual é maior e a menor raiz da equação do 2° Grau 2x² + 14x = 0:",
        "Qual é o valor de X na seguinte equação incompleta 5x² = 0"
        // Fim Equação 1° Modelagem

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
    ler.close();
  }

}
