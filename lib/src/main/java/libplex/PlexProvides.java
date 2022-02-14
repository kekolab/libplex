package libplex;

public enum PlexProvides {
	PLAYER("player"), CONTROLLER("controller"), SERVER("server");

	private String plexProvides;

	private PlexProvides(String plexProvides) {
		this.plexProvides = plexProvides;
	}

	public String getPlexProvides() {
		return plexProvides;
	}

}
