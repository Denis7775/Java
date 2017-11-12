package Java_2_Person;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man) {
            if (this.spouse != person) {
                if (this.spouse != null && this.spouse.divorce()) {       //if the spouse of this is null then make null only this
                    this.divorce();                                       //if the spouse of this != null then make null the spouse too too
                }
                if (person.spouse != null && person.spouse.divorce()) {   //if the spouse of person is null then make null only person
                    person.divorce();                                     //if the spouse of person != null then make null person spouse too
                }

                this.spouse = person;
                person.spouse = this;

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean divorce() {
        if (this.spouse == null) {
            return false;
        } else {
            this.spouse = null;
            return true;
        }
    }
}