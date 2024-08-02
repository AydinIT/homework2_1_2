public class Reptile extends Animal implements Printable{
    private boolean isPoisonous;

    public Reptile(String name, int age, boolean isPoisonous) {
        super(name, age);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nis poisonous: " + (isPoisonous ? "yes" : "no"));
    }
}
