package extraWorkExercises.controllers;

import extraWorkExercises.models.Traffic;
import extraWorkExercises.services.ITrafficServices;
import extraWorkExercises.services.imp.TrafficServices;

import java.util.List;

public class TrafficController {
    private ITrafficServices iTrafficServices = new TrafficServices();
    public void addTheTruck(Traffic truck) {
        iTrafficServices.addTheTruck(truck);
    }

    public void addTheCar(Traffic car) {
        iTrafficServices.addTheCar(car);
    }

    public void addTheMotorbike(Traffic motorbike) {
        iTrafficServices.addTheMotorbike(motorbike);
    }

    public List<Traffic> showAll() {
        return iTrafficServices.showAll();
    }
    public List<Traffic> showTruckList() {
        return iTrafficServices.showTruckList();
    }
    public List<Traffic> showCarList() {
        return iTrafficServices.showCarList();
    }
    public List<Traffic> showMotorList() {
        return iTrafficServices.showMotorList();
    }

    public Traffic findControlPlate(String controlPlate) {
        return iTrafficServices.findControlPlate(controlPlate);
    }

    public void remove(String controlPlate) {
        iTrafficServices.remove(controlPlate);
    }


    public List<Traffic> searchControlPlate(String controlPlate) {
        return iTrafficServices.searchControlPlate(controlPlate);
    }
}
