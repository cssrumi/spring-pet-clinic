package cssrumi.com.github.springpetclinic.services;

import cssrumi.com.github.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet fingById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
