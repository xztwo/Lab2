public enum LengthRoad {
    Low(100), Standart(300), Hard(500);
    private  int length;
    LengthRoad(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}


// Перечисление длин дорожек