package cssrumi.com.github.springpetclinic.repositories;

import cssrumi.com.github.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
