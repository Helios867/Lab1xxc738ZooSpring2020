public class Zone {

    private String zoneName;
    private Animal[] animal;

    /**
     *
     * @param zoneName
     * @param animal
     */
    Zone(String zoneName, int num){
        this.zoneName = zoneName;
        //this.animal = animal;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.format(zoneName+ ": \n" +
                ">> " +animal+"\n");
    }

    /**
     *
     * @param animal
     */
    public void addAnimal(Animal animal){

    }
    public String getZoneName(){
        return this.zoneName;
    }
    public Animal[] getAnimal(){
        return this.animal;
    }
    public void setZoneName(String name){
        this.zoneName = name;
    }
    public void setAnimal(Animal[] animalName){
        this.animal = animalName;
    }

}
