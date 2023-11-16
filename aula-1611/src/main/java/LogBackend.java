import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class LogBackend {

    private static Logger log = LogManager.getLogger(LogBackend.class);

    public static void main(String[] args) {

        Configurator.setRootLevel(Level.ALL);

        log.info("Programa iniciado");
        log.fatal("Fatality");
        log.error("Deu caquinha aqui");
        log.warn("Atenção");
        log.trace("Trace");

    }
}



