package max.blackpegasus.mbppetclinic.services;

import max.blackpegasus.mbppetclinic.model.Owner;
import max.blackpegasus.mbppetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
