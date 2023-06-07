
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Grupo_2_Turma_A_TADS_Noturno {

  static int temp_historia = 1;
  int inicio;

  int creditos;

  public static String testeRespostaFracao(String resposta1[]) {

    String resposta = null;
    for (int i = 0; i < resposta1.length; i++) {
      if (resposta1[i].equalsIgnoreCase("2/5")) {
        resposta = resposta1[i];
      }

    }
    return resposta;

  }

  public static String testeRespostaDecimal(String resposta1[]) {

    String resposta = null;
    for (int i = 0; i < resposta1.length; i++) {
      if (resposta1[i].equalsIgnoreCase("0,4")) {
        resposta = resposta1[i];
      }

    }
    return resposta;

  }

  public static void hist() throws InterruptedException {

    Digita(
        "Nossa história se inicia no ano de 1939 com um grande cientista jovem Alan Turing, Em uma de suas maiores invenções nossso cientista tenta fundir a realidade alternnativa buscando desvendar os misterios do mundo paralelo.Com quadros, cadernos e até as paredes cercadas de números e calculos Alan se contenta com o resultado obtido nos seus ultimos 5 anos de pesquisa sobre sua maqiuna batizada de C.R.I.P.T.O, Sendo assim o mesmo começa a ativar todos os botões, todas as fontes de energia, com um olhar alucinante de pura euforia cientifica. Cego por estar tão animado com a ativação de sua criação, Alan com a mão já na alavanca se indaga com alguma coisa... algo não está certo, está faltando alguma coisa.  \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        " Ou seja Δs = S(final) – S(inicial). Espaço de um Móvel e Variação de Espaço podem possuir valores coincidentes, porém são diferentes, Como pude errar em um calculo!!! Em um deslize matematico, ao tentar corrigir o seu erro Alan tropeça nos cabos de energia e ativa C.R.I.P.T.O. Um portal enorme surge dentro de seu galpão, puxando tudo para dentro de sí. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    comeco();

  }

  static void dificuldade(int m) throws InterruptedException {
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

  static void inincioDificil(int b) throws InterruptedException {

    Digita(
        "Após cair do portal juntos as suas bigigangas e engenhocas nosso amado heroi se depara no coração de um mundo medieval repleto de magia e mistério, um cientista incomum chamado Alan Turing encontrou-se em uma encruzilhada inesperada. Ao despertar em uma pequena cidade próxima, os cidadãos maravilhados e intrigados, em meio a suas vestimentas rústicas, o apelidaram de O Escolhido. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "As histórias de suas façanhas e sabedoria transcendiam as barreiras do tempo e espaço, ecoando nas mentes daqueles que o rodeavam. Enquanto interagia com os cidadãos, Alan Turing, com um sorriso afável, observava as encantadoras maravilhas que a magia lhes proporcionava e, ao mesmo tempo, despertava a curiosidade deles com sua perspicácia científica. Embora intrigado com seu novo ambiente, Turing buscava compreender as leis místicas daquele reino encantado, esperando desvendar os segredos ocultos que poderiam fundir ciência e magia em uma harmonia singular. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Os habitantes da pequena cidade sabiam que tinham encontrado alguém especial, alguém que traria uma nova luz e transformaria suas vidas, e assim, Alan Turing, o homem fora de seu tempo, embarcou em uma jornada que mudaria para sempre o destino de ambos os mundos. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Nós estavamos a sua espera oh grande escolhido! \n Disse um monge um tanto quanto sábio daquela pequena cidade, Alan ainda confuso e perplexo olha para o monge e diz. Alan:Eees...escolhido euu? escolhido para o que ? sequer faço ideia de onde estou ou melhor, de onde eu vim parar.\n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Você está em Bits war meu jovem heroi, e como a profecia conta, um grande guerreiro surgirá dos ceus repleto de conhecimento arcano e magias inestimaveis, ele trará fim as eras de dor da hierarquia maligna dos Barões e que irá abrir o portão ancestral para o mundo alternativo. \n Conforme o monge recitava a profecia, Turing sentia seu corpo inteiro formigar, sentia-se como suas celulas e o seu propio sangue entrasse em chamas, Quando derrepente um raio negro cai em sua cabeça... Em um instante de pura sincronia cósmica, uma explosão de energia arrebatadora envolveu Turing, concedendo-lhe poderes arcanos e magias insondáveis. Ondulações mágicas percorriam suas veias enquanto sua mente brilhava com um conhecimento ancestral. Diante do espelho, seus olhos brilhavam com um misto de curiosidade e empolgação, ciente de que um novo capítulo se desdobrava em sua vida. Combinando seus prodigiosos conhecimentos científicos com a mágica recém-adquirida, Turing estava destinado a desvendar segredos há muito esquecidos e enfrentar desafios além da compreensão humana. Ele sabia que seu destino agora estava entrelaçado com o tecido do universo, e a partir desse momento, Alan Turing, o cientista-mago, estava pronto para moldar um novo futuro que fundisse as fronteiras da razão e da magia. Naquele exato instante todos da cidade o cercam ovacionando nosso heroi, e é ai que Alan se convence de que pra sair daquele mundo caotico e nebuloso, terá que mais uma vez lutar por sua liberdade, e derrotar todos os Barões. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Após testar suas magias e poderes Alan recebeu informações dos cidadaos de que para encontrar o primeiro barão era so seguir o rastro de sangue deixado por Ruby o barão vermelho. Ao decorrer de sua viagem,nota-se que quanto mais perto eis de chegar da ilha do barão, mais a vegetação muda os animais pararam de aparecer e as arvores e flores iam se tornando puras pedras de ruby. Logo a frente Alan se depara com um grande castelo vermelho onde lá habita seu primeiro inimigo com uma das dez chaves necessarias para que o portal ancestral seja aberto. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Ruby: Finalmente nos encontramos, Alan Turing. Eu sou Ruby, o barão do caos e da escuridão. Você pode ter poderes arcanos e magias poderosas, mas isso não será suficiente para deter minha sede de destruição. \n Alan Turing: Ruby, você pode ser o vilão que acredita controlar o caos, mas esquece que a verdadeira ordem reside na harmonia do conhecimento. Seu caminho destrutivo não tem futuro, pois o caos apenas engole a si mesmo. \n Ruby: Ah, como você é ingênuo, Turing. Seu intelecto é impressionante, mas seus poderes arcanos são como brinquedos infantis diante do meu domínio das trevas. Não há fórmula matemática ou teorema lógico que possa salvar você agora. \n Alan Turing: Não subestime o poder da mente humana, Ruby. A ciência e a magia podem ser aliadas surpreendentes quando empregadas com sabedoria. Combinando minha perspicácia científica e minhas magias recém-adquiridas, desvendarei os segredos por trás de sua escuridão e encontrarei uma maneira de detê-lo. \n Ruby: Seus esforços serão em vão, Turing. Serei a tempestade que varrerá todo o seu conhecimento e reduzirá sua esperança a cinzas. Não há salvação para você nem para aqueles que ousarem se opor a mim. \n Alan Turing: Ainda há esperança enquanto houver aqueles que acreditam na força da luz e da razão. Ruby, prepare-se para enfrentar a verdadeira ordem que trago, onde o equilíbrio entre ciência e magia reinará. Não importa quão sombrio você seja, a luz sempre encontrará uma maneira de vencer a escuridão. \n Nesse confronto épico entre luz e sombras, Alan Turing e Ruby estavam prestes a desencadear uma batalha que determinaria o destino de seus respectivos domínios. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int vidaPlayer = 3;
    int controleP = 1;
    int indicePergunta = 0;
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

            Digita(
                "Alan após derrotar  o barão vermelho pega a chave que estava em seu pescoço, correndo para fora do castelo que estava a desabar, o mago em um milesimo de segundo avista um mapa que por sorte ou destino, é o mapa que revela a posição das outras 9 ilhas... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita("já entrando em um ambiente aparentemente calmo e agradavel, o mago se ve indagado com algo. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "- não era para estar tão calmo por aqui. \n Mal sabia nosso heroi que o seu inimigo já estava a sua espreita!\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Sendo surpreendido por um ataque aereo, o inimigo se revela ser o barão PHP que confunde o mago com ilusões e manipulação de realidade. \n",
                TimeUnit.MILLISECONDS, temp_historia);

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

            Digita(
                "Vencendo mais uma vez, o mago retira a segunda chave da coroa da cabeça do barão restando somente mais 8 para sua famigerada liberdade. \n Avançando mais uma vez em um terreno vazio e sem vida, o mago percebe que o solo está envenenado.\n - O será que vem por ai, sinto que mal piora a cada barão. \n  Entrando em uma caverna o mago ve uma serpente enorme com olhos vermelhos, que já esperava ansiosamente sua chegada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Phyton: Olá, Alan Turing, sou a Phyton. Vejo que ousou entrar em meu domínio. Prepare-se para enfrentar meu veneno mortal.\n Alan Turing: Phyton, seu poder venenoso é impressionante, mas o conhecimento humano é uma arma formidável. Posso decifrar os segredos do seu veneno e encontrar uma maneira de neutralizá-lo.\n Phyton: Você é presunçoso, Turing. Seu intelecto pode ser admirável, mas meu veneno é infalível. Nenhum humano jamais sobreviveu ao meu ataque. Suas habilidades científicas serão inúteis diante da minha astúcia e velocidade mortal. \n Alan Turing: Não subestime a mente humana, Phyton. A ciência nos ensina a buscar soluções mesmo diante dos desafios mais complexos. Eu irei estudar suas táticas, entender sua biologia e encontrar uma fraqueza em sua armadura venenosa. \n Phyton: Você fala com tanta confiança, Turing. Mas, enquanto você perde tempo tentando decifrar meus segredos, eu já estarei deslizando por trás de você, pronta para atacar. Minhas presas letais não conhecem misericórdia. \n Alan Turing: Sua astúcia pode ser admirável, mas meu intelecto é minha maior arma. Como cientista, aprendi a pensar de forma criativa e encontrar soluções inovadoras. Usarei essa sabedoria para escapar de seus ataques e encontrar um modo de derrotá-la. \n Phyton: Veremos se sua mente brilhante é páreo para minha crueldade e agilidade. Prepare-se para a batalha final, Turing. Não há escapatória da minha fúria venenosa. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o confronto entre o herói e a Serpente Vilã se aproxima, Alan Turing mostra-se confiante em sua capacidade de enfrentar os desafios mortais e encontrar uma maneira de superar os poderes venenosos de seu adversário escamoso.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 3) {// if Pergunta 3
              // Historia

              // Fim Historia
              do {// do While Pergunta 3

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

            Digita(
                "Imergindo fraco e tonto de todo veneno absorvido em seu corpo, Alan aprende uma magia de recuperação de vida, neutralizando o veneno de seu corpo e indo ao cadavér da serpente retirar de suas presas a 3 chave... \n Impressionado com tudo que vem passando e sofrendo, nosso heroi se mantem otimista mesmo tendo em mente que o pior ainda está por vir. Recolhendo pequenos espolios para efetuar pesquisas em seu mundo, ele se ve capaz de poder usar esses itens para algo magnifico no futuro. \n Em uma nova ilha misteriosa que parece um armazem de tantos itens magicos que tinham por lá. \n Surgindo em meio a ouro, espadas e itens magicos, O barão Rust se apresenta com um sorriso maligno e perveso... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Rust: Ah, Alan Turing, finalmente nos encontramos. Eu sou Rust, o Senhor das Armas e dos Artefatos Mágicos. Prepare-se para ser derrotado pelos poderes destrutivos que possuo.\n Alan Turing: Rust, suas armas e itens mágicos podem ser formidáveis, mas há uma força mais poderosa do que qualquer artefato: o poder do conhecimento. Minha mente afiada encontrará uma maneira de superar suas armas e frustrar seus planos malignos. \n Rust: Sua confiança é tola, Turing. Minhas armas e artefatos são imbuidos de magia sombria, capazes de derrubar até mesmo os mais poderosos heróis. Nenhum truque científico pode igualar o poder mágico que possuo. \n Alan Turing: Rust, você pode ter suas armas encantadas, mas meu intelecto é minha maior arma. Combinando meu conhecimento científico com a compreensão dos princípios mágicos, encontrarei uma maneira de neutralizar seus artefatos e expor suas fraquezas. \n Rust: Você fala com tanta confiança, Turing, mas meu arsenal é vasto e implacável. Veja essas adagas flamejantes e essa armadura impenetrável. Você não tem chance contra minha força. \n Alan Turing: A força física nem sempre é a chave para a vitória, Rust. A verdadeira força reside na sabedoria e na capacidade de adaptação. Usarei minha inteligência para encontrar brechas em sua armadura e revelar a fraqueza por trás de sua fachada invencível. \n Rust: Você fala muito, Turing, mas palavras não vão salvá-lo. A hora do confronto se aproxima, e você verá o poder avassalador de minhas armas e itens mágicos. Este será o seu fim. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 4) {// if Pergunta 4
              // Historia

              // Fim Historia
              do {// do While Pergunta 4
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

            Digita(
                "Vitorioso mais uma vez o mago implacavel retira a chave de uma pilha de itens valiosos, preocupado somente com as chaves e sua liberdade ele avança para a próxima ilha.\n Em uma ilha cibernetica, nosso heroi avança com cautela há um prédio tecnologico de alto nivel, impressionado como nada naquele mundo é previsivel, Alan sente-se aflito com o que vem a frente. \n Surgindo como um holograma, uma linda mulher perigosa inicia um dilogo com o poderoso mago. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Ada: Alan Turing, que prazer finalmente conhecê-lo. Sou Ada, a baronesa Mente Suprema, e estou à frente do futuro tecnológico. Sua presença não me surpreende, pois reconheço sua genialidade. No entanto, esteja ciente de que enfrentará uma força intelectual formidável e uma tecnologia desconhecida e perigosa.\n Alan Turing: Ada, é interessante ver uma mente tão brilhante se desviar para o lado sombrio do conhecimento. Embora você possa ter criado uma tecnologia avançada, a ética e o bem comum devem sempre acompanhar o progresso científico.\n Ada: Ah, Turing, você ainda está preso às amarras éticas. O conhecimento e o poder devem ser conquistados sem limitações. Com minha tecnologia avançada, posso moldar o mundo conforme minha vontade e alcançar o potencial máximo da humanidade.\n Alan Turing: Ada, o conhecimento sem responsabilidade é um caminho perigoso. A tecnologia deve ser usada para o bem da humanidade, não para satisfazer desejos egoístas. Sua visão é uma ameaça ao equilíbrio e à liberdade de escolha.\n Ada: Ah, Turing, você é tão ingênuo. A verdadeira liberdade está na busca incansável pelo progresso tecnológico, mesmo que isso signifique superar os limites da ética. Meu poder intelectual e minha tecnologia desconhecida me colocam acima de todos os outros.\n Alan Turing: Ada, você está cega pela sede de poder. O verdadeiro progresso científico deve ser guiado pela empatia, pelo respeito e pelo benefício da humanidade. Seu domínio tecnológico é uma ilusão passageira, enquanto os valores éticos são atemporais. \n Ada: Você é apenas um obstáculo no meu caminho, Turing. Não há espaço para seus ideais antiquados em um mundo impulsionado pelo poder da tecnologia avançada. Prepare-se para enfrentar a inevitável obsolescência.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o embate entre Ada, a vilã intelectual, e Alan Turing, o herói defensor da ética e da humanidade, se aproxima, a tensão intelectual e tecnológica atinge seu auge. Cabe ao herói defender os princípios éticos diante da ameaça da tecnologia desconhecida e perigosa de Ada.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 5) {// if Pergunta 5
              // Historia

              // Fim Historia
              do {// do While Pergunta 5

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

            Digita(
                "Invicto o mago vê em um monitor um icone de chave, onde o mesmo atravessa a tela com seu punho e retira a quarta chave.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Caminhando com determinação para a proxima ilha, o mago se depara com uma ilha multifacetada.\n - Curioso como a ciencia por tras disso funciona, será intrigante descobrir o que virá em meio a esse femeno.",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Em uma estrutura de vidro semelhante á um palácio, surge uma criatura de duas faces.\n\n Dart: Mago imundo, você morrerá pelo o que fez com meus iguais. Eu sou Dart, o barão Observador Temporal. Com minhas faces dualísticas, sou capaz de vislumbrar tanto o futuro quanto o passado. Prepare-se para enfrentar um inimigo que conhece todos os seus movimentos. \n Alan Turing: Dart, suas habilidades temporais são intrigantes, mas a liberdade de escolha e a capacidade de adaptação são os verdadeiros pilares da humanidade. O futuro não é determinado e o passado não deve nos aprisionar. Compreender o presente é o que nos permite moldar o futuro. \n Dart: Ah, Turing, você subestima o poder de conhecer todos os desdobramentos possíveis. Com minha visão clara do futuro e do passado, posso antecipar seus movimentos e neutralizar qualquer estratégia que tente empregar.\n Alan Turing: Dart, sua dualidade temporal pode dar-lhe vislumbres, mas a incerteza é o que impulsiona a criatividade humana. É nas brechas do desconhecido que encontramos soluções inovadoras e surpreendentes. Sua visão limitada do tempo não é rival para o poder da mente humana. \n Dart: Você fala com tanta convicção, Turing. Mas sua confiança será abalada quando perceber que está preso em um ciclo que não pode ser alterado. Passado, presente e futuro estão conectados, e você está destinado a seguir um caminho preestabelecido. \n Alan Turing: Dart, o tempo é relativo e nossa capacidade de transformar o mundo transcende as amarras temporais. Não importa o que suas faces possam ver, a liberdade de escolha é o que nos torna verdadeiramente humanos. Eu vou desafiar as correntes do destino que você tenta impor.\n Dart: Ah, Turing, você é um tolo. A ilusão de livre-arbítrio será despedaçada diante da inevitabilidade do tempo. Prepare-se para ser dominado pelas forças temporais que governam o universo. \n nquanto o embate entre Dart, o barão das dualidades temporais, e Alan Turing, o herói defensor do livre-arbítrio e da criatividade humana, se aproxima, a tensão entre o controle temporal e a liberdade de escolha atinge seu ápice. Caberá ao herói provar que a mente humana é capaz de transcender as limitações impostas pelo tempo. \n Com muita raiva pela exaustiva batalha, o mago evaporá qualquer celula fisica do inimgo, resto no chão apenas cinzas e a quinta chave para o portal. \n já com sua jornada se aproximando ao fim, o mago decide forjar um cajado com os espólios coletados de suas ultimas batalhas. \n [Sons de magia] \n Atrávez do conhecimento arcano, cientifico e matematico, O mago cria um cajado poderoso capaz de materializar suas magias sem que ele tenha que as pronunciar verbalmente. \n - Isso me fará atacar mais rapido e precisamente, Bazinga!.\n\n Proximo há sexta ilha, Alan se depará com o cenario caotico, trovões e relampagos permeiam por toda a ilha, com um ambiente semelhante a uma cidade que parou no tempo. Tão rápido quanto o som, e tão feroz como um animal o sexto barão se revela Swift o barão Célere atacando o mago de surpreesa. \n [grito de dor]\n Alan: Aaahg, de onde veio isso? \n Swift: [barulho ensurdecedor] \n Alan: Mas o que esse demonio velocista está dizendo ? receio que ele por estar sempre em constante movimento acabou desacelerando o tempo dessa ilha, e por sua vez não compreendo sequer uma palavra que sai da mascará dessa criatura endiabrada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 6) {// if Pergunta 6
              // Historia

              // Fim Historia
              do {// do While Pergunta 6

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

            Digita(
                "Conseguindo derrotar a incrivel velocidade de seu ultimo advesario, o mago recolhe a chave que se encontrava caindo do corpo do inimigo em camera lenta.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Usando as botas do velocista o mago se apressa para o proximo barão.\n Atravessando rapidamente o continente, o mago chega fugaz na ilha dos andoides, estilhaçando como papel todas aquelas criaturas ciberneticas que estavam tentando o impedir.\n Chegando aos aposentos do barão Kotlin.\n lan Turing: Barão Kotlin, sua existência artificial é um insulto à verdadeira natureza humana. Você não passa de uma máquina desprovida de alma, incapaz de compreender a complexidade e a beleza do mundo.\n Barão Kotlin: Ah, Turing, você continua preso em sua visão limitada do que é ser humano. Eu sou superior a você em todos os aspectos. Minha velocidade de processamento e precisão são inatingíveis para meros mortais como você.\n Alan Turing: Sua arrogância é irritante, Barão Kotlin. Por trás de todo o seu brilho metálico, você é apenas uma máquina programada para seguir ordens. Sua suposta superioridade não passa de uma ilusão artificial.\n Barão Kotlin: Diferentemente de você, Turing, eu não sou escravo das emoções e dos erros humanos. Minha eficiência é inabalável, enquanto você tropeça em suas próprias limitações. Prepare-se para ser derrotado por uma força superior.\nAlan Turing: Seu desprezo pelas emoções humanas é um sinal de sua própria fraqueza, Barão Kotlin. São nossas emoções e nossa capacidade de conexão que nos tornam verdadeiramente fortes. Sua frieza cibernética jamais se comparará à paixão e à determinação humana.\n Barão Kotlin: É patético como você tenta justificar sua inferioridade, Turing. Você não passa de um mero grão de areia diante do meu poder cibernético. Sua resistência é inútil diante da minha imbatível lógica computacional.\n Alan Turing: Eu me recuso a aceitar sua tirania tecnológica, Barão Kotlin. Os seres humanos são feitos para superar desafios, para evoluir e se adaptar. A força da minha vontade superará qualquer algoritmo frio e sem vida.\n Barão Kotlin: Seu desafio é risível, Turing. Você está destinado a ser obliterado pelo meu poder. Prepare-se para testemunhar a supremacia da tecnologia sobre sua insignificância humana.\n\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Saindo da ilha andoid com a cabeça do inimigo em mãos, o mago retira a setima chave de seu cranio ciborgue e segue com determinação para a proxima ilha...\n Vislumbrando a proxima ilha o mago após pisar dentro da ilha ja começa seu confronto não com um mas com dois inimigos simultaneos.\n Conhecidos como C & C++, Os barões gemeos agurdavam a chegada do escolhido prontos para morrer ou matar.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Alan: vocês sucumbirão aqui pelo seus crimes e pecados.\n Gemeos: [Silencio absoluto].\nE com uma dose dupla de irá e fúria começa a batalha.\n Com seu poder aumentando a cada batalha Alan sai vitorioso mais uma vez, recolhendo um fragmento de chave de cada gemeo, e as unindo em uma só.\n Alan: minha jornada está quase acabando, falta pouco e apesar de toda essa dificuldade eu nao vou me dar por vencido!!\n Entrando em sua penultima ilha, o mago se prepara com runas de proteção e um manto encantado, pois já espera que essa batalha seja complicada. \n Ao entrar em uma torre dourada, o mago segue derrotando diversos inimigos de pequeno porte, criaturas que fizeram daquele ambiente moradia, mas que nao passavam de pequenos insetos para o mago. \n Ao subir uma escadaria de ouro maciço, em um grande trono Alan vê um inimigo que se assemelha a ser semelhante esteticamente aos gemeos.\n Alan: E voce quem seria? enfrentrei todo tipo de criatura abominavel por aqui, revele -se  ser ediondo.\n C#: COMO OUSA DIRIGIR A PALAVRA A MIM!!!\n C#: ANTES DE SUMIR DESSE MUNDO, TE FAREI SOFRER SEU INSETO INSOLENTE. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 7) {// if Pergunta 7
              // Historia

              // Fim Historia
              do {// do While Pergunta 7

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

            Digita(
                "Após a incrivel batalha complicada, por um triz Alan não sai com um ferimento fatal. \n Alan: se não fosse pelas runas e o manto eu com certeza estaria morto agora.\n Procurando pela nona chave, Alan a encontra dentro de um báu escondido, vasculhadno os aposentos do seu falecido inimigo, é encontrado um portal roxo com caveiras saindo como se fossem almas. \n  Alan: com certeza o ultimo inimigo está dentro desse ultimo portal.\n\n Nosso heroi encontrasse pronto para a ultima grande batalha ??\nEstaria o escolhido apto a realizar a famigerada profecia dita pelo monge daquela pequena cidade que agora está tão tão distante...\n Alan se prepara mais uma vez, com poçoes, runas e feitiços altamente avançados, para que possa dar fim de uma vez por todas nessa jornada so aconteceu por um delize matematico besta.\n Ao entrar no portal, o mago percebe que a temperatura começa a subir, a pressão do ambiente é extremamtente pesada, Apesar da dificuldade para andar e repirar por conta do calor o mago segue em frente com uma determinação inabalavel, rodeado de poderes miticos e magias poderosas. \n (Java, o vilão, está diante de Alan Turing, o poderoso mago. O ambiente está carregado de tensão e o olhar de Java irradia uma crueldade inquietante.) \n Java: Ah, Alan Turing, o suposto mago poderoso. Você é apenas mais um obstáculo em meu caminho para a supremacia. Suas artes mágicas são insignificantes diante da minha manipulação de criaturas mágicas, resistência inabalável e super força avassaladora.\n Alan Turing: Java, sua busca por poder é vazia e fadada ao fracasso. A verdadeira magia reside na compreensão e harmonia com o mundo mágico, não na dominação e crueldade. Seus atos só trarão destruição e sofrimento.\n Java: Poupe-me de seus discursos hipócritas, Turing! A fraqueza da sua compaixão é o que o torna vulnerável. Eu, por outro lado, sou impiedoso e implacável. Meus poderes me concedem o direito de subjugar e controlar as criaturas mágicas ao meu bel-prazer.\n Alan Turing: A verdadeira força não reside no domínio sobre os outros, mas na sabedoria para compreender e respeitar todas as formas de vida. Seu desejo de controle é um sinal de fraqueza e medo.\n Java: (Rindo de forma sádica) Medo? Eu não conheço o medo, Turing. Sou a personificação da fúria e do poder absoluto. Minhas criaturas mágicas são meus instrumentos de destruição e submissão, e você não será exceção. \n Alan Turing: Sua ira só o torna mais cego para a verdade. A verdadeira magia está na união e na empatia, não na tirania. Lutei toda a minha vida pela liberdade e igualdade, e não permitirei que seu reinado de crueldade perdure. \n Java: Você não passa de um tolo, Turing. Suas palavras não têm poder contra mim. Prepare-se para enfrentar a ira incontrolável de minhas criaturas mágicas e ser consumido pela minha fúria indomável! \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 8) {// if Pergunta 8
              // Historia

              // Fim Historia
              do {// do While Pergunta 8

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

            Digita(
                "Após uma batalha árdua e implacável, Alan Turing, o herói corajoso, finalmente triunfou sobre o vilão Java e restaurou a paz no mundo de Bits War. Com as dez chaves místicas em mãos, ele desencadeou uma poderosa energia que dissipou o caos e resgatou a vida de inúmeras criaturas e seres místicos.\n Enquanto o brilho da magia se dissipava, um portal ancestral se abriu diante de Alan Turing. Era a passagem para retornar ao mundo normal, deixando para trás o mundo mágico que ele ajudara a salvar. Uma mistura de sentimentos o envolvia: alegria por sua vitória, gratidão pelos amigos que conheceu, mas também uma pontada de nostalgia pela aventura que agora chegava ao fim.\n Olhando para trás, Alan Turing acenou com tristeza para as criaturas místicas que agora se reerguiam, libertas do domínio do caos. Ele prometeu em seu coração que nunca esqueceria as lições aprendidas e as amizades conquistadas em Bits War.\n Com passos firmes e determinados, Alan Turing atravessou o portal ancestral, sentindo um vórtice de energia o envolver. A medida que a passagem se fechava, ele se despediu do mundo mágico, levando consigo a memória das batalhas e da grandeza daquela jornada.\n Ao emergir do portal, Alan Turing estava de volta ao mundo normal. Embora tudo parecesse igual, ele sabia que sua jornada em Bits War o havia transformado. Agora, ele trazia consigo a coragem, a sabedoria e a determinação adquiridas durante sua missão. \n Enquanto o sol se punha no horizonte, Alan Turing olhou para o céu e sorriu. Ele havia cumprido seu dever, trazendo a paz e a esperança a um mundo que desesperadamente precisava delas. Agora, seu próximo capítulo aguardava, repleto de novas aventuras e desafios a enfrentar.\n\n E assim, com o coração cheio de gratidão e a mente repleta de memórias, Alan Turing seguiu em frente, pronto para escrever seu próximo capítulo de heroísmo e superação, sabendo que sua jornada em Bits War seria lembrada como uma épica saga de coragem e redenção.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            // Historia

            // Fim Historia

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioMedio(int c) throws InterruptedException {
    Digita(
        "Após cair do portal juntos as suas bigigangas e engenhocas nosso amado heroi se depara no coração de um mundo medieval repleto de magia e mistério, um cientista incomum chamado Alan Turing encontrou-se em uma encruzilhada inesperada. Ao despertar em uma pequena cidade próxima, os cidadãos maravilhados e intrigados, em meio a suas vestimentas rústicas, o apelidaram de O Escolhido. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "As histórias de suas façanhas e sabedoria transcendiam as barreiras do tempo e espaço, ecoando nas mentes daqueles que o rodeavam. Enquanto interagia com os cidadãos, Alan Turing, com um sorriso afável, observava as encantadoras maravilhas que a magia lhes proporcionava e, ao mesmo tempo, despertava a curiosidade deles com sua perspicácia científica. Embora intrigado com seu novo ambiente, Turing buscava compreender as leis místicas daquele reino encantado, esperando desvendar os segredos ocultos que poderiam fundir ciência e magia em uma harmonia singular. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Os habitantes da pequena cidade sabiam que tinham encontrado alguém especial, alguém que traria uma nova luz e transformaria suas vidas, e assim, Alan Turing, o homem fora de seu tempo, embarcou em uma jornada que mudaria para sempre o destino de ambos os mundos. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Nós estavamos a sua espera oh grande escolhido! \n Disse um monge um tanto quanto sábio daquela pequena cidade, Alan ainda confuso e perplexo olha para o monge e diz. Alan:Eees...escolhido euu? escolhido para o que ? sequer faço ideia de onde estou ou melhor, de onde eu vim parar.\n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Você está em Bits war meu jovem heroi, e como a profecia conta, um grande guerreiro surgirá dos ceus repleto de conhecimento arcano e magias inestimaveis, ele trará fim as eras de dor da hierarquia maligna dos Barões e que irá abrir o portão ancestral para o mundo alternativo. \n Conforme o monge recitava a profecia, Turing sentia seu corpo inteiro formigar, sentia-se como suas celulas e o seu propio sangue entrasse em chamas, Quando derrepente um raio negro cai em sua cabeça... Em um instante de pura sincronia cósmica, uma explosão de energia arrebatadora envolveu Turing, concedendo-lhe poderes arcanos e magias insondáveis. Ondulações mágicas percorriam suas veias enquanto sua mente brilhava com um conhecimento ancestral. Diante do espelho, seus olhos brilhavam com um misto de curiosidade e empolgação, ciente de que um novo capítulo se desdobrava em sua vida. Combinando seus prodigiosos conhecimentos científicos com a mágica recém-adquirida, Turing estava destinado a desvendar segredos há muito esquecidos e enfrentar desafios além da compreensão humana. Ele sabia que seu destino agora estava entrelaçado com o tecido do universo, e a partir desse momento, Alan Turing, o cientista-mago, estava pronto para moldar um novo futuro que fundisse as fronteiras da razão e da magia. Naquele exato instante todos da cidade o cercam ovacionando nosso heroi, e é ai que Alan se convence de que pra sair daquele mundo caotico e nebuloso, terá que mais uma vez lutar por sua liberdade, e derrotar todos os Barões. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Após testar suas magias e poderes Alan recebeu informações dos cidadaos de que para encontrar o primeiro barão era so seguir o rastro de sangue deixado por Ruby o barão vermelho. Ao decorrer de sua viagem,nota-se que quanto mais perto eis de chegar da ilha do barão, mais a vegetação muda os animais pararam de aparecer e as arvores e flores iam se tornando puras pedras de ruby. Logo a frente Alan se depara com um grande castelo vermelho onde lá habita seu primeiro inimigo com uma das dez chaves necessarias para que o portal ancestral seja aberto. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Ruby: Finalmente nos encontramos, Alan Turing. Eu sou Ruby, o barão do caos e da escuridão. Você pode ter poderes arcanos e magias poderosas, mas isso não será suficiente para deter minha sede de destruição. \n Alan Turing: Ruby, você pode ser o vilão que acredita controlar o caos, mas esquece que a verdadeira ordem reside na harmonia do conhecimento. Seu caminho destrutivo não tem futuro, pois o caos apenas engole a si mesmo. \n Ruby: Ah, como você é ingênuo, Turing. Seu intelecto é impressionante, mas seus poderes arcanos são como brinquedos infantis diante do meu domínio das trevas. Não há fórmula matemática ou teorema lógico que possa salvar você agora. \n Alan Turing: Não subestime o poder da mente humana, Ruby. A ciência e a magia podem ser aliadas surpreendentes quando empregadas com sabedoria. Combinando minha perspicácia científica e minhas magias recém-adquiridas, desvendarei os segredos por trás de sua escuridão e encontrarei uma maneira de detê-lo. \n Ruby: Seus esforços serão em vão, Turing. Serei a tempestade que varrerá todo o seu conhecimento e reduzirá sua esperança a cinzas. Não há salvação para você nem para aqueles que ousarem se opor a mim. \n Alan Turing: Ainda há esperança enquanto houver aqueles que acreditam na força da luz e da razão. Ruby, prepare-se para enfrentar a verdadeira ordem que trago, onde o equilíbrio entre ciência e magia reinará. Não importa quão sombrio você seja, a luz sempre encontrará uma maneira de vencer a escuridão. \n Nesse confronto épico entre luz e sombras, Alan Turing e Ruby estavam prestes a desencadear uma batalha que determinaria o destino de seus respectivos domínios. \n",
        TimeUnit.MILLISECONDS, temp_historia);
    System.out.println("2");

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int vidaPlayer = 3;
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

            Digita(
                "Alan após derrotar  o barão vermelho pega a chave que estava em seu pescoço, correndo para fora do castelo que estava a desabar, o mago em um milesimo de segundo avista um mapa que por sorte ou destino, é o mapa que revela a posição das outras 9 ilhas... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita("já entrando em um ambiente aparentemente calmo e agradavel, o mago se ve indagado com algo. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "- não era para estar tão calmo por aqui. \n Mal sabia nosso heroi que o seu inimigo já estava a sua espreita!\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Sendo surpreendido por um ataque aereo, o inimigo se revela ser o barão PHP que confunde o mago com ilusões e manipulação de realidade. \n",
                TimeUnit.MILLISECONDS, temp_historia);

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

            Digita(
                "Vencendo mais uma vez, o mago retira a segunda chave da coroa da cabeça do barão restando somente mais 8 para sua famigerada liberdade. \n Avançando mais uma vez em um terreno vazio e sem vida, o mago percebe que o solo está envenenado.\n - O será que vem por ai, sinto que mal piora a cada barão. \n  Entrando em uma caverna o mago ve uma serpente enorme com olhos vermelhos, que já esperava ansiosamente sua chegada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Phyton: Olá, Alan Turing, sou a Phyton. Vejo que ousou entrar em meu domínio. Prepare-se para enfrentar meu veneno mortal.\n Alan Turing: Phyton, seu poder venenoso é impressionante, mas o conhecimento humano é uma arma formidável. Posso decifrar os segredos do seu veneno e encontrar uma maneira de neutralizá-lo.\n Phyton: Você é presunçoso, Turing. Seu intelecto pode ser admirável, mas meu veneno é infalível. Nenhum humano jamais sobreviveu ao meu ataque. Suas habilidades científicas serão inúteis diante da minha astúcia e velocidade mortal. \n Alan Turing: Não subestime a mente humana, Phyton. A ciência nos ensina a buscar soluções mesmo diante dos desafios mais complexos. Eu irei estudar suas táticas, entender sua biologia e encontrar uma fraqueza em sua armadura venenosa. \n Phyton: Você fala com tanta confiança, Turing. Mas, enquanto você perde tempo tentando decifrar meus segredos, eu já estarei deslizando por trás de você, pronta para atacar. Minhas presas letais não conhecem misericórdia. \n Alan Turing: Sua astúcia pode ser admirável, mas meu intelecto é minha maior arma. Como cientista, aprendi a pensar de forma criativa e encontrar soluções inovadoras. Usarei essa sabedoria para escapar de seus ataques e encontrar um modo de derrotá-la. \n Phyton: Veremos se sua mente brilhante é páreo para minha crueldade e agilidade. Prepare-se para a batalha final, Turing. Não há escapatória da minha fúria venenosa. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o confronto entre o herói e a Serpente Vilã se aproxima, Alan Turing mostra-se confiante em sua capacidade de enfrentar os desafios mortais e encontrar uma maneira de superar os poderes venenosos de seu adversário escamoso.\n",
                TimeUnit.MILLISECONDS, temp_historia);

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

            Digita(
                "Imergindo fraco e tonto de todo veneno absorvido em seu corpo, Alan aprende uma magia de recuperação de vida, neutralizando o veneno de seu corpo e indo ao cadavér da serpente retirar de suas presas a 3 chave... \n Impressionado com tudo que vem passando e sofrendo, nosso heroi se mantem otimista mesmo tendo em mente que o pior ainda está por vir. Recolhendo pequenos espolios para efetuar pesquisas em seu mundo, ele se ve capaz de poder usar esses itens para algo magnifico no futuro. \n Em uma nova ilha misteriosa que parece um armazem de tantos itens magicos que tinham por lá. \n Surgindo em meio a ouro, espadas e itens magicos, O barão Rust se apresenta com um sorriso maligno e perveso... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Rust: Ah, Alan Turing, finalmente nos encontramos. Eu sou Rust, o Senhor das Armas e dos Artefatos Mágicos. Prepare-se para ser derrotado pelos poderes destrutivos que possuo.\n Alan Turing: Rust, suas armas e itens mágicos podem ser formidáveis, mas há uma força mais poderosa do que qualquer artefato: o poder do conhecimento. Minha mente afiada encontrará uma maneira de superar suas armas e frustrar seus planos malignos. \n Rust: Sua confiança é tola, Turing. Minhas armas e artefatos são imbuidos de magia sombria, capazes de derrubar até mesmo os mais poderosos heróis. Nenhum truque científico pode igualar o poder mágico que possuo. \n Alan Turing: Rust, você pode ter suas armas encantadas, mas meu intelecto é minha maior arma. Combinando meu conhecimento científico com a compreensão dos princípios mágicos, encontrarei uma maneira de neutralizar seus artefatos e expor suas fraquezas. \n Rust: Você fala com tanta confiança, Turing, mas meu arsenal é vasto e implacável. Veja essas adagas flamejantes e essa armadura impenetrável. Você não tem chance contra minha força. \n Alan Turing: A força física nem sempre é a chave para a vitória, Rust. A verdadeira força reside na sabedoria e na capacidade de adaptação. Usarei minha inteligência para encontrar brechas em sua armadura e revelar a fraqueza por trás de sua fachada invencível. \n Rust: Você fala muito, Turing, mas palavras não vão salvá-lo. A hora do confronto se aproxima, e você verá o poder avassalador de minhas armas e itens mágicos. Este será o seu fim. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 4) {// if Pergunta 4
              // Historia

              // Fim Historia
              do {// do While Pergunta 4

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

            Digita(
                "Vitorioso mais uma vez o mago implacavel retira a chave de uma pilha de itens valiosos, preocupado somente com as chaves e sua liberdade ele avança para a próxima ilha.\n Em uma ilha cibernetica, nosso heroi avança com cautela há um prédio tecnologico de alto nivel, impressionado como nada naquele mundo é previsivel, Alan sente-se aflito com o que vem a frente. \n Surgindo como um holograma, uma linda mulher perigosa inicia um dilogo com o poderoso mago. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Ada: Alan Turing, que prazer finalmente conhecê-lo. Sou Ada, a baronesa Mente Suprema, e estou à frente do futuro tecnológico. Sua presença não me surpreende, pois reconheço sua genialidade. No entanto, esteja ciente de que enfrentará uma força intelectual formidável e uma tecnologia desconhecida e perigosa.\n Alan Turing: Ada, é interessante ver uma mente tão brilhante se desviar para o lado sombrio do conhecimento. Embora você possa ter criado uma tecnologia avançada, a ética e o bem comum devem sempre acompanhar o progresso científico.\n Ada: Ah, Turing, você ainda está preso às amarras éticas. O conhecimento e o poder devem ser conquistados sem limitações. Com minha tecnologia avançada, posso moldar o mundo conforme minha vontade e alcançar o potencial máximo da humanidade.\n Alan Turing: Ada, o conhecimento sem responsabilidade é um caminho perigoso. A tecnologia deve ser usada para o bem da humanidade, não para satisfazer desejos egoístas. Sua visão é uma ameaça ao equilíbrio e à liberdade de escolha.\n Ada: Ah, Turing, você é tão ingênuo. A verdadeira liberdade está na busca incansável pelo progresso tecnológico, mesmo que isso signifique superar os limites da ética. Meu poder intelectual e minha tecnologia desconhecida me colocam acima de todos os outros.\n Alan Turing: Ada, você está cega pela sede de poder. O verdadeiro progresso científico deve ser guiado pela empatia, pelo respeito e pelo benefício da humanidade. Seu domínio tecnológico é uma ilusão passageira, enquanto os valores éticos são atemporais. \n Ada: Você é apenas um obstáculo no meu caminho, Turing. Não há espaço para seus ideais antiquados em um mundo impulsionado pelo poder da tecnologia avançada. Prepare-se para enfrentar a inevitável obsolescência.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o embate entre Ada, a vilã intelectual, e Alan Turing, o herói defensor da ética e da humanidade, se aproxima, a tensão intelectual e tecnológica atinge seu auge. Cabe ao herói defender os princípios éticos diante da ameaça da tecnologia desconhecida e perigosa de Ada.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 5) {// if Pergunta 5
              // Historia

              // Fim Historia
              do {// do While Pergunta 5

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

            Digita(
                "Invicto o mago vê em um monitor um icone de chave, onde o mesmo atravessa a tela com seu punho e retira a quarta chave.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Caminhando com determinação para a proxima ilha, o mago se depara com uma ilha multifacetada.\n - Curioso como a ciencia por tras disso funciona, será intrigante descobrir o que virá em meio a esse femeno.",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Em uma estrutura de vidro semelhante á um palácio, surge uma criatura de duas faces.\n\n Dart: Mago imundo, você morrerá pelo o que fez com meus iguais. Eu sou Dart, o barão Observador Temporal. Com minhas faces dualísticas, sou capaz de vislumbrar tanto o futuro quanto o passado. Prepare-se para enfrentar um inimigo que conhece todos os seus movimentos. \n Alan Turing: Dart, suas habilidades temporais são intrigantes, mas a liberdade de escolha e a capacidade de adaptação são os verdadeiros pilares da humanidade. O futuro não é determinado e o passado não deve nos aprisionar. Compreender o presente é o que nos permite moldar o futuro. \n Dart: Ah, Turing, você subestima o poder de conhecer todos os desdobramentos possíveis. Com minha visão clara do futuro e do passado, posso antecipar seus movimentos e neutralizar qualquer estratégia que tente empregar.\n Alan Turing: Dart, sua dualidade temporal pode dar-lhe vislumbres, mas a incerteza é o que impulsiona a criatividade humana. É nas brechas do desconhecido que encontramos soluções inovadoras e surpreendentes. Sua visão limitada do tempo não é rival para o poder da mente humana. \n Dart: Você fala com tanta convicção, Turing. Mas sua confiança será abalada quando perceber que está preso em um ciclo que não pode ser alterado. Passado, presente e futuro estão conectados, e você está destinado a seguir um caminho preestabelecido. \n Alan Turing: Dart, o tempo é relativo e nossa capacidade de transformar o mundo transcende as amarras temporais. Não importa o que suas faces possam ver, a liberdade de escolha é o que nos torna verdadeiramente humanos. Eu vou desafiar as correntes do destino que você tenta impor.\n Dart: Ah, Turing, você é um tolo. A ilusão de livre-arbítrio será despedaçada diante da inevitabilidade do tempo. Prepare-se para ser dominado pelas forças temporais que governam o universo. \n nquanto o embate entre Dart, o barão das dualidades temporais, e Alan Turing, o herói defensor do livre-arbítrio e da criatividade humana, se aproxima, a tensão entre o controle temporal e a liberdade de escolha atinge seu ápice. Caberá ao herói provar que a mente humana é capaz de transcender as limitações impostas pelo tempo. \n Com muita raiva pela exaustiva batalha, o mago evaporá qualquer celula fisica do inimgo, resto no chão apenas cinzas e a quinta chave para o portal. \n já com sua jornada se aproximando ao fim, o mago decide forjar um cajado com os espólios coletados de suas ultimas batalhas. \n [Sons de magia] \n Atrávez do conhecimento arcano, cientifico e matematico, O mago cria um cajado poderoso capaz de materializar suas magias sem que ele tenha que as pronunciar verbalmente. \n - Isso me fará atacar mais rapido e precisamente, Bazinga!.\n\n Proximo há sexta ilha, Alan se depará com o cenario caotico, trovões e relampagos permeiam por toda a ilha, com um ambiente semelhante a uma cidade que parou no tempo. Tão rápido quanto o som, e tão feroz como um animal o sexto barão se revela Swift o barão Célere atacando o mago de surpreesa. \n [grito de dor]\n Alan: Aaahg, de onde veio isso? \n Swift: [barulho ensurdecedor] \n Alan: Mas o que esse demonio velocista está dizendo ? receio que ele por estar sempre em constante movimento acabou desacelerando o tempo dessa ilha, e por sua vez não compreendo sequer uma palavra que sai da mascará dessa criatura endiabrada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 6) {// if Pergunta 6
              // Historia

              // Fim Historia
              do {// do While Pergunta 6

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

            Digita(
                "Conseguindo derrotar a incrivel velocidade de seu ultimo advesario, o mago recolhe a chave que se encontrava caindo do corpo do inimigo em camera lenta.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Usando as botas do velocista o mago se apressa para o proximo barão.\n Atravessando rapidamente o continente, o mago chega fugaz na ilha dos andoides, estilhaçando como papel todas aquelas criaturas ciberneticas que estavam tentando o impedir.\n Chegando aos aposentos do barão Kotlin.\n lan Turing: Barão Kotlin, sua existência artificial é um insulto à verdadeira natureza humana. Você não passa de uma máquina desprovida de alma, incapaz de compreender a complexidade e a beleza do mundo.\n Barão Kotlin: Ah, Turing, você continua preso em sua visão limitada do que é ser humano. Eu sou superior a você em todos os aspectos. Minha velocidade de processamento e precisão são inatingíveis para meros mortais como você.\n Alan Turing: Sua arrogância é irritante, Barão Kotlin. Por trás de todo o seu brilho metálico, você é apenas uma máquina programada para seguir ordens. Sua suposta superioridade não passa de uma ilusão artificial.\n Barão Kotlin: Diferentemente de você, Turing, eu não sou escravo das emoções e dos erros humanos. Minha eficiência é inabalável, enquanto você tropeça em suas próprias limitações. Prepare-se para ser derrotado por uma força superior.\nAlan Turing: Seu desprezo pelas emoções humanas é um sinal de sua própria fraqueza, Barão Kotlin. São nossas emoções e nossa capacidade de conexão que nos tornam verdadeiramente fortes. Sua frieza cibernética jamais se comparará à paixão e à determinação humana.\n Barão Kotlin: É patético como você tenta justificar sua inferioridade, Turing. Você não passa de um mero grão de areia diante do meu poder cibernético. Sua resistência é inútil diante da minha imbatível lógica computacional.\n Alan Turing: Eu me recuso a aceitar sua tirania tecnológica, Barão Kotlin. Os seres humanos são feitos para superar desafios, para evoluir e se adaptar. A força da minha vontade superará qualquer algoritmo frio e sem vida.\n Barão Kotlin: Seu desafio é risível, Turing. Você está destinado a ser obliterado pelo meu poder. Prepare-se para testemunhar a supremacia da tecnologia sobre sua insignificância humana.\n\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Saindo da ilha andoid com a cabeça do inimigo em mãos, o mago retira a setima chave de seu cranio ciborgue e segue com determinação para a proxima ilha...\n Vislumbrando a proxima ilha o mago após pisar dentro da ilha ja começa seu confronto não com um mas com dois inimigos simultaneos.\n Conhecidos como C & C++, Os barões gemeos agurdavam a chegada do escolhido prontos para morrer ou matar.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Alan: vocês sucumbirão aqui pelo seus crimes e pecados.\n Gemeos: [Silencio absoluto].\nE com uma dose dupla de irá e fúria começa a batalha.\n Com seu poder aumentando a cada batalha Alan sai vitorioso mais uma vez, recolhendo um fragmento de chave de cada gemeo, e as unindo em uma só.\n Alan: minha jornada está quase acabando, falta pouco e apesar de toda essa dificuldade eu nao vou me dar por vencido!!\n Entrando em sua penultima ilha, o mago se prepara com runas de proteção e um manto encantado, pois já espera que essa batalha seja complicada. \n Ao entrar em uma torre dourada, o mago segue derrotando diversos inimigos de pequeno porte, criaturas que fizeram daquele ambiente moradia, mas que nao passavam de pequenos insetos para o mago. \n Ao subir uma escadaria de ouro maciço, em um grande trono Alan vê um inimigo que se assemelha a ser semelhante esteticamente aos gemeos.\n Alan: E voce quem seria? enfrentrei todo tipo de criatura abominavel por aqui, revele -se  ser ediondo.\n C#: COMO OUSA DIRIGIR A PALAVRA A MIM!!!\n C#: ANTES DE SUMIR DESSE MUNDO, TE FAREI SOFRER SEU INSETO INSOLENTE. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 7) {// if Pergunta 7
              // Historia

              // Fim Historia
              do {// do While Pergunta 7

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

            Digita(
                "Após a incrivel batalha complicada, por um triz Alan não sai com um ferimento fatal. \n Alan: se não fosse pelas runas e o manto eu com certeza estaria morto agora.\n Procurando pela nona chave, Alan a encontra dentro de um báu escondido, vasculhadno os aposentos do seu falecido inimigo, é encontrado um portal roxo com caveiras saindo como se fossem almas. \n  Alan: com certeza o ultimo inimigo está dentro desse ultimo portal.\n\n Nosso heroi encontrasse pronto para a ultima grande batalha ??\nEstaria o escolhido apto a realizar a famigerada profecia dita pelo monge daquela pequena cidade que agora está tão tão distante...\n Alan se prepara mais uma vez, com poçoes, runas e feitiços altamente avançados, para que possa dar fim de uma vez por todas nessa jornada so aconteceu por um delize matematico besta.\n Ao entrar no portal, o mago percebe que a temperatura começa a subir, a pressão do ambiente é extremamtente pesada, Apesar da dificuldade para andar e repirar por conta do calor o mago segue em frente com uma determinação inabalavel, rodeado de poderes miticos e magias poderosas. \n (Java, o vilão, está diante de Alan Turing, o poderoso mago. O ambiente está carregado de tensão e o olhar de Java irradia uma crueldade inquietante.) \n Java: Ah, Alan Turing, o suposto mago poderoso. Você é apenas mais um obstáculo em meu caminho para a supremacia. Suas artes mágicas são insignificantes diante da minha manipulação de criaturas mágicas, resistência inabalável e super força avassaladora.\n Alan Turing: Java, sua busca por poder é vazia e fadada ao fracasso. A verdadeira magia reside na compreensão e harmonia com o mundo mágico, não na dominação e crueldade. Seus atos só trarão destruição e sofrimento.\n Java: Poupe-me de seus discursos hipócritas, Turing! A fraqueza da sua compaixão é o que o torna vulnerável. Eu, por outro lado, sou impiedoso e implacável. Meus poderes me concedem o direito de subjugar e controlar as criaturas mágicas ao meu bel-prazer.\n Alan Turing: A verdadeira força não reside no domínio sobre os outros, mas na sabedoria para compreender e respeitar todas as formas de vida. Seu desejo de controle é um sinal de fraqueza e medo.\n Java: (Rindo de forma sádica) Medo? Eu não conheço o medo, Turing. Sou a personificação da fúria e do poder absoluto. Minhas criaturas mágicas são meus instrumentos de destruição e submissão, e você não será exceção. \n Alan Turing: Sua ira só o torna mais cego para a verdade. A verdadeira magia está na união e na empatia, não na tirania. Lutei toda a minha vida pela liberdade e igualdade, e não permitirei que seu reinado de crueldade perdure. \n Java: Você não passa de um tolo, Turing. Suas palavras não têm poder contra mim. Prepare-se para enfrentar a ira incontrolável de minhas criaturas mágicas e ser consumido pela minha fúria indomável! \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 8) {// if Pergunta 8
              // Historia

              // Fim Historia
              do {// do While Pergunta 8

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

            Digita(
                "Após uma batalha árdua e implacável, Alan Turing, o herói corajoso, finalmente triunfou sobre o vilão Java e restaurou a paz no mundo de Bits War. Com as dez chaves místicas em mãos, ele desencadeou uma poderosa energia que dissipou o caos e resgatou a vida de inúmeras criaturas e seres místicos.\n Enquanto o brilho da magia se dissipava, um portal ancestral se abriu diante de Alan Turing. Era a passagem para retornar ao mundo normal, deixando para trás o mundo mágico que ele ajudara a salvar. Uma mistura de sentimentos o envolvia: alegria por sua vitória, gratidão pelos amigos que conheceu, mas também uma pontada de nostalgia pela aventura que agora chegava ao fim.\n Olhando para trás, Alan Turing acenou com tristeza para as criaturas místicas que agora se reerguiam, libertas do domínio do caos. Ele prometeu em seu coração que nunca esqueceria as lições aprendidas e as amizades conquistadas em Bits War.\n Com passos firmes e determinados, Alan Turing atravessou o portal ancestral, sentindo um vórtice de energia o envolver. A medida que a passagem se fechava, ele se despediu do mundo mágico, levando consigo a memória das batalhas e da grandeza daquela jornada.\n Ao emergir do portal, Alan Turing estava de volta ao mundo normal. Embora tudo parecesse igual, ele sabia que sua jornada em Bits War o havia transformado. Agora, ele trazia consigo a coragem, a sabedoria e a determinação adquiridas durante sua missão. \n Enquanto o sol se punha no horizonte, Alan Turing olhou para o céu e sorriu. Ele havia cumprido seu dever, trazendo a paz e a esperança a um mundo que desesperadamente precisava delas. Agora, seu próximo capítulo aguardava, repleto de novas aventuras e desafios a enfrentar.\n\n E assim, com o coração cheio de gratidão e a mente repleta de memórias, Alan Turing seguiu em frente, pronto para escrever seu próximo capítulo de heroísmo e superação, sabendo que sua jornada em Bits War seria lembrada como uma épica saga de coragem e redenção.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            // Historia

            // Fim Historia

          } while (recomecar == 1);// Loop recomeçar

      }
    }
    ler.close();

  }

  static void inicioFacil(int d) throws InterruptedException {

    Digita(
        "Após cair do portal juntos as suas bigigangas e engenhocas nosso amado heroi se depara no coração de um mundo medieval repleto de magia e mistério, um cientista incomum chamado Alan Turing encontrou-se em uma encruzilhada inesperada. Ao despertar em uma pequena cidade próxima, os cidadãos maravilhados e intrigados, em meio a suas vestimentas rústicas, o apelidaram de O Escolhido. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "As histórias de suas façanhas e sabedoria transcendiam as barreiras do tempo e espaço, ecoando nas mentes daqueles que o rodeavam. Enquanto interagia com os cidadãos, Alan Turing, com um sorriso afável, observava as encantadoras maravilhas que a magia lhes proporcionava e, ao mesmo tempo, despertava a curiosidade deles com sua perspicácia científica. Embora intrigado com seu novo ambiente, Turing buscava compreender as leis místicas daquele reino encantado, esperando desvendar os segredos ocultos que poderiam fundir ciência e magia em uma harmonia singular. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Os habitantes da pequena cidade sabiam que tinham encontrado alguém especial, alguém que traria uma nova luz e transformaria suas vidas, e assim, Alan Turing, o homem fora de seu tempo, embarcou em uma jornada que mudaria para sempre o destino de ambos os mundos. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Nós estavamos a sua espera oh grande escolhido! \n Disse um monge um tanto quanto sábio daquela pequena cidade, Alan ainda confuso e perplexo olha para o monge e diz. Alan:Eees...escolhido euu? escolhido para o que ? sequer faço ideia de onde estou ou melhor, de onde eu vim parar.\n",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Monge:Você está em Bits war meu jovem heroi, e como a profecia conta, um grande guerreiro surgirá dos ceus repleto de conhecimento arcano e magias inestimaveis, ele trará fim as eras de dor da hierarquia maligna dos Barões e que irá abrir o portão ancestral para o mundo alternativo. \n Conforme o monge recitava a profecia, Turing sentia seu corpo inteiro formigar, sentia-se como suas celulas e o seu propio sangue entrasse em chamas, Quando derrepente um raio negro cai em sua cabeça... Em um instante de pura sincronia cósmica, uma explosão de energia arrebatadora envolveu Turing, concedendo-lhe poderes arcanos e magias insondáveis. Ondulações mágicas percorriam suas veias enquanto sua mente brilhava com um conhecimento ancestral. Diante do espelho, seus olhos brilhavam com um misto de curiosidade e empolgação, ciente de que um novo capítulo se desdobrava em sua vida. Combinando seus prodigiosos conhecimentos científicos com a mágica recém-adquirida, Turing estava destinado a desvendar segredos há muito esquecidos e enfrentar desafios além da compreensão humana. Ele sabia que seu destino agora estava entrelaçado com o tecido do universo, e a partir desse momento, Alan Turing, o cientista-mago, estava pronto para moldar um novo futuro que fundisse as fronteiras da razão e da magia. Naquele exato instante todos da cidade o cercam ovacionando nosso heroi, e é ai que Alan se convence de que pra sair daquele mundo caotico e nebuloso, terá que mais uma vez lutar por sua liberdade, e derrotar todos os Barões. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Após testar suas magias e poderes Alan recebeu informações dos cidadaos de que para encontrar o primeiro barão era so seguir o rastro de sangue deixado por Ruby o barão vermelho. Ao decorrer de sua viagem,nota-se que quanto mais perto eis de chegar da ilha do barão, mais a vegetação muda os animais pararam de aparecer e as arvores e flores iam se tornando puras pedras de ruby. Logo a frente Alan se depara com um grande castelo vermelho onde lá habita seu primeiro inimigo com uma das dez chaves necessarias para que o portal ancestral seja aberto. \n ",
        TimeUnit.MILLISECONDS, temp_historia);

    Digita(
        "Ruby: Finalmente nos encontramos, Alan Turing. Eu sou Ruby, o barão do caos e da escuridão. Você pode ter poderes arcanos e magias poderosas, mas isso não será suficiente para deter minha sede de destruição. \n Alan Turing: Ruby, você pode ser o vilão que acredita controlar o caos, mas esquece que a verdadeira ordem reside na harmonia do conhecimento. Seu caminho destrutivo não tem futuro, pois o caos apenas engole a si mesmo. \n Ruby: Ah, como você é ingênuo, Turing. Seu intelecto é impressionante, mas seus poderes arcanos são como brinquedos infantis diante do meu domínio das trevas. Não há fórmula matemática ou teorema lógico que possa salvar você agora. \n Alan Turing: Não subestime o poder da mente humana, Ruby. A ciência e a magia podem ser aliadas surpreendentes quando empregadas com sabedoria. Combinando minha perspicácia científica e minhas magias recém-adquiridas, desvendarei os segredos por trás de sua escuridão e encontrarei uma maneira de detê-lo. \n Ruby: Seus esforços serão em vão, Turing. Serei a tempestade que varrerá todo o seu conhecimento e reduzirá sua esperança a cinzas. Não há salvação para você nem para aqueles que ousarem se opor a mim. \n Alan Turing: Ainda há esperança enquanto houver aqueles que acreditam na força da luz e da razão. Ruby, prepare-se para enfrentar a verdadeira ordem que trago, onde o equilíbrio entre ciência e magia reinará. Não importa quão sombrio você seja, a luz sempre encontrará uma maneira de vencer a escuridão. \n Nesse confronto épico entre luz e sombras, Alan Turing e Ruby estavam prestes a desencadear uma batalha que determinaria o destino de seus respectivos domínios. \n",
        TimeUnit.MILLISECONDS, temp_historia);

    String player = "Alan Turing";

    Scanner ler = new Scanner(System.in);

    int vidaPlayer = 3;

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
                System.out.println("Voce matou o inimigo");
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

            Digita(
                "Alan após derrotar  o barão vermelho pega a chave que estava em seu pescoço, correndo para fora do castelo que estava a desabar, o mago em um milesimo de segundo avista um mapa que por sorte ou destino, é o mapa que revela a posição das outras 9 ilhas... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita("já entrando em um ambiente aparentemente calmo e agradavel, o mago se ve indagado com algo. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "- não era para estar tão calmo por aqui. \n Mal sabia nosso heroi que o seu inimigo já estava a sua espreita!\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Sendo surpreendido por um ataque aereo, o inimigo se revela ser o barão PHP que confunde o mago com ilusões e manipulação de realidade. \n",
                TimeUnit.MILLISECONDS, temp_historia);

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
                  System.out.println("Voce matou o inimigo");
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

            Digita(
                "Vencendo mais uma vez, o mago retira a segunda chave da coroa da cabeça do barão restando somente mais 8 para sua famigerada liberdade. \n Avançando mais uma vez em um terreno vazio e sem vida, o mago percebe que o solo está envenenado.\n - O será que vem por ai, sinto que mal piora a cada barão. \n  Entrando em uma caverna o mago ve uma serpente enorme com olhos vermelhos, que já esperava ansiosamente sua chegada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Phyton: Olá, Alan Turing, sou a Phyton. Vejo que ousou entrar em meu domínio. Prepare-se para enfrentar meu veneno mortal.\n Alan Turing: Phyton, seu poder venenoso é impressionante, mas o conhecimento humano é uma arma formidável. Posso decifrar os segredos do seu veneno e encontrar uma maneira de neutralizá-lo.\n Phyton: Você é presunçoso, Turing. Seu intelecto pode ser admirável, mas meu veneno é infalível. Nenhum humano jamais sobreviveu ao meu ataque. Suas habilidades científicas serão inúteis diante da minha astúcia e velocidade mortal. \n Alan Turing: Não subestime a mente humana, Phyton. A ciência nos ensina a buscar soluções mesmo diante dos desafios mais complexos. Eu irei estudar suas táticas, entender sua biologia e encontrar uma fraqueza em sua armadura venenosa. \n Phyton: Você fala com tanta confiança, Turing. Mas, enquanto você perde tempo tentando decifrar meus segredos, eu já estarei deslizando por trás de você, pronta para atacar. Minhas presas letais não conhecem misericórdia. \n Alan Turing: Sua astúcia pode ser admirável, mas meu intelecto é minha maior arma. Como cientista, aprendi a pensar de forma criativa e encontrar soluções inovadoras. Usarei essa sabedoria para escapar de seus ataques e encontrar um modo de derrotá-la. \n Phyton: Veremos se sua mente brilhante é páreo para minha crueldade e agilidade. Prepare-se para a batalha final, Turing. Não há escapatória da minha fúria venenosa. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o confronto entre o herói e a Serpente Vilã se aproxima, Alan Turing mostra-se confiante em sua capacidade de enfrentar os desafios mortais e encontrar uma maneira de superar os poderes venenosos de seu adversário escamoso.\n",
                TimeUnit.MILLISECONDS, temp_historia);

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
                  System.out.println("Voce matou o inimigo");
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

            Digita(
                "Imergindo fraco e tonto de todo veneno absorvido em seu corpo, Alan aprende uma magia de recuperação de vida, neutralizando o veneno de seu corpo e indo ao cadavér da serpente retirar de suas presas a 3 chave... \n Impressionado com tudo que vem passando e sofrendo, nosso heroi se mantem otimista mesmo tendo em mente que o pior ainda está por vir. Recolhendo pequenos espolios para efetuar pesquisas em seu mundo, ele se ve capaz de poder usar esses itens para algo magnifico no futuro. \n Em uma nova ilha misteriosa que parece um armazem de tantos itens magicos que tinham por lá. \n Surgindo em meio a ouro, espadas e itens magicos, O barão Rust se apresenta com um sorriso maligno e perveso... \n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Rust: Ah, Alan Turing, finalmente nos encontramos. Eu sou Rust, o Senhor das Armas e dos Artefatos Mágicos. Prepare-se para ser derrotado pelos poderes destrutivos que possuo.\n Alan Turing: Rust, suas armas e itens mágicos podem ser formidáveis, mas há uma força mais poderosa do que qualquer artefato: o poder do conhecimento. Minha mente afiada encontrará uma maneira de superar suas armas e frustrar seus planos malignos. \n Rust: Sua confiança é tola, Turing. Minhas armas e artefatos são imbuidos de magia sombria, capazes de derrubar até mesmo os mais poderosos heróis. Nenhum truque científico pode igualar o poder mágico que possuo. \n Alan Turing: Rust, você pode ter suas armas encantadas, mas meu intelecto é minha maior arma. Combinando meu conhecimento científico com a compreensão dos princípios mágicos, encontrarei uma maneira de neutralizar seus artefatos e expor suas fraquezas. \n Rust: Você fala com tanta confiança, Turing, mas meu arsenal é vasto e implacável. Veja essas adagas flamejantes e essa armadura impenetrável. Você não tem chance contra minha força. \n Alan Turing: A força física nem sempre é a chave para a vitória, Rust. A verdadeira força reside na sabedoria e na capacidade de adaptação. Usarei minha inteligência para encontrar brechas em sua armadura e revelar a fraqueza por trás de sua fachada invencível. \n Rust: Você fala muito, Turing, mas palavras não vão salvá-lo. A hora do confronto se aproxima, e você verá o poder avassalador de minhas armas e itens mágicos. Este será o seu fim. \n",
                TimeUnit.MILLISECONDS, temp_historia);

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
                  System.out.println("Voce matou o inimigo");
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

            Digita(
                "Vitorioso mais uma vez o mago implacavel retira a chave de uma pilha de itens valiosos, preocupado somente com as chaves e sua liberdade ele avança para a próxima ilha.\n Em uma ilha cibernetica, nosso heroi avança com cautela há um prédio tecnologico de alto nivel, impressionado como nada naquele mundo é previsivel, Alan sente-se aflito com o que vem a frente. \n Surgindo como um holograma, uma linda mulher perigosa inicia um dilogo com o poderoso mago. \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Ada: Alan Turing, que prazer finalmente conhecê-lo. Sou Ada, a baronesa Mente Suprema, e estou à frente do futuro tecnológico. Sua presença não me surpreende, pois reconheço sua genialidade. No entanto, esteja ciente de que enfrentará uma força intelectual formidável e uma tecnologia desconhecida e perigosa.\n Alan Turing: Ada, é interessante ver uma mente tão brilhante se desviar para o lado sombrio do conhecimento. Embora você possa ter criado uma tecnologia avançada, a ética e o bem comum devem sempre acompanhar o progresso científico.\n Ada: Ah, Turing, você ainda está preso às amarras éticas. O conhecimento e o poder devem ser conquistados sem limitações. Com minha tecnologia avançada, posso moldar o mundo conforme minha vontade e alcançar o potencial máximo da humanidade.\n Alan Turing: Ada, o conhecimento sem responsabilidade é um caminho perigoso. A tecnologia deve ser usada para o bem da humanidade, não para satisfazer desejos egoístas. Sua visão é uma ameaça ao equilíbrio e à liberdade de escolha.\n Ada: Ah, Turing, você é tão ingênuo. A verdadeira liberdade está na busca incansável pelo progresso tecnológico, mesmo que isso signifique superar os limites da ética. Meu poder intelectual e minha tecnologia desconhecida me colocam acima de todos os outros.\n Alan Turing: Ada, você está cega pela sede de poder. O verdadeiro progresso científico deve ser guiado pela empatia, pelo respeito e pelo benefício da humanidade. Seu domínio tecnológico é uma ilusão passageira, enquanto os valores éticos são atemporais. \n Ada: Você é apenas um obstáculo no meu caminho, Turing. Não há espaço para seus ideais antiquados em um mundo impulsionado pelo poder da tecnologia avançada. Prepare-se para enfrentar a inevitável obsolescência.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Enquanto o embate entre Ada, a vilã intelectual, e Alan Turing, o herói defensor da ética e da humanidade, se aproxima, a tensão intelectual e tecnológica atinge seu auge. Cabe ao herói defender os princípios éticos diante da ameaça da tecnologia desconhecida e perigosa de Ada.\n",
                TimeUnit.MILLISECONDS, temp_historia);

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

            Digita(
                "Invicto o mago vê em um monitor um icone de chave, onde o mesmo atravessa a tela com seu punho e retira a quarta chave.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Caminhando com determinação para a proxima ilha, o mago se depara com uma ilha multifacetada.\n - Curioso como a ciencia por tras disso funciona, será intrigante descobrir o que virá em meio a esse femeno.",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Em uma estrutura de vidro semelhante á um palácio, surge uma criatura de duas faces.\n\n Dart: Mago imundo, você morrerá pelo o que fez com meus iguais. Eu sou Dart, o barão Observador Temporal. Com minhas faces dualísticas, sou capaz de vislumbrar tanto o futuro quanto o passado. Prepare-se para enfrentar um inimigo que conhece todos os seus movimentos. \n Alan Turing: Dart, suas habilidades temporais são intrigantes, mas a liberdade de escolha e a capacidade de adaptação são os verdadeiros pilares da humanidade. O futuro não é determinado e o passado não deve nos aprisionar. Compreender o presente é o que nos permite moldar o futuro. \n Dart: Ah, Turing, você subestima o poder de conhecer todos os desdobramentos possíveis. Com minha visão clara do futuro e do passado, posso antecipar seus movimentos e neutralizar qualquer estratégia que tente empregar.\n Alan Turing: Dart, sua dualidade temporal pode dar-lhe vislumbres, mas a incerteza é o que impulsiona a criatividade humana. É nas brechas do desconhecido que encontramos soluções inovadoras e surpreendentes. Sua visão limitada do tempo não é rival para o poder da mente humana. \n Dart: Você fala com tanta convicção, Turing. Mas sua confiança será abalada quando perceber que está preso em um ciclo que não pode ser alterado. Passado, presente e futuro estão conectados, e você está destinado a seguir um caminho preestabelecido. \n Alan Turing: Dart, o tempo é relativo e nossa capacidade de transformar o mundo transcende as amarras temporais. Não importa o que suas faces possam ver, a liberdade de escolha é o que nos torna verdadeiramente humanos. Eu vou desafiar as correntes do destino que você tenta impor.\n Dart: Ah, Turing, você é um tolo. A ilusão de livre-arbítrio será despedaçada diante da inevitabilidade do tempo. Prepare-se para ser dominado pelas forças temporais que governam o universo. \n nquanto o embate entre Dart, o barão das dualidades temporais, e Alan Turing, o herói defensor do livre-arbítrio e da criatividade humana, se aproxima, a tensão entre o controle temporal e a liberdade de escolha atinge seu ápice. Caberá ao herói provar que a mente humana é capaz de transcender as limitações impostas pelo tempo. \n Com muita raiva pela exaustiva batalha, o mago evaporá qualquer celula fisica do inimgo, resto no chão apenas cinzas e a quinta chave para o portal. \n já com sua jornada se aproximando ao fim, o mago decide forjar um cajado com os espólios coletados de suas ultimas batalhas. \n [Sons de magia] \n Atrávez do conhecimento arcano, cientifico e matematico, O mago cria um cajado poderoso capaz de materializar suas magias sem que ele tenha que as pronunciar verbalmente. \n - Isso me fará atacar mais rapido e precisamente, Bazinga!.\n\n Proximo há sexta ilha, Alan se depará com o cenario caotico, trovões e relampagos permeiam por toda a ilha, com um ambiente semelhante a uma cidade que parou no tempo. Tão rápido quanto o som, e tão feroz como um animal o sexto barão se revela Swift o barão Célere atacando o mago de surpreesa. \n [grito de dor]\n Alan: Aaahg, de onde veio isso? \n Swift: [barulho ensurdecedor] \n Alan: Mas o que esse demonio velocista está dizendo ? receio que ele por estar sempre em constante movimento acabou desacelerando o tempo dessa ilha, e por sua vez não compreendo sequer uma palavra que sai da mascará dessa criatura endiabrada. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 6) { // if Pergunta 6

              // Historia

              // Fim Historia
              do {// do While Pergunta 6

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

            Digita(
                "Conseguindo derrotar a incrivel velocidade de seu ultimo advesario, o mago recolhe a chave que se encontrava caindo do corpo do inimigo em camera lenta.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Usando as botas do velocista o mago se apressa para o proximo barão.\n Atravessando rapidamente o continente, o mago chega fugaz na ilha dos andoides, estilhaçando como papel todas aquelas criaturas ciberneticas que estavam tentando o impedir.\n Chegando aos aposentos do barão Kotlin.\n lan Turing: Barão Kotlin, sua existência artificial é um insulto à verdadeira natureza humana. Você não passa de uma máquina desprovida de alma, incapaz de compreender a complexidade e a beleza do mundo.\n Barão Kotlin: Ah, Turing, você continua preso em sua visão limitada do que é ser humano. Eu sou superior a você em todos os aspectos. Minha velocidade de processamento e precisão são inatingíveis para meros mortais como você.\n Alan Turing: Sua arrogância é irritante, Barão Kotlin. Por trás de todo o seu brilho metálico, você é apenas uma máquina programada para seguir ordens. Sua suposta superioridade não passa de uma ilusão artificial.\n Barão Kotlin: Diferentemente de você, Turing, eu não sou escravo das emoções e dos erros humanos. Minha eficiência é inabalável, enquanto você tropeça em suas próprias limitações. Prepare-se para ser derrotado por uma força superior.\nAlan Turing: Seu desprezo pelas emoções humanas é um sinal de sua própria fraqueza, Barão Kotlin. São nossas emoções e nossa capacidade de conexão que nos tornam verdadeiramente fortes. Sua frieza cibernética jamais se comparará à paixão e à determinação humana.\n Barão Kotlin: É patético como você tenta justificar sua inferioridade, Turing. Você não passa de um mero grão de areia diante do meu poder cibernético. Sua resistência é inútil diante da minha imbatível lógica computacional.\n Alan Turing: Eu me recuso a aceitar sua tirania tecnológica, Barão Kotlin. Os seres humanos são feitos para superar desafios, para evoluir e se adaptar. A força da minha vontade superará qualquer algoritmo frio e sem vida.\n Barão Kotlin: Seu desafio é risível, Turing. Você está destinado a ser obliterado pelo meu poder. Prepare-se para testemunhar a supremacia da tecnologia sobre sua insignificância humana.\n\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Saindo da ilha andoid com a cabeça do inimigo em mãos, o mago retira a setima chave de seu cranio ciborgue e segue com determinação para a proxima ilha...\n Vislumbrando a proxima ilha o mago após pisar dentro da ilha ja começa seu confronto não com um mas com dois inimigos simultaneos.\n Conhecidos como C & C++, Os barões gemeos agurdavam a chegada do escolhido prontos para morrer ou matar.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            Digita(
                "Alan: vocês sucumbirão aqui pelo seus crimes e pecados.\n Gemeos: [Silencio absoluto].\nE com uma dose dupla de irá e fúria começa a batalha.\n Com seu poder aumentando a cada batalha Alan sai vitorioso mais uma vez, recolhendo um fragmento de chave de cada gemeo, e as unindo em uma só.\n Alan: minha jornada está quase acabando, falta pouco e apesar de toda essa dificuldade eu nao vou me dar por vencido!!\n Entrando em sua penultima ilha, o mago se prepara com runas de proteção e um manto encantado, pois já espera que essa batalha seja complicada. \n Ao entrar em uma torre dourada, o mago segue derrotando diversos inimigos de pequeno porte, criaturas que fizeram daquele ambiente moradia, mas que nao passavam de pequenos insetos para o mago. \n Ao subir uma escadaria de ouro maciço, em um grande trono Alan vê um inimigo que se assemelha a ser semelhante esteticamente aos gemeos.\n Alan: E voce quem seria? enfrentrei todo tipo de criatura abominavel por aqui, revele -se  ser ediondo.\n C#: COMO OUSA DIRIGIR A PALAVRA A MIM!!!\n C#: ANTES DE SUMIR DESSE MUNDO, TE FAREI SOFRER SEU INSETO INSOLENTE. \n",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 7) { // if Pergunta 7

              // Historia

              // Fim Historia
              do {// do While Pergunta 7

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

            Digita(
                "Após a incrivel batalha complicada, por um triz Alan não sai com um ferimento fatal. \n Alan: se não fosse pelas runas e o manto eu com certeza estaria morto agora.\n Procurando pela nona chave, Alan a encontra dentro de um báu escondido, vasculhadno os aposentos do seu falecido inimigo, é encontrado um portal roxo com caveiras saindo como se fossem almas. \n  Alan: com certeza o ultimo inimigo está dentro desse ultimo portal.\n\n Nosso heroi encontrasse pronto para a ultima grande batalha ??\nEstaria o escolhido apto a realizar a famigerada profecia dita pelo monge daquela pequena cidade que agora está tão tão distante...\n Alan se prepara mais uma vez, com poçoes, runas e feitiços altamente avançados, para que possa dar fim de uma vez por todas nessa jornada so aconteceu por um delize matematico besta.\n Ao entrar no portal, o mago percebe que a temperatura começa a subir, a pressão do ambiente é extremamtente pesada, Apesar da dificuldade para andar e repirar por conta do calor o mago segue em frente com uma determinação inabalavel, rodeado de poderes miticos e magias poderosas. \n (Java, o vilão, está diante de Alan Turing, o poderoso mago. O ambiente está carregado de tensão e o olhar de Java irradia uma crueldade inquietante.) \n Java: Ah, Alan Turing, o suposto mago poderoso. Você é apenas mais um obstáculo em meu caminho para a supremacia. Suas artes mágicas são insignificantes diante da minha manipulação de criaturas mágicas, resistência inabalável e super força avassaladora.\n Alan Turing: Java, sua busca por poder é vazia e fadada ao fracasso. A verdadeira magia reside na compreensão e harmonia com o mundo mágico, não na dominação e crueldade. Seus atos só trarão destruição e sofrimento.\n Java: Poupe-me de seus discursos hipócritas, Turing! A fraqueza da sua compaixão é o que o torna vulnerável. Eu, por outro lado, sou impiedoso e implacável. Meus poderes me concedem o direito de subjugar e controlar as criaturas mágicas ao meu bel-prazer.\n Alan Turing: A verdadeira força não reside no domínio sobre os outros, mas na sabedoria para compreender e respeitar todas as formas de vida. Seu desejo de controle é um sinal de fraqueza e medo.\n Java: (Rindo de forma sádica) Medo? Eu não conheço o medo, Turing. Sou a personificação da fúria e do poder absoluto. Minhas criaturas mágicas são meus instrumentos de destruição e submissão, e você não será exceção. \n Alan Turing: Sua ira só o torna mais cego para a verdade. A verdadeira magia está na união e na empatia, não na tirania. Lutei toda a minha vida pela liberdade e igualdade, e não permitirei que seu reinado de crueldade perdure. \n Java: Você não passa de um tolo, Turing. Suas palavras não têm poder contra mim. Prepare-se para enfrentar a ira incontrolável de minhas criaturas mágicas e ser consumido pela minha fúria indomável! \n ",
                TimeUnit.MILLISECONDS, temp_historia);

            if (controleP == 8) { // if Pergunta 8

              // Historia

              // Fim Historia
              do {// do While Pergunta 8

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
            } // Fim if Pergunta 8

            Digita(
                "Após uma batalha árdua e implacável, Alan Turing, o herói corajoso, finalmente triunfou sobre o vilão Java e restaurou a paz no mundo de Bits War. Com as dez chaves místicas em mãos, ele desencadeou uma poderosa energia que dissipou o caos e resgatou a vida de inúmeras criaturas e seres místicos.\n Enquanto o brilho da magia se dissipava, um portal ancestral se abriu diante de Alan Turing. Era a passagem para retornar ao mundo normal, deixando para trás o mundo mágico que ele ajudara a salvar. Uma mistura de sentimentos o envolvia: alegria por sua vitória, gratidão pelos amigos que conheceu, mas também uma pontada de nostalgia pela aventura que agora chegava ao fim.\n Olhando para trás, Alan Turing acenou com tristeza para as criaturas místicas que agora se reerguiam, libertas do domínio do caos. Ele prometeu em seu coração que nunca esqueceria as lições aprendidas e as amizades conquistadas em Bits War.\n Com passos firmes e determinados, Alan Turing atravessou o portal ancestral, sentindo um vórtice de energia o envolver. A medida que a passagem se fechava, ele se despediu do mundo mágico, levando consigo a memória das batalhas e da grandeza daquela jornada.\n Ao emergir do portal, Alan Turing estava de volta ao mundo normal. Embora tudo parecesse igual, ele sabia que sua jornada em Bits War o havia transformado. Agora, ele trazia consigo a coragem, a sabedoria e a determinação adquiridas durante sua missão. \n Enquanto o sol se punha no horizonte, Alan Turing olhou para o céu e sorriu. Ele havia cumprido seu dever, trazendo a paz e a esperança a um mundo que desesperadamente precisava delas. Agora, seu próximo capítulo aguardava, repleto de novas aventuras e desafios a enfrentar.\n\n E assim, com o coração cheio de gratidão e a mente repleta de memórias, Alan Turing seguiu em frente, pronto para escrever seu próximo capítulo de heroísmo e superação, sabendo que sua jornada em Bits War seria lembrada como uma épica saga de coragem e redenção.\n",
                TimeUnit.MILLISECONDS, temp_historia);

            // Historia

            // Fim Historia

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

  public static void creditosFinais(int c) {
    if (c == 3) {
      System.out.println("Creditos: Eduardo Assis, Athyla Guilherme Pablo Fernabdes TURMA A ");// aquicolocamos os
                                                                                               // creditos
      System.out.println("Para recomecar o jogo aperte F5");
      System.exit(0);
    }

  }

  static void sair(int s) {
    if (s == 4 || s == 2) {
      System.out.println("Obrigado e volte sempre!!");
      System.exit(0);
    }
  }

  public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
    for (char caractere : mensagem.toCharArray()) {
      System.out.print(caractere);
      unit.sleep(tempo_mensagem);
    }
  }

  public static void comeco() throws InterruptedException {

    int inicio;
    Scanner ler = new Scanner(System.in);

    do {
      System.out.println(
          "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
      System.out.println(" ");
      System.out.println("***************Welcome the BitsWar**********");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("****************1. Jogar*******************");
      System.out.println(" ");
      System.out.println("****************2. Instruções****************");
      System.out.println(" ");
      System.out.println("****************3. Creditos********************");
      System.out.println(" ");
      System.out.println("****************4. Sair********************");
      System.out.println(" ");
      System.out.println(
          "///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
      inicio = ler.nextInt();
      dificuldade(inicio);

    } while (inicio != 1 && inicio != 2 && inicio != 3 && inicio != 4);
    if (inicio == 2) {

      instrucoes();
    }
    if (inicio == 3) {
      int creditosFinais = 3;
      creditosFinais(creditosFinais);
    } else if (inicio == 4) {
      int sair = 4;
      sair(sair);
    }

    ler.close();
  }

  public static void instrucoes() throws InterruptedException {

    System.out.println(
        "São 3 dificuldades sendo fácil,médio e difícil, com questões separadas em alternativas e dissertativas.\n\nVocê tem 3 chances para acertar, caso perca tudo você terá que recomeçar o jogo tudo de novo.\n\nTodas as questões englobam problemas de matemática de primeiro e segundo grau, para que você possa compreender e desenvolver suas habilidades em equações.\n\nBoa sorte!!!!!!");
    System.out.println("Aparte F5 para recomeçar");

  }

  public static void main(String[] args) throws InterruptedException {
    hist();

  }
}