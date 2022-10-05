package com.arraylist.methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import createdexception.CreatedException;
import com.arraylist.runner.ArrayListRunner;
public class ArrayListMethod1<T> {
	public  <T> List<T> getArrayList(T type) {
		List<T> list=new ArrayList<T>();
		return  list;
	}
	public void nullCheck(Object element) throws CreatedException {
		if(Objects.isNull(element)) {
			throw new CreatedException("The type passed is null.");
		}
	}
	
	public void stringAvailablity(List<T> list,String name) throws CreatedException {
		nullCheck(list);
		nullCheck(name);
		if(list.indexOf(name)==-1) {
			throw new CreatedException("The String passed is not availabe.");
		}
	}
	
	public void indexBoundException(List<T> list,int startIndex,int endINdex) throws CreatedException {
		int listSize=getSize(list);
		if(startIndex>endINdex || startIndex<0 || endINdex>listSize) {
			throw new CreatedException("One of the Index given is lower/higher than the size of the list given.");
		}
	}
	
	public void indexInAppropriate(int startIndex,int endIndex) throws CreatedException {
		if(startIndex>endIndex || startIndex<0) {
			throw new CreatedException("The Index given is lower/higher than the size of the list given.");
		}
	}
	public  int getSize(List<?> list)throws CreatedException {
		nullCheck(list);
		return list.size();
	}
	
	public  List<T> getElementsAddedList(List<T> list,T... names) throws CreatedException{
		nullCheck(list);
		nullCheck(names);
		for(T name : names) {
			list.add(name);
		}
		return list;
	}
	
	public List<T> getObjectAddedList(List<T> list,int count)throws CreatedException {
		nullCheck(list);		
		for(int i=0;i<count;i++) {
			ArrayListRunner temp=new ArrayListRunner();
			list.add((T) temp);
		}
		return list;
	}
	
	public int getFirstIndexOf(List<T> list,String toFind) throws CreatedException{
		stringAvailablity(list,toFind);
		int position=list.indexOf(toFind);
		return position;
	}
	
	public String getAtIndex(List<T> list,int location)throws CreatedException {
		int listSize=getSize(list);
		indexInAppropriate(location,listSize);
		String word=(String) list.get(location);
		return word;
	}
	
	public int getLastIndexOf(List<T> list,String toFind) throws CreatedException{
		stringAvailablity(list,toFind);
		int position=list.lastIndexOf(toFind);
		return position;
	}
	
	public List<T> getStringInsertedList(List<T> list,String toInsert,int location) throws CreatedException{
		nullCheck(list);
		nullCheck(toInsert);
		list.add(location, (T) toInsert);
		return list;
	}
	public List<T> getSubList(List <T> list1,List <T> list2,int start,int end) throws CreatedException{
		
		indexBoundException(list1,start,end);
		list2=list1.subList(start,end);
		return list2;
	}
	
	public List<T> getArrayListInserted(List<T> list1,List<T> finalList) throws CreatedException{
		nullCheck(finalList);
		finalList.addAll(list1);
		return finalList;
	}
	
	public List<T> removeElement(List<T> list,int index) throws CreatedException{
		int listSize=getSize(list);
		indexInAppropriate(index,listSize);
		list.remove(index);
		return list;
	}
	
	public List<T> getAllCommonElementRemoved(List<T> list1,List<T> list2) throws CreatedException{
		nullCheck(list1);
		nullCheck(list2);//doubt
		list1.removeAll(list2);
		return list1;
	}
	
	public List<T> getAllUncommonElementRemoved(List<T> list1,List<T> list2) throws CreatedException{
		nullCheck(list1);
		nullCheck(list2);//doubt
		list1.retainAll(list2);
		return list1;
	}
	
	public List<T> getEmptyList(List<T> list) throws CreatedException{
		nullCheck(list);
		
		list.clear();
		return list;
	}
	
	public boolean isStringAvailable(List<T> list,String toFind) throws CreatedException{
		nullCheck(list);
		nullCheck(toFind);
		return 	list.contains(toFind);

	}

}
