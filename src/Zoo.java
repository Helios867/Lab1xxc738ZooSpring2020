public class Zoo {

    private String zooName;
    private Zone[] zone;

    /**
     *
     * @param zooName
     * @param zone
     */
    Zoo(String zooName, int num){
        this.zooName = zooName;
        //this.zone = zone;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return String.format("Welcome to the " +zooName+ "!\n");
    }

    /**
     *
     * @param zone
     */
    public void addZone(Zone zone){


    }
}
