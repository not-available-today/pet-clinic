package max.blackpegasus.mbppetclinic.services;

import max.blackpegasus.mbppetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
