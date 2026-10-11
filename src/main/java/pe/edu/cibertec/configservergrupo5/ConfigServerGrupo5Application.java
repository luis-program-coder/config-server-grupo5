package pe.edu.cibertec.configservergrupo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigServerGrupo5Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo5Application.class, args);
    }

}
