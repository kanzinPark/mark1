package minecraft.animal;

public class Chicken extends Animals implements AbstractAnimal{

    public void sound() {
        System.out.println("꼬끼오");
    }

    public void eat() {
        System.out.println("씨앗을 먹습니다");
    }

}
