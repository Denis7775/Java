package Reflection;

public class From {
    private Integer age;
    private Object name;
    private String lastname;
    private Double height;
    private Number numOfWifes;
    private Boolean gender;
    private Boolean isAwesome;

    public From(Integer age, Object name, String lastname,
                Double height,
                Number numOfWifes, Boolean gender, Boolean isAwesome) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.numOfWifes = numOfWifes;
        this.gender = gender;
        this.isAwesome = isAwesome;
    }

    public Integer getAge() {
        return age;
    }

    public Object getName() {
        return name;
    }

    public String getSurname() {
        return lastname;
    }

    public Double getHeight() {
        return height;
    }

    public Number getWifeNumber() {
        return numOfWifes;
    }

    public Boolean getGender() {
        return gender;
    }

    public Boolean getAwesome() {
        return isAwesome;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setSurname(String lastname) {
        this.lastname = lastname;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWifeNumber(Number numOfWifes) {
        this.numOfWifes = numOfWifes;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setAwesome(Boolean isAwesome) {
        this.isAwesome = isAwesome;
    }

    @Override
    public String toString() {
        try {
            return this.getClass().getDeclaredField("age").getType() + " age: " + age + "\n" +
                    this.getClass().getDeclaredField("name").getType() + " name: " + name + "\n" +
                    this.getClass().getDeclaredField("lastname").getType() + " lastname: " + lastname + "\n" +
                    this.getClass().getDeclaredField("height").getType() + " height: " + height + "\n" +
                    this.getClass().getDeclaredField("numOfWifes").getType() + " numOfWifes: " + numOfWifes + "\n" +
                    this.getClass().getDeclaredField("gender").getType() + " gender: " + gender + "\n" +
                    this.getClass().getDeclaredField("isAwesome").getType() + " isAwesome: " + isAwesome;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}
