package kekolab.libplex;

import java.util.Arrays;

import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.entity.MediaContainerPlexItem;
import kekolab.libplex.entity.ServerContent;

public class PlexUriBuilder {
    public static UriBuilder fromKey(String key, MediaContainerPlexItem parent, ServerContent server) {
        UriBuilder delegate;
        if (key.startsWith("/"))
            delegate = UriBuilder.fromUri(server.getUri());
        else
            delegate = UriBuilder.fromUri(parent.getUri());

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
