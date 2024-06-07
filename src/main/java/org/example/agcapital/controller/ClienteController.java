package org.example.agcapital.controller;

import org.example.agcapital.entities.Cliente;
import org.example.agcapital.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/clientes")


public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente existingCliente = clienteService.getClienteById(id);
        if (existingCliente != null) {
            cliente.setId(id);
            return clienteService.saveCliente(cliente);
        } else {
            return null; // Or handle error
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
}

