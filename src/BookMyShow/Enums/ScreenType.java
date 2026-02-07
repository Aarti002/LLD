package BookMyShow.Enums;

public enum ScreenType {
    SCREEN_2D(150),
    SCREEN_3D(250),
    SCREEN_4DX(350);

    public final int val;

    ScreenType(int val) {
        this.val = val;
    }
}