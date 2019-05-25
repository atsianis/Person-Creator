public class Person {
    
    private String name;
    private int age;
    private String color;
    private String sport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    
    public void setAll(String name, int age, String color, String sport){
        this.name = name; //enallaktika tha mporousame na kalesoume tin setName(name)
        this.age = age;
        this.color = color;
        this.sport = sport;
    }
}
