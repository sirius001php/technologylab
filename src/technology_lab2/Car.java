package technology_lab2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//    клас вякий ми записуємо марку машини, а також створюємо ArrayList обєктів класу Boody
public class Car {
    private String mark;
    private ArrayList<Boody> bodies;
    private int price;

    public Car (String mark, int price){
        this.price = price;
        this.mark = mark;
        bodies = new ArrayList<Boody>();
    }
    public Car(String mark){
        this.price = 1000;
        this.mark = mark;
        bodies = new ArrayList<Boody>();
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getMark(){
        return this.mark;
    }

    public Boody getBoody(int i){
        return bodies.get(i);
    }

    public void addBody(Boody b){
        bodies.add(b);
    }

    public int getSize(){
        return bodies.size();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Boody> getBodies(){
        return bodies;
    }

    public int getTotalPrice(){
        return bodies.stream().mapToInt(Boody::getPrice).sum() + getPrice();
    }

    public ArrayList<Boody> getTypeOfBody(Predicate<? super Boody> predicate){
        ArrayList<Boody> typeBody = new ArrayList<>();
        for(Boody obj: this.getBodies()){
            if(predicate.test(obj)){
                typeBody.add(obj);
            }
        }
        System.out.println("Price of all Truck bodies in autopark is" +
                typeBody.stream().mapToInt(Boody::getPrice).sum());
        return typeBody;
    }

    public Optional<Boody> getMaxPrice(){
        return bodies.stream().max(Comparator.comparing(Boody::getPrice));
    }

    public double getAveragePrice(){
        return bodies.stream().mapToInt(Boody::getPrice).average().orElse(0);
    }

    public Map<String, List<Boody>> getBodiesByPrice(){
        return bodies.stream().collect(Collectors.groupingBy(body -> body.price <= 1500 ?
                "Body price is less the 1500 USD" : "Body price is higher than 1500 USD"));
    }

    public List<BodyType> getBodyType(){
        return bodies.stream().filter(body -> body instanceof Truck).map(truck ->
                ((Truck) truck).getBody_type()).collect(Collectors.toList());
    }






}

