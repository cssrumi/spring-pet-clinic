package cssrumi.com.github.springpetclinic.services.map;

import cssrumi.com.github.springpetclinic.model.Visit;
import cssrumi.com.github.springpetclinic.services.OwnerService;
import cssrumi.com.github.springpetclinic.services.PetService;
import cssrumi.com.github.springpetclinic.services.PetTypeService;
import cssrumi.com.github.springpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    private PetService petService;
    private PetTypeService petTypeService;
    private OwnerService ownerService;

    public VisitMapService(PetService petService, PetTypeService petTypeService, OwnerService ownerService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.ownerService = ownerService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if (object != null) {
            if (object.getPet() != null) {
                if (object.getPet().getPetType() != null) {
                    if(object.getPet().getPetType().getId() == null)
                        object.getPet().setPetType(petTypeService.save(object.getPet().getPetType()));
                } else {
                    throw new RuntimeException("Pet Type is required");
                }

                if (object.getPet().getId() == null)
                    object.setPet(petService.save(object.getPet()));

                if (object.getPet().getOwner() != null) {
                    if (object.getPet().getOwner().getId() == null)
                        object.getPet().setOwner(ownerService.save(object.getPet().getOwner()));
                }
            }

            if (object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null
                    || object.getPet().getOwner().getId() == null ){
                throw new RuntimeException("Invalid Visit");
            }

            return super.save(object);
        } else
            return null;
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
