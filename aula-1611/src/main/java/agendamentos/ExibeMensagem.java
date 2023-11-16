package agendamentos;

import java.util.TimerTask;

public class ExibeMensagem extends TimerTask {

    private String mensagem;
    private int delay;
    private int period;

    public ExibeMensagem(String mensagem, int delay, int period) {
        this.mensagem = mensagem;
        this.delay = delay;
        this.period = period;
    }

    @Override
    public void run() {
        System.out.println("Mensagem: " + mensagem);
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getDelay() {
        return delay;
    }

    public int getPeriod() {
        return period;
    }
}
