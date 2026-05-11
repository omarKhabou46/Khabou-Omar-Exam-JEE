package ma.enset.examjee.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.examjee.entity.enumiration.TypePaiement;

import java.time.LocalDate;

@Data
public class PaiementsDTO {
    private Long id;
    private LocalDate date;
    private TypePaiement typePaiement;
}
