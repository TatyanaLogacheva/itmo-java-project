package laba3;

public class House {
    private int floorCount;
    private int yearBuild;
    String name;

    public void setFloorCount(int floorCount){
        this.floorCount=floorCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setYearBuild(int yearBuild){
        this.yearBuild=yearBuild;
    }
    public int getYearBuild(){
        return  yearBuild;
    }
    public void setName( String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
     public int CountYear(int yearNow, int yearBuild){
        return yearNow-yearBuild;
     }

}
