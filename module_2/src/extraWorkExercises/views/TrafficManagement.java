package extraWorkExercises.views;

import extraWorkExercises.controllers.TrafficController;
import extraWorkExercises.models.Traffic;

import java.util.List;

public class TrafficManagement {
    private TrafficController trafficController = new TrafficController();
    public List<Traffic> showAll() {
        return trafficController.showAll();
    }
    public List<Traffic> showTruckList() {
        return trafficController.showTruckList();
    }
    public List<Traffic> showCarList() {
        return trafficController.showCarList();
    }
    public List<Traffic> showMotorList() {
        return trafficController.showMotorList();
    }

    public Traffic findControlPlate(String controlPlate) {
        return trafficController.findControlPlate(controlPlate);
    }

    public void remove(String controlPlate) {
        trafficController.remove(controlPlate);
    }


    public List<Traffic> searchControlPlate(String controlPlate) {
        return trafficController.searchControlPlate(controlPlate);
    }
}
