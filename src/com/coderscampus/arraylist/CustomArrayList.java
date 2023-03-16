package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int sizeCntr= 0;

	@Override
	public boolean add(T item) {
		if(sizeCntr == items.length) {
			items = sizeIncrease();
		}
		items[sizeCntr] = item;
		sizeCntr++;
		return true;
	}
	
	private Object[] sizeIncrease() {
		Object[] newSize = new Object[sizeCntr * 2];
		for(int i = 0; i < sizeCntr; i++) {
			newSize[i] = items[i];
		} return newSize;
	}

	@Override
	public int getSize() {
		return sizeCntr;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if(index >= sizeCntr) throw new IndexOutOfBoundsException("Index out of bounds");
		return(T) items[index];
	}
	
}
