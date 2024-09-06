public class Wall implements Trials{
    int height;
    public Wall(HightWall hightWall) {
        this.height = hightWall.getHeight();
    }
    @Override
    public boolean smog (Participant participant){
        return participant.jump(height);
    }
}
