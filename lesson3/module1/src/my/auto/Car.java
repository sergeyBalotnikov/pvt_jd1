package my.auto;

/**
 *
 */
public class Car {

    int mileage = 0;

    boolean isServiceNeeded;

    public void driveForward() {
        mileage++;
        //mileage = mileage + 1;
        System.out.println("Mileage=" + mileage);
    }

    public void driveBackward() {
        mileage--;
        //mileage = mileage - 1;
        System.out.println("Mileage=" + mileage);
    }

    public void checkService() {
        String message;
        message = isServiceNeeded ? "Please go to car service" : "No need service";
        System.out.println(message);
    }

    int gas = 0;

    public void checkGasTank() {
        System.out.println("Gas: " + gas + "L");
    }

}
