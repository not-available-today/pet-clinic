package max.blackpegasus.mbppetclinic.services.map;

import max.blackpegasus.mbppetclinic.model.Vet;
import max.blackpegasus.mbppetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findALl();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findByID(Long id) {
        return findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
