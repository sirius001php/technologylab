package technology_lab2;


public enum BodyType {
    Sedan(4),
    Hatchback(5),
    Coupe(2),
    Convertible(2),
    Roadster(2),
    Stretch(5),
    SUV(5),
    Crossover(5),
    Pickup(4),
    Van(2),
    Minivan(5);
    int number_doors;
    //    конструктор
    BodyType(int num){
        this.number_doors = num;
    }
    //    перегрузка функції
    @Override
    public String toString(){
        if(this.hasSpase()){
            return " " + this.name().toLowerCase() + " with number doors - " + this.number_doors + " will be comfortable for your family";
        }
        else{
            return " " + this.name().toLowerCase() + "will be not comfortable for your family";
        }
    }
    //    функція що перевіряє кількість дверей у машині
    boolean hasSpase(){
        if (this.number_doors < 4) return false;
        else return true;
    }
}