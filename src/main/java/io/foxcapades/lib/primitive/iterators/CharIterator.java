package io.foxcapades.lib.primitive.iterators;

import io.foxcapades.lib.primitive.iterators.util.DumbIterator;

import java.util.Iterator;
import java.util.Objects;

public class CharIterator implements Iterable<Character> {
  private final char[] value;

  private int position;

  public CharIterator(char... values) {
    this.value = Objects.requireNonNull(values);
  }

  public boolean hasNext() {
    return position + 1 < value.length;
  }

  public char next() {
    return value[position++];
  }

  @Override
  public Iterator<Character> iterator() {
    return new DumbIterator<>(this::hasNext, this::next);
  }
}
