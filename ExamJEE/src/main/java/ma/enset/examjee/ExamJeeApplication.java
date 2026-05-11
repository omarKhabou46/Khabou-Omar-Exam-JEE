package ma.enset.examjee;

import lombok.RequiredArgsConstructor;
import ma.enset.examjee.dto.ClientDTO;
import ma.enset.examjee.dto.ContratAssuranceHabitationDTO;
import ma.enset.examjee.entity.Client;
import ma.enset.examjee.entity.ContratAssuranceHabitation;
import ma.enset.examjee.entity.enumiration.StatusContrat;
import ma.enset.examjee.entity.enumiration.TypeLogement;
import ma.enset.examjee.mapper.ClientMapper;
import ma.enset.examjee.mapper.ContratAssuaranceMapper;
import ma.enset.examjee.mapper.PaiementMapper;
import ma.enset.examjee.repository.ClientRepo;
import ma.enset.examjee.repository.ContratAssuranceRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@RequiredArgsConstructor
public class ExamJeeApplication {

    private final ClientMapper clientMapper;
    private final ContratAssuaranceMapper contratAssuaranceMapper;

    public static void main(String[] args) {
        SpringApplication.run(ExamJeeApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(ClientRepo clientRepo, ContratAssuranceRepo contratAssuranceRepo, PaiementMapper paiementMapper) {
        return args -> {

            Stream.of("omar", "hassan", "yassin").forEach(client -> {
                ClientDTO clientDTO = new ClientDTO();
                clientDTO.setNom(client);
                clientDTO.setEmail(client+"@gmail.com");
                clientRepo.save(clientMapper.formClientDTO(clientDTO));
            });

            List<Client> list = clientRepo.findAll();
            list.stream().forEach(client -> {
                ContratAssuranceHabitationDTO contratAssuranceHabitationDTO = new ContratAssuranceHabitationDTO();
                contratAssuranceHabitationDTO.setAddresse("address"+Math.random()*10+"marrakech "+ client.getNom());
                contratAssuranceHabitationDTO.setSuperficie(Math.random() * 100);
                contratAssuranceHabitationDTO.setTypeLogement(TypeLogement.APPARTEMENT);
                contratAssuranceHabitationDTO.setStatusContrat(StatusContrat.EN_COURS);
                contratAssuranceHabitationDTO.setDateValidation(LocalDate.now().plusYears(2));
                contratAssuranceHabitationDTO.setDureeContart(300);
                contratAssuranceHabitationDTO.setTauxCouverture(Math.random());
                contratAssuranceHabitationDTO.setDateSouscription(LocalDate.now());
                contratAssuranceHabitationDTO.setMontantCotisation(Math.random() * 1000);
                ContratAssuranceHabitation contratAssuranceHabitation = contratAssuaranceMapper.fromContratHabitationDTO(contratAssuranceHabitationDTO);
                contratAssuranceHabitation.setClient(client);
                contratAssuranceRepo.save(contratAssuranceHabitation);
            });


        };
    }
}
