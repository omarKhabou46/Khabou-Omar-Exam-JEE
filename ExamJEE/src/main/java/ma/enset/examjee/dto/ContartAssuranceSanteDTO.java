package ma.enset.examjee.dto;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import ma.enset.examjee.entity.ContratAssurance;
import ma.enset.examjee.entity.enumiration.NiveauCouverture;

@Data
public class ContartAssuranceSanteDTO extends ContratAssuranceDTO {
   @Enumerated(value = EnumType.STRING)
   private NiveauCouverture niveauCouverture;
   private int nbPersonne;
}
