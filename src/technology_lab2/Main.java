package technology_lab2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Location loc = new Location("Germany", "Berlin", "KA150");
        Car avtopark = new Car("Volkswagen");
        avtopark.addBody(new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc));
        avtopark.addBody(new Passenger("Passat", "KTA22340055556333", BodyType.Sedan, 2015, 1832, 4767, 5, "D", loc));
        avtopark.addBody(new Passenger("Passat", "ZXC22340123556333", BodyType.Stretch, 2012, 1832, 4867, 5, "D", loc));
        avtopark.addBody(new Passenger("Golf", "MLA22340200356744", BodyType.Convertible, 2019, 1709, 4084, 4, "C", loc));
        avtopark.addBody(new Truck("Caddy", "PZEL2340200356744", BodyType.Van, 2010, 1794, 4876, 750, loc));
        avtopark.addBody(new Truck("Transporter", "PlEF234FE00M6744", BodyType.Pickup, 2010, 1904, 5292, 2050, loc));
        printInfo(avtopark);

        Car avtopark2 = new Car("BMW");
        avtopark.addBody(new Passenger("E39", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc));
        avtopark.addBody(new Passenger("X5", "KTA22340055556333", BodyType.Sedan, 2015, 1832, 4767, 5, "D", loc));
        printInfo(avtopark);

        if(avtopark.equals(avtopark2)) {
            System.out.println("Opps, this is not different mark!");
        }
    }
    //    виводить всю інформацію на екран
    public static void printInfo(Car cars){
        System.out.println("Hi, below you can see some information about the body of different models of the brand " + cars.getMark() + ":");
        Iterator iterator = cars.getBodies().iterator();
        while (iterator.hasNext()) {
            Boody boody = (Boody) iterator.next();
            System.out.println(boody.toString());
        }
    }
}


