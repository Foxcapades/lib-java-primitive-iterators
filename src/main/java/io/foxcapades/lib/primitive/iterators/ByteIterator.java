package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class ByteIterator implements Iterable<Byte> {
  private final byte[] value;

  private int position;

  public ByteIterator(byte... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public byte next() {
    return value[position++];
  }

  @Override
  public Iterator<Byte> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
