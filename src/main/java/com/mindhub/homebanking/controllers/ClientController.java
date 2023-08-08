package com.mindhub.homebanking.controllers;

import com.mindhub.homebanking.dtos.ClienDTO;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @RequestMapping("/client")
    public List<ClienDTO> getClients(){
        List<Client> listClient = clientRepository.findAll();
        List<ClienDTO> listClientDTO = listClient.stream().map(client -> new ClienDTO(client)).collect(Collectors.toList());
        return listClientDTO;
    };
}
