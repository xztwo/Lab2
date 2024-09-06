public class Cat implements Participant, Robot_inter {
    protected String name;
    private final int maxRun;
    private final int maxJump;
    private int abilityCount = 1; // Индивидуальное количество superRun для кота

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println(this.name + " пробежал " + distance + " м");
            return true;
        } else if (abilityCount > 0) {
            System.out.println(this.name + superRun());
            abilityCount--;
            return true;
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " м и выбывает");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println(this.name + " перепрыгнул " + height + " м");
            return true;
        } else {
            System.out.println(this.name + " не перепрыгнул " + height + " м и выбывает");
            return false;
        }
    }
}