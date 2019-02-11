package cssrumi.com.github.springpetclinic.services;

import cssrumi.com.github.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
