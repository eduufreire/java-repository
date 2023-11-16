package agendamentos;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class AppAgen {
    public static void main(String[] args) {

        /* O que são threads no java? */

        // "Cria" as tarefas no sistema
        // TimerTask - tarefas periodicas
        Timer agendador = new Timer();
        Scanner in = new Scanner(System.in);

        System.out.println("Mensagem rotina:");
        String mensagemRotina = in.nextLine();

        System.out.println("Pressione algo:");

        // Classe que extend TimerTask e aplica a regra do negócio
        ExibeMensagem tarefa1 = new ExibeMensagem(mensagemRotina, 2000, 2000);
        ExibeMensagem tarefa2 = new ExibeMensagem("Que saudades da praia", 1000, 4000);

        //Delay ->  Atraso para rodar a primeira vez
        //Periodo -> Periodicidade que acontecera a tarefa
        agendador.schedule(tarefa1, tarefa1.getDelay(), tarefa1.getPeriod());
        agendador.schedule(tarefa2, tarefa2.getDelay(), tarefa2.getPeriod());


        in.next();
        agendador.cancel();

    }
}
