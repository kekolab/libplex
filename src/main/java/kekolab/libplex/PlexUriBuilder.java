package kekolab.libplex;

import java.net.URI;
import java.util.Arrays;

import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.entity.PlexItem;
import kekolab.libplex.entity.PlexMediaServer;

public class PlexUriBuilder {
    public UriBuilder fromKey(String key, PlexItem parent, PlexMediaServer server) {
        return fromKey(key, parent != null ? parent.getUri() : null, server != null ? server.getUri() : null);
    }

    public UriBuilder fromKey(String key, URI parentUri, URI serverUri) {
        UriBuilder delegate;
        if (key.startsWith("/"))
            delegate = UriBuilder.fromUri(serverUri);
        else
            delegate = UriBuilder.fromUri(parentUri);
        int index = key.indexOf("?");
        if (index == -1) {
            delegate.path(key);
        } else {
            delegate.path(key.substring(0, index));
            key = key.substring(index + 1);
            Arrays.stream(key.split("&+"))
                    .forEach(keyValue -> {
                        String[] kv = keyValue.split("=+");
                        delegate.queryParam(kv[0], kv[1]);
                    });
        }
        return delegate;
    }
}
