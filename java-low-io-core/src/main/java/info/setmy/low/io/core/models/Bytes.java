package info.setmy.low.io.core.models;

import static java.util.Arrays.copyOfRange;

public record Bytes(byte[] value) {

    public Bytes copy(Range range) {
        return new Bytes(
            copyOfRange(
                value,
                range.from(),
                range.to()
            )
        );
    }
}
