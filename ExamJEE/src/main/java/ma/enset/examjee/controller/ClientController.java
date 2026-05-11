package ma.enset.examjee.controller;

import lombok.RequiredArgsConstructor;
import ma.enset.examjee.dto.ClientDTO;
import ma.enset.examjee.dto.ContratAssuranceDTO;
import ma.enset.examjee.service.IClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClientController {
    private final IClientService clientService;


    @PostMapping
    public ResponseEntity<ClientDTO> createClientDto(@RequestBody ClientDTO clientDTO) {
        return new ResponseEntity<>(clientService.createClient(clientDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        return new ResponseEntity<>(clientService.getAllClients(), HttpStatus.OK);
    }

    @GetMapping("{nom}")
    public ResponseEntity<ClientDTO> getClientByNom(@PathVariable String nom) {
        return new ResponseEntity<>(clientService.getClientByNom(nom), HttpStatus.OK);
    }

    @GetMapping("/{id}/contrats")
    public ResponseEntity<List<ContratAssuranceDTO>> getContratAssuranceByCid(@PathVariable long id) {
        return new ResponseEntity<>(clientService.getListContratbyClientId(id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable long id) {
        clientService.deleteClient(id);
    }

}
