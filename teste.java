public class teste {

  public static void main(String[] args) {

    System.out.println("Realizando teste...");

    String respostas1[] = new String[] {  "7/8", "-1/2", "4/8", "6/6" ,"1/9", "10/5", "3/4", "3/6" ,
         "-1/8", "-1/5", "-4/10", "2/5"  };

    String respostas2[] = new String[] {  "7", "-1/2", "-8", "6","1", "-10/5", "-5", "3/7" , "-1/5", 
    "0,4", "-0,5"  };

    testa_respsota(respostas1, "2/5");

    testa_respsota(respostas2, "0,4");

  }

  public static void testa_respsota(String resposta[], String ValorEsperado) {

    if (Grupo_2_Turma_A_TADS_Noturno.testeRespostaFracao(resposta) != ValorEsperado && Grupo_2_Turma_A_TADS_Noturno.testeRespostaDecimal(resposta) != ValorEsperado) {

      System.out.println("/*Erro*/");

    }

    else {
      System.out.println("Passou no teste");
    }
  }

}
