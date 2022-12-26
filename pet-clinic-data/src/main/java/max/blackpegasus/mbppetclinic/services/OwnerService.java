package max.blackpegasus.mbppetclinic.services;

import max.blackpegasus.mbppetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
