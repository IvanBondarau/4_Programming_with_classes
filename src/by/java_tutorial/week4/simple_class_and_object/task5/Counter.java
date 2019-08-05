package by.java_tutorial.week4.simple_class_and_object.task5;

import java.util.Random;

public class Counter {
	
	private static final int DEFAULT = 3; 
	
	private Random rnd;
	
	private int minValue;
	private int maxValue;

	private int value;
	
	public Counter() {
		rnd = new Random();
		
		this.minValue = -DEFAULT;
		this.maxValue = DEFAULT;

		this.value = 0;
	}
	
	public Counter(int minValue, int maxValue) {
		rnd = new Random();
		
		if (minValue > maxValue) {
			this.maxValue = DEFAULT;
			this.minValue = -DEFAULT;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}
		
		this.setValue(0);

	}
	
	public Counter(int minValue, int maxValue, int value) {
		rnd = new Random();
		
		if (minValue > maxValue) {
			this.maxValue = DEFAULT;
			this.minValue = -DEFAULT;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}
		
		this.setValue(value);
	}
	
	public boolean setValue(int value) {
		if (value > this.maxValue) {
			this.value = this.maxValue;
			return false;
		} else if (value < this.minValue) {
			this.value = this.minValue;
			return true;
		} else {
			this.value = value;
			return true;
		}
	}
	
	public int get() {
		return this.value;
	}
	
	public void inc() {
		if (value == maxValue) {
			value = minValue;
		} else {
			value++;
		}
	}
	
	public void dec() {
		if (value == minValue) {
			value = maxValue;
		} else {
			value--;
		}
	}
	
	public void setRandom() {
		int range = maxValue - minValue + 1;
		
		this.value = rnd.nextInt(range) + minValue;
		
	}
	
	
}
