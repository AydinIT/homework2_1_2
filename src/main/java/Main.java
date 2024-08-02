public class Main {
    public static void main(String[] args) {

        Printable[] printables = new Printable[]{createObject("Bird"), createObject("Fish"), createObject("Reptile")};

        for (Printable printable : printables) {
            printable.print();
            System.out.println("----------------------");
        }



    }

    public static Printable createObject(String className){
        if (className == "Bird"){
            return new Bird("Sparrow", 1, true);
        } else if (className == "Fish") {
            return new Fish("Shark", 4, true);
        } else if (className == "Reptile") {
            return new Reptile("Python", 3, false);
        }
        else return null;
    }
}