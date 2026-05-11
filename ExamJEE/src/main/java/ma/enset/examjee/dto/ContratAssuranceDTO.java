package ma.enset.examjee.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.examjee.entity.Client;
import ma.enset.examjee.entity.Paiements;
import ma.enset.examjee.entity.enumiration.StatusContrat;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContratAssuranceDTO {
    private Long id;
    private LocalDate dateSouscription;
    @Enumerated(value = EnumType.STRING)
    private StatusContrat statusContrat;
    private LocalDate dateValidation;
    private double montantCotisation;
    private int dureeContart;
    private double tauxCouverture;
    private List<PaiementsDTO> paiementsListDTO;
}


//