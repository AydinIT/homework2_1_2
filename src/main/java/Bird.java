public class Bird extends Animal implements Printable{
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\ncan fly: " + (canFly ? "yes" : "no"));
    }
}
