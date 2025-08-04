package minecraft.animal;

public class Cow extends Animals implements AbstractAnimal{

    public void sound() {
        System.out.println("음메");
    }

    public void eat() {
        System.out.println("풀을 먹습니다");
    }
}
