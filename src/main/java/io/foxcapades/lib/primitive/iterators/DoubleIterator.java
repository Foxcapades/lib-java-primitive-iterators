package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class DoubleIterator implements Iterable<Double> {
  private final double[] value;

  private int position;

  public DoubleIterator(double... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public double next() {
    return value[position++];
  }

  @Override
  public Iterator<Double> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
