import java.util.Random;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    
      System.out.println("""
          -------------------------------------
          |     PEDRA, PAPEL E TESOURA        |
          -------------------------------------
          | ESCOLHA UMA DAS OPÇÕES:           |
          | 1- PEDRA                          |
          | 2- PAPEL                          |  
          | 3- TESOURA                        |
          | 0- SAIR DO JOGO                   |
          -------------------------------------""");
    while(true){
      Scanner entrada = new Scanner(System.in);
      System.out.print(" Escolha um número dentre 1 a 3: ");
      int escolha = entrada.nextInt();

      Random random = new Random();
      int escolhaPc = random.nextInt(1, 4);

      if(escolha == escolhaPc){
        System.out.print(" O jogador escolheu: " + escolhaPc +"");
        System.out.print("\n O jogo empatou!!");      
      }else if(escolha == 1 && escolhaPc == 3 || escolha == 2 && escolhaPc == 1 || escolha == 3 && escolhaPc == 2){
        System.out.print(" O jogador escolheu: " + escolhaPc +"");
        System.out.print("\n Você venceu!!");
      }else if(escolha == 3 && escolhaPc == 1 || escolha == 1 && escolhaPc == 2 || escolha == 2 && escolhaPc == 3){
        System.out.print(" O jogador escolheu: " + escolhaPc +"");
        System.out.print("\n Você perdeu!!");
      }else if(escolha == 4){
        System.out.println("\n Vai tomar no seu cu arrombado,\n não tem esse número nas opções,\n para de ser burro.");
      }else if(escolha == 0){
        System.out.println("Tchau!! Obrigado por jogar!!");
        break;
      }
    } 
  }
}
