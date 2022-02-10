package libplex;

public enum PlexProvides {
    PLAYER("player"), CONTROLLER("controller"), SERVER("server");

    private String plexProvides;

    private PlexProvides(String plexProvides) {
        setPlexProvides(plexProvides);
    }

    public String getPlexProvides() {
        return plexProvides;
    }

    private void setPlexProvides(String plexProvides) {
        this.plexProvides = plexProvides;
    }

}
