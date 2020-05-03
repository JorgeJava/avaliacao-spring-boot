package br.com.tokiomarine.seguradora.avaliacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

@SpringBootApplication
public class Application {
	
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	  @Bean
	  public CommandLineRunner demo(EstudanteRepository repository) {
	    	return (args) -> {
	    	
	    	 log.info("-------------------------------");
	    	 log.info("VALOR INICIAL DA BASE DE DADOS APOS CARGA AUTOMATICA");
    	     log.info("-------------------------------");
    		 for (Estudante estudante : repository.findAll()) {
    		        log.info("ID: "+estudante.getId().toString());
    		        log.info("NOME: "+estudante.getNome().toString());
    		        log.info("EMAIL: "+estudante.getEmail().toString());
    		        log.info("TELEFONE: "+estudante.getTelefone().toString());
    		        log.info("MATRICULA: "+estudante.getMatricula().toString());
    		        log.info("CURSO: "+estudante.getCurso().toString());
    		        log.info("-------------------------------");
    		      }
    		 log.info("-------------------------------");
	    	};
	    }
}
