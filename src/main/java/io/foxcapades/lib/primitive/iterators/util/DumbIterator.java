package io.foxcapades.lib.primitive.iterators.util;

import io.foxcapades.lib.primitive.fn.BoolSupplier;

import java.util.Iterator;
import java.util.function.Supplier;

public class DumbIterator<T> implements Iterator<T> {
  private final BoolSupplier hasNext;
  private final Supplier<T> next;

  public DumbIterator(BoolSupplier hasNext, Supplier<T> next) {
    this.hasNext = hasNext;
    this.next    = next;
  }

  @Override
  public boolean hasNext() {
    return hasNext.get();
  }

  @Override
  public T next() {
    return next.get();
  }
}
