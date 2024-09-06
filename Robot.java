public class Robot implements Participant, Robot_inter {
    protected String name;
    private final int maxRun;
    private final int maxJump;
    private int individualAbilityCount = 1; // Индивидуальное количество superRun для каждого робота
    private static int sharedAbilityCount = 3; // Общее количество superRun для всех роботов

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println(this.name + " пробежал " + distance + " м");
            return true;
        } else if (individualAbilityCount > 0) {
            // Сначала индивидуальную способность
            System.out.println(this.name + superRun() + " (индивидуальная способность)");
            individualAbilityCount--;
            return true;
        } else if (sharedAbilityCount > 0) {
            // Если индивидуальные закончились, используем общие
            System.out.println(this.name + superRun() + " (общая способность)");
            sharedAbilityCount--;
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


// Реализует поведение робота в соревновании.