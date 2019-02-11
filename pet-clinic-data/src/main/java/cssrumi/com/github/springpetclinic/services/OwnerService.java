package cssrumi.com.github.springpetclinic.services;

import cssrumi.com.github.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner fingById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
