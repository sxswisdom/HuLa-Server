package com.hula.ai.llm.openai.function;

import java.util.function.Function;

/**
 * 描述：key 的获取策略
 * jdk默认实现
 *
 * @see Function
 */
@FunctionalInterface
public interface KeyStrategyFunction<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);

}
