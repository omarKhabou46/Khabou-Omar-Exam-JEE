package ma.enset.examjee.mapper;

import ma.enset.examjee.dto.PaiementsDTO;
import ma.enset.examjee.entity.Paiements;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaiementMapper {

    public Paiements fromPaiementDTO(PaiementsDTO paiementsDTO) {
        Paiements paiements = new Paiements();
        BeanUtils.copyProperties(paiementsDTO, paiements);
        return paiements;
    }

    public PaiementsDTO fromPaiement(Paiements paiements) {
        PaiementsDTO paiementsDTO = new PaiementsDTO();
        BeanUtils.copyProperties(paiements, paiementsDTO);
        return paiementsDTO;
    }


}
