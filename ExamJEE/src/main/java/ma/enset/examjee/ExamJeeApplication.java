package ma.enset.examjee;

import ma.enset.examjee.repository.ClientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ExamJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamJeeApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(ClientRepo clientRepo) {
        return args -> {

            Stream.of("omar", "hassan", "yassin").forEach(client -> {
                Clie
            });


        };
    }
}
