package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.services.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> displayFacility() {
        return iFacilityRepository.displayFacility();
    }

    @Override
    public void addVilla(Villa villa) {
        iFacilityRepository.addVilla(villa);
    }

    @Override
    public void addHouse(House house) {
        iFacilityRepository.addHouse(house);
    }

    @Override
    public void addRoom(Room room) {
        iFacilityRepository.addRoom(room);
    }

    @Override
    public Map<Facility, Integer> listMaintenance() {
        return iFacilityRepository.listMaintenance();
    }

    @Override
    public Facility findIdService(String idService) {
        return iFacilityRepository.findIdService(idService);
    }

    @Override
    public void delFacility(Facility facility) {
        iFacilityRepository.delFacility(facility);
    }


}
