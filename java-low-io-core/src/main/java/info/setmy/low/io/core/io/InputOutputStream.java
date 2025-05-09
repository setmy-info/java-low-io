package info.setmy.low.io.core.io;

import lombok.Builder;

import java.io.InputStream;
import java.io.OutputStream;

@Builder(toBuilder = true)
public record InputOutputStream(InputStream in, OutputStream out) {
}
