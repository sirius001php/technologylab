package technology_lab2;

public class Location implements Loc{
    private String Country;
    private String City;
    private String NameFactory;
    public Location(String location, String Name) {
        String[] temp = location.split(" ");
        this.Country= temp[0];
        StringBuilder loc = new StringBuilder();
        for(int i = 1 ; i < temp.length; i++){
            loc.append(temp[i]);
            if(i != temp.length - 1) {
                loc.append(" ");
            }
        }

        this.Country = loc.toString();
        this.NameFactory = Name;
    }

    public Location(String country, String city, String Name) {
        this.Country = country;
        this.City = city;
        this.NameFactory = Name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCity() {
        return City;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setNameFactory(String nameFactory) {
        NameFactory = nameFactory;
    }

    public String getNameFactory() {
        return NameFactory;
    }
    public String getFullLocation(){
        return " " + this.Country + " " + this.City;
    }
    @Override
    public String toString() {
        return getFullLocation() + " " + this.NameFactory;
    }
}
