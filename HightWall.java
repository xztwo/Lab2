public enum HightWall {
    Low(1), Standart(3), Hard(5);
    private  int height;
    HightWall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

// Перечисление высот стен