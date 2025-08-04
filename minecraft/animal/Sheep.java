package minecraft.animal;

public class Sheep extends Animals implements AbstractAnimal{

    public void sound() {
        System.out.println("메에~");
    }

    public void eat() {
        System.out.println("풀을 먹습니다");
    }
}
