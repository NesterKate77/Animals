import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animals> animals = new ArrayList<>();
        Fish shark = new Fish("Shark", "I eat people");
        animals.add(shark);
        Fish clownFish = new Fish("ClownFish", "I am colorful");
        animals.add(clownFish);
        Birds sparrow = new Birds("Sparrow", "I tweet");
        animals.add(sparrow);
        Birds eagle = new Birds("Eagle", "I have a sharp beak");
        animals.add(eagle);
        Beasts elephant = new Beasts("Elephant", "I have a trunk");
        animals.add(elephant);
        Beasts wolf = new Beasts("Wolf", "I howl");
        animals.add(wolf);

        for (int i = 0; i<animals.size(); i++){
            System.out.println(i+1 +". "+ animals.get(i).getName());
        }
        System.out.println("Выберите номер животного от 1 до 6");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number +". "+ animals.get(number-1));
    }

}