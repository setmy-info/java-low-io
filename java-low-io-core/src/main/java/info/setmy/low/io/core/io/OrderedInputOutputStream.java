package info.setmy.low.io.core.io;

import info.setmy.low.io.core.exception.LowIOException;
import info.setmy.low.io.core.models.records.cells.Cell;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class OrderedInputOutputStream<T> {

    public abstract void read(Cell<T> data, InputOutputStream ios);

    public abstract void write(Cell<T> data, InputOutputStream toInputOutputStream);

    protected byte[] read(byte[] toBytes, InputStream inputStream) {
        try {
            inputStream.read(toBytes);
        } catch (IOException e) {
            throw new LowIOException(e);
        }
        return toBytes;
    }

    protected void write(byte[] value, OutputStream outputStream) {
        try {
            outputStream.write(value);
        } catch (IOException e) {
            throw new LowIOException(e);
        }
    }
}
