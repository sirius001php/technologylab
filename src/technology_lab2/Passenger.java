package technology_lab2;

//клас Passenger наслідується від класу Boody
public class Passenger extends Boody {
    private int passenger_seats;
    private String car_class;
    public Passenger(String model, String VINnumber, BodyType body_type, int year_production,
                     int w, int h, int passenger_seats, String car_class, Location loc){
        super(model, VINnumber, body_type, year_production, w ,h, loc);
        this.passenger_seats = passenger_seats;
        this.car_class = car_class;
        this.setAllInformation("model: " + model + " VIN number: " + VINnumber + " Year production: " + year_production
                + " width body car: " + w + " height body car: " + h + ". Car has a class: " + car_class + ";" +
                " number of passenger seats " + passenger_seats + "." + loc);
    }

    public String getCar_class() {
        return car_class;
    }

    public void setCar_class(String car_class) {
        this.car_class = car_class;
    }

    public void setPassenger_seats(int passenger_seats) {
        this.passenger_seats = passenger_seats;
    }

    public int getPassenger_seats() {
        return passenger_seats;
    }
}
