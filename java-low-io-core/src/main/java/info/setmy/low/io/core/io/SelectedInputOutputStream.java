package info.setmy.low.io.core.io;

public record SelectedInputOutputStream(
    OrderedInputOutputStream<Byte> byteOrderedInputOutputStream,
    OrderedInputOutputStream<Character> characterOrderedInputOutputStream,
    OrderedInputOutputStream<Short> shortOrderedInputOutputStream,
    OrderedInputOutputStream<Integer> integerOrderedInputOutputStream
    // TODO : etc
) {

    public static final SelectedInputOutputStream BIG_ENDIAN = new SelectedInputOutputStream(
        info.setmy.low.io.core.io.bigendian.ByteOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.bigendian.CharacterOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.bigendian.ShortOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.bigendian.IntegerOrderedInputOutputStream.INSTANCE
    );

    public static final SelectedInputOutputStream LITTLE_ENDIAN = new SelectedInputOutputStream(
        info.setmy.low.io.core.io.littleendian.ByteOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.littleendian.CharacterOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.littleendian.ShortOrderedInputOutputStream.INSTANCE,
        info.setmy.low.io.core.io.littleendian.IntegerOrderedInputOutputStream.INSTANCE
    );

}
