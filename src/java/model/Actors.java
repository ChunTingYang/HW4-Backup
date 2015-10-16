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
    }
    
    public Actors(int actorsID, String actorsName, int age, String birthday, String nationality) {
        this.actorsID = actorsID;
        this.actorsName = actorsName;
        this.age = age;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public int getActorsID() {
        return actorsID;
    }

    public void setActorsID(int actorsID) {
        this.actorsID = actorsID;
    }

    public String getActorsName() {
        return actorsName;
    }

    public void setActorsName(String actorsName) {
        this.actorsName = actorsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Actors{" + "actorsID=" + actorsID + ", actorsName=" + actorsName + ", age=" + age + ", birthday=" + birthday + ", nationality=" + nationality + '}';
    }


}
