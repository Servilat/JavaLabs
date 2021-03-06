package objects.Transport.Status;

/**
 * Class that defines ship status.
 *
 * @author Yauheni
 * @version 1.0
 */
public enum ShipStatus {
    ON_WAY("On way"), LOADING("Loading"), UNLOADING("Unloading"), IN_QUEUE("In queue");

    ShipStatus(String status) {
        this.status = status;
    }

    String status;

    public String getStatus() {
        return status;
    }
}