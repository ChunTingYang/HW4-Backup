package model;

public class Actors {
    private int actorsID;
    private String actorsName;
    private int age;
    private String birthday;
    private String nationality;

    public Actors() {
        this.actorsID = 0;
        this.actorsName = "";
        this.age = 0;
        this.birthday = "";
        this.nationality = "";
    
    public Actors(int actorsID, String actorsName, int age, String birthday, String nationality) {
        this.actorsID = actorsID;
        this.actorsName = actorsName;
        this.age = age;
        this.birthday = birthday;
        this.nationality = nationality;
    }
    
    
}
