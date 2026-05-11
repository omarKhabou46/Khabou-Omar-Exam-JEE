package ma.enset.examjee.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("AUTOMOBILE")
public class ContratAssuranceAutomobile extends ContratAssurance{

    private long numeroImmatriculation;
    private String marque;
    private String modele;

}
