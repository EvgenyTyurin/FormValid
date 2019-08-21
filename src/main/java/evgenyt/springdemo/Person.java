package evgenyt.springdemo;

import javax.validation.constraints.Size;

public class Person {

    // Validation rule
    @Size(min=3, max=20, message="Name must be 3-20 symbols")
    private String name;

    public Person() {name = "John Doe";}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter is necessary or servlet can't pass this field in controller
    public void setName(String name) {
        this.name = name;
    }
}
