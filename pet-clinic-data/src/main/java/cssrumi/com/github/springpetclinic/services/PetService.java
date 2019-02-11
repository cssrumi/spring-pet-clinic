package cssrumi.com.github.springpetclinic.services;

import cssrumi.com.github.springpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet fingById(Long id);

}
