package max.blackpegasus.mbppetclinic.bootstrap;

import max.blackpegasus.mbppetclinic.model.Owner;
import max.blackpegasus.mbppetclinic.model.Vet;
import max.blackpegasus.mbppetclinic.services.OwnerService;
import max.blackpegasus.mbppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mher");
        owner1.setLastName("Azizbekyan");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Lusine");
        owner2.setLastName("Shakhoyan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Avo");
        vet1.setLastName("Janibekyan");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Fuck");
        vet2.setLastName("Yu");

        vetService.save(vet2);

        System.out.println("Loaded Vets...;");

    }
}
