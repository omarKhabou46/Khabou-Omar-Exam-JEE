package ma.enset.examjee.dto;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import ma.enset.examjee.entity.ContratAssurance;

@Data
public class ContartAssuranceAutomobileDTO extends ContratAssuranceDTO {
    private long numeroImmatriculation;
    private String marque;
    private String modele;
}
