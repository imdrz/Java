package FinalProject;

public class GameObject {
    private int[] pos;
    private int type;

    public GameObject(int x, int y, int t) {
        this.pos = new int[]{x, y};
        this.type = t;
    }

    public GameObject(int t) {
        this.pos = new int[]{0, 0};
        this.type = t;
    }
}
