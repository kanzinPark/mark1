package minecraft.animal;

public class Pig extends Animals implements AbstractAnimal{

    public void sound() {
        System.out.println("짚을 먹습니다");
    }

    public void eat() {
        System.out.println("꿀꿀");
    }
}
