package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class ShortIterator implements Iterable<Short> {
  private final short[] value;

  private int position;

  public ShortIterator(short... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public short next() {
    return value[position++];
  }

  @Override
  public Iterator<Short> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
