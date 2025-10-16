package ch45.ex9;

public record Person(String name, int age) {
    public Person{
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("age must be between 0 and 100");
        }
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name must not be null or empty");
        }
        name = name.trim();
    }
    @Override
    public String toString() {
        return "This person's name is " + name + " age " + age;
    }
}
