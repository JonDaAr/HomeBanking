package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class ClienDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    public ClienDTO(Client client){
        this.id = client.getID();

        this.firstName = client.getfirstName();

        this.lastName = client.getlastName();

        this.email = client.getEmail();

    }





    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
