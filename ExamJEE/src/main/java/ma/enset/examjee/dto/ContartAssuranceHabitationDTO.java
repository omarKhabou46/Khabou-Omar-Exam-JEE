package ma.enset.examjee.dto;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import ma.enset.examjee.entity.ContratAssurance;
import ma.enset.examjee.entity.enumiration.TypeLogement;

@Data
public class ContartAssuranceHabitationDTO extends ContratAssuranceDTO {
   @Enumerated(value = EnumType.STRING)
   private TypeLogement typeLogement;
   private String addresse;
   private double superficie;
}
