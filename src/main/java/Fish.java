public class Fish extends Animal implements Printable{
    private boolean isPredator;

    public Fish(String name, int age, boolean isPredator) {
        super(name, age);
        this.isPredator = isPredator;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nis predator: " + (isPredator ? "yes" : "no"));
    }
}
