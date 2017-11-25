package Reflection;

public class To {
    private Integer age;
    private Object name;
    private String lastname;
    private String weight;
    private Number numOfWifes;
    private Boolean gender;
    private Boolean isCar;

    public To(Integer age, Object name, String lastname,
              String weight, Number numOfWifes, Boolean gender, Boolean isCar) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.weight = weight;
        this.numOfWifes = numOfWifes;
        this.gender = gender;
        this.isCar = isCar;
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

    public String getWeight() {
        return weight;
    }

    public Number getWifeNumber() {
        return numOfWifes;
    }

    public Boolean getGender() {
        return gender;
    }

    public Boolean getCar() {
        return isCar;
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

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setWifeNumber(Number numOfWifes) {
        this.numOfWifes = numOfWifes;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setCar(Boolean Car) {
        this.isCar = Car;
    }

    @Override
    public String toString() {
        try {
            return  this.getClass().getDeclaredField("age").getType() + " age: " + age + "\n" +
                    this.getClass().getDeclaredField("name").getType() + " name: " + name + "\n" +
                    this.getClass().getDeclaredField("lastname").getType() + " lastname: " + lastname + "\n" +
                    this.getClass().getDeclaredField("weight").getType() + " weight: " + weight + "\n" +
                    this.getClass().getDeclaredField("numOfWifes").getType() + " numOfWifes: " + numOfWifes + "\n" +
                    this.getClass().getDeclaredField("gender").getType() + " gender: " + gender + "\n" +
                    this.getClass().getDeclaredField("isCar").getType() + " isCar: " + isCar;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

}
