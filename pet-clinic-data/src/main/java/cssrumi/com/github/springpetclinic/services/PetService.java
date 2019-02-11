package cssrumi.com.github.springpetclinic.services;

import cssrumi.com.github.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet fingById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
