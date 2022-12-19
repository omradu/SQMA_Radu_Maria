

public class Animal {
    private String name;
    private int kg;

    public Animal(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    public Animal() {
        this.name = "Animal";
        this.kg = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public String animalType() {
        if( this.kg < 10){
            return "Small";
        } else if(this.kg >= 10 && this.kg < 45) {
            return "Medium";
        } else {
            return "Big";
        }
    }
}