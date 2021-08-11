package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class IntIterator implements Iterable<Integer> {
  private final int[] value;

  private int position;

  public IntIterator(int... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public int next() {
    return value[position++];
  }

  @Override
  public Iterator<Integer> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
