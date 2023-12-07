package case_study.controllers;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.IEmployeeService;
import case_study.services.IFacilityService;
import case_study.services.impl.EmployeeService;
import case_study.services.impl.FacilityService;

import java.util.Map;

public class FacilityController {
    public static IFacilityService iFacilityService= new FacilityService();

    public Map<Facility,Integer> display() {
        return iFacilityService.displayFacility();
    }

    public void addVilla(Villa villa) {
        iFacilityService.addVilla(villa);
    }

    public void addHouse(House house) {
        iFacilityService.addHouse(house);
    }

    public void addRoom(Room room) {
        iFacilityService.addRoom(room);
    }

    public Map<Facility,Integer> listMaintenance() {
        return iFacilityService.listMaintenance();
    }

    public Facility findIdService(String idService) {
        return iFacilityService.findIdService(idService);
    }



    public void delFacility(Facility facility) {
        iFacilityService.delFacility(facility);
    }
}
