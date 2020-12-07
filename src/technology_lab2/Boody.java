package technology_lab2;

//    абстрактний клас Boody в середині якого ми оголошуємо клас  AllInformation
public abstract class Boody {
    protected String VINnumber;
    BodyType body_type;
    private int year_production;
    private int width;
    private int height;
    private String model;
    private Location location;
    //    клас AllInformation створений для зберігання всієї інформації
    private class AllInformation {
        private String info;
        private String const_type;

        public AllInformation(String info, String const_type) {
            this.info = info;
            this.const_type = const_type;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void setConst_type(String const_type) {
            this.const_type = const_type;
        }

        public String getConst_type() {
            return const_type;
        }

        public String getInfo() {
            return this.info + this.const_type;
        }
    }
    private AllInformation allInformation;

    public Boody (String model, String VINnumber, BodyType type, int year_production, int width, int height, Location loc){
        this.model = model;
        this.VINnumber = VINnumber;
        this.body_type = type;
        this.year_production = year_production;
        this.width = width;
        this.height = height;
        this.location = loc;
        this.allInformation = new AllInformation("model: " + model + " VIN number: " + VINnumber + " Year production: " + year_production
                + " width body car: " + width + " height body car: " + height + " ", type + "." + loc);
    }

    public void setAllInformation(String info) {
        this.allInformation.setInfo(info);
    }

    public AllInformation getAllInformation() {
        return allInformation;
    }

    public void setVINnumber(String VINnumber) {
        this.VINnumber = VINnumber;
    }

    public String getVINnumber() {
        return VINnumber;
    }

    public void setBody_type(BodyType body_type) {
        this.body_type = body_type;
    }

    public BodyType getBody_type() {
        return body_type;
    }

    public void setYear_production(int year_production) {
        this.year_production = year_production;
    }

    public int getYear_production() {
        return year_production;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return allInformation.getInfo();
    }

    @Override
    public int  hashCode() {
        int hash_code = 0;
        for (char ch: (model+width+height+VINnumber).toCharArray()) {
            hash_code += (int)ch;
        }
        return hash_code + getYear_production();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return hashCode() == obj.hashCode();
    }
}
