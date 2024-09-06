public class Road implements Trials{
    int length;
    public Road(LengthRoad lengthRoad) {
        this.length = lengthRoad.getLength();
    }
    @Override
    public boolean smog (Participant participant){
        return participant.run(length);
    }
}