package libplex.plextv.entity;

import java.io.IOException;

public interface WithDetails<A> {
    A fetchDetails() throws IOException;
}
