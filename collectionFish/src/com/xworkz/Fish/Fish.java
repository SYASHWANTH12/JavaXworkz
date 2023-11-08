package com.xworkz.Fish;


import java.util.function.BiConsumer;
@FunctionalInterface
public interface Fish extends BiConsumer {
	public void accept(Object t, Object u);
}
