package dev.melnikova.restfulapiexample.controller;

import dev.melnikova.restfulapiexample.model.Client;
import dev.melnikova.restfulapiexample.model.ClientID;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ClientController {

    @GetMapping("/client")
    public List<Client> getAllClients() {
        List<Client> result = new ArrayList<>();

        result.add( new Client("1",
                "Evgenii Mitrofanov",
                28,
                "evgeniimitrofanov@gmail.com"));

        result.add( new Client("2",
                "Ramzan Akhmatovich",
                3,
                "ramzan@gmail.com"));

        result.add( new Client("3",
                "Olga Melnikova",
                29,
                "olgamelnikova@gmail.com"));

        return result;

    }

    @PostMapping("client")
    public ResponseEntity<ClientID> createClient(@RequestBody final Client client) {
        System.out.println(client);
        ClientID result = new ClientID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }

    @GetMapping("/client/{id}")
    public Client getClientById(@PathVariable final String id) {
        System.out.println(id);
        return new Client(id,
                "Ramzan Akhmatovich",
                3,
                "ramzan@gmail.com");
    }

    @PatchMapping("client")
    public void patchClient(@RequestBody final Client client) {
        System.out.println(client);
    }

    @DeleteMapping("client/{id}")
    public void patchClient(@PathVariable final String id) {
        System.out.println(id);
    }
}
