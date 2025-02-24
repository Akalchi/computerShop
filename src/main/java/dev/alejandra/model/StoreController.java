package dev.alejandra.model;

import java.util.List;

public class StoreController {

    private Store store;
        
    public StoreController(Store store) {
        this.store = store;
    }
        
    public void addComputer(Computer computer) {
        store.getComputers().add(computer);
    }

     public List<Computer> getComputers() {
        return store.getComputers();
    }
}
