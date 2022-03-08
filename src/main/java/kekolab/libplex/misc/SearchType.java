package kekolab.libplex.misc;

public enum SearchType {
    MOVIE(1), SHOW(2), SEASON(3), EPISODE(4), ARTIST(8), ALBUM(9), TRACK(10);

    private int type;

    SearchType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
