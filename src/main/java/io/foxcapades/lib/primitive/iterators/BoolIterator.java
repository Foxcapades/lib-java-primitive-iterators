package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class BoolIterator implements Iterable<Boolean> {
  private final boolean[] value;

  private int position;

  public BoolIterator(boolean... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public boolean next() {
    return value[position++];
  }

  @Override
  public Iterator<Boolean> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
