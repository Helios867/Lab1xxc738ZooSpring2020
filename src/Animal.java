public class Animal {

    private String animalName;
    private String animalType;
    private boolean carnivore;

    /**
     *
     * @param animalName
     * @param animalType
     * @param carnivore
     */
    Animal(String animalName, String animalType, boolean carnivore){
        this.animalName = animalName;
        this.animalType = animalType;
        this.carnivore = carnivore;
    }

    /**
     *
     * @return
     */
    //public String toString(){ }

    public String getAnimalName(){
        return this.animalName;
    }
    public String getAnimalType(){
        return this.animalType;
    }
    public boolean getCarnivore(){
        return this.carnivore;
    }

    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }
    public void setAnimalType(String animalType){
        this.animalType=animalType;
    }
    public void setCarnivore(boolean carnivore){
        this.carnivore = carnivore;
    }

}


