public interface inter extends Participant {
    default String superRun() {
        return " пробежал с помощью способности";
    }
}

// Содержат метод superRun, который позволяет участнику пробежать с помощью особой способности.