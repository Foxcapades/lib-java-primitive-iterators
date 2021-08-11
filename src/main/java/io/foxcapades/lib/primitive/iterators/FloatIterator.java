package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class FloatIterator implements Iterable<Float> {
  private final float[] value;

  private int position;

  public FloatIterator(float... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public float next() {
    return value[position++];
  }

  @Override
  public Iterator<Float> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
