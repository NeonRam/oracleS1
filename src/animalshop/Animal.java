package animalshop;

public class Animal {
    private String breed, color;

    public Animal(String breed, String color){
        this.breed = breed;
        this.color = color;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
