package technology_lab2;

//клас Truck наслідується від класу Boody
public class Truck extends Boody {
    private int load_capacity;
    public Truck(String model, String VINnumber, BodyType body_type, int year_production,
                 int w, int h,int load_capacity, Location loc){
        super(model, VINnumber, body_type, year_production, w ,h, loc);
        this.load_capacity = load_capacity;
        this.setAllInformation("model: " + model + " VIN number: " + VINnumber + " Year production: " + year_production
                + " width body car: " + w + " height body car: " + h + ". Load capacity:" + load_capacity + "." + loc);
    }

    public void setLoad_capacity(int load_capacity) {
        this.load_capacity = load_capacity;
    }

    public int getLoad_capacity() {
        return load_capacity;
    }
}




