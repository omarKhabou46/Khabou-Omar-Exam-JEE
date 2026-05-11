package ma.enset.examjee.mapper;

import ma.enset.examjee.dto.ContratAssuranceAutomobileDTO;
import ma.enset.examjee.dto.ContratAssuranceHabitationDTO;
import ma.enset.examjee.dto.ContratAssuranceSanteDTO;
import ma.enset.examjee.entity.ContratAssuranceAutomobile;
import ma.enset.examjee.entity.ContratAssuranceHabitation;
import ma.enset.examjee.entity.ContratAssuranceSante;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ContratAssuaranceMapper {

    public ContratAssuranceSante fromContratSanteDTO(ContratAssuranceSanteDTO contratAssuranceSanteDTO) {
        ContratAssuranceSante contratAssuranceSante = new ContratAssuranceSante();
        BeanUtils.copyProperties(contratAssuranceSanteDTO, contratAssuranceSante);
        return contratAssuranceSante;
    }

    public ContratAssuranceSanteDTO fromContratSante(ContratAssuranceSante contratAssuranceSante) {
        ContratAssuranceSanteDTO contratAssuranceSanteDTO = new ContratAssuranceSanteDTO();
        BeanUtils.copyProperties(contratAssuranceSante, contratAssuranceSanteDTO);
        return contratAssuranceSanteDTO;
    }

    public ContratAssuranceAutomobile fromContratAutomobileDTO(ContratAssuranceAutomobileDTO contratAssuranceAutomobileDTO) {
        ContratAssuranceAutomobile contratAssuranceAutomobile = new ContratAssuranceAutomobile();
        BeanUtils.copyProperties(contratAssuranceAutomobileDTO, contratAssuranceAutomobile);
        return contratAssuranceAutomobile;
    }

    public ContratAssuranceAutomobileDTO fromContratAutomobile(ContratAssuranceAutomobile contratAssuranceAutomobile) {
        ContratAssuranceAutomobileDTO contratAssuranceAutomobileDTO = new ContratAssuranceAutomobileDTO();
        BeanUtils.copyProperties(contratAssuranceAutomobile, contratAssuranceAutomobileDTO);
        return contratAssuranceAutomobileDTO;
    }


    public ContratAssuranceHabitation fromContratHabitationDTO(ContratAssuranceHabitationDTO contratAssuranceHabitationDTO) {
        ContratAssuranceHabitation contratAssuranceHabitation = new ContratAssuranceHabitation();
        BeanUtils.copyProperties(contratAssuranceHabitationDTO, contratAssuranceHabitation);
        return contratAssuranceHabitation;
    }

    public ContratAssuranceHabitationDTO fromContratHabitation(ContratAssuranceHabitation contratAssuranceHabitation) {
        ContratAssuranceHabitationDTO contratAssuranceHabitationDTO = new ContratAssuranceHabitationDTO();
        BeanUtils.copyProperties(contratAssuranceHabitation, contratAssuranceHabitationDTO);
        return contratAssuranceHabitationDTO;
    }

}
