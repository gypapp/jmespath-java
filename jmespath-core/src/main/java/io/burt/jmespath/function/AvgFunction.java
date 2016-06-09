package io.burt.jmespath.function;

import java.util.List;

import io.burt.jmespath.Adapter;

public class AvgFunction extends ArrayMathFunction {
  @Override
  protected <T> Number performMathOperation(Adapter<T> adapter, List<T> values) {
    double sum = 0;
    int count = 0;
    for (T n : values) {
      sum += adapter.toDouble(n);
      count += 1;
    }
    return sum/count;
  }
}
