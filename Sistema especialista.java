import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[][] jogos = { { "FPS", "online", "estressado" }, { "Sandbox", "online", "criativo" }, { "Terror", "offline", "corajoso" } };
        String[] resposta =perguntas();
        String perfil = "inconclusivo";
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i][0].equals(resposta[0]) && jogos[i][1].equals(resposta[1])) {
                perfil = jogos[i][2];
                break;
            }
        }
        System.out.printf("Você é %s.", perfil);
    }

    public static String[] perguntas(){
        String pergunta[]= {"teste", "teste"};
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Você gosta de qual genero? [FPS,Sandbox,Terror] ");
             pergunta[0] = teclado.next();
             System.out.println("Você prefere online ou offline? ");
             pergunta[1] = teclado.next();
        }
        return pergunta;
    }
}
