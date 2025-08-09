package minecraft.animal;

public abstract class Animals {

    private boolean isFull;

    public void move() {
        System.out.println("움직입니다");
    }

    public void sound() {
        System.out.println("울음소리");
    }

    public void eat() {
        System.out.println("냠");
    }


    public boolean die() {
        return true;
    }

    public boolean isFull() {
        return isFull;
    }

    public void love(Animals animal) {
        if (!this.getClass().equals(animal.getClass())) {
            return;
        }

        if (this.isFull && animal.isFull) {
            System.out.println("❤️");
        } else {
            System.out.println();
        }
    }

    public void dropItems() {
        if (die()) {
            System.out.println("아이템을 드롭합니다.");
        }
    }
}
