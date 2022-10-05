package com.arraylist.methods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.arraylist.runner.ArrayListRunner;
import createdexception.CreatedException;
public class ArrayListMethod2 {
	public <T> List<T> getArrayList(T type) {
		List<T> list=new ArrayList<>();
		return  list;
	}
	public void nullCheck(Object element) throws CreatedException {
		if(Objects.isNull(element)) {
			throw new CreatedException("The type passed is null.");
		}
	}
	
	public <T> void stringAvailablity(List<T> list,String name) throws CreatedException {
		nullCheck(list);
		nullCheck(name);
		if(list.indexOf(name)==-1) {
			throw new CreatedException("The String passed is not availabe.");
		}
	}
	
	public <T> void indexBoundException(List<T> list,int startIndex,int endINdex) throws CreatedException {
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
	
	public  List<Integer> getIntegerAddedList(List<Integer> list,Integer... numbers) throws CreatedException{
		nullCheck(list);
		nullCheck(numbers);
		for(Integer number : numbers) {
			list.add(number);
		}
		return list;
	}
	
	public  List<Float> getFloatAddedList(List<Float> list,Float... numbers) throws CreatedException{
		nullCheck(list);
		nullCheck(numbers);
		for(Float number : numbers) {
			list.add(number);
		}
		return list;
	}
	
	public  List<String> getStringAddedList(List<String> list,String... names) throws CreatedException{
		nullCheck(list);
		nullCheck(names);
		for(String name : names) {
			list.add(name);
		}
		return list;
	}
	
	public  List<Long> getLongAddedList(List<Long> list,Long... names) throws CreatedException{
		nullCheck(list);
		nullCheck(names);
		for(Long name : names) {
			list.add(name);
		}
		return list;
	}
	
	public List<ArrayListRunner> getObjectAddedList(List<ArrayListRunner> list,int count)throws CreatedException {
		nullCheck(list);		
		for(int i=0;i<count;i++) {
			ArrayListRunner temp=new ArrayListRunner();
			list.add(temp);
		}
		return list;
	}
	
	public int getFirstIndexOf(List<String> list,String toFind) throws CreatedException{
		stringAvailablity(list,toFind);
		int position=list.indexOf(toFind);
		return position;
	}
	
	public String getAtIndex(List<String> list,int location)throws CreatedException {
		int listSize=getSize(list);
		indexInAppropriate(location,listSize);
		String word=list.get(location);
		return word;
	}
	
	public int getLastIndexOf(List<String> list,String toFind) throws CreatedException{
		stringAvailablity(list,toFind);
		int position=list.lastIndexOf(toFind);
		return position;
	}
	
	public List<String> getStringInsertedList(List<String> list,String toInsert,int location) throws CreatedException{
		nullCheck(list);
		nullCheck(toInsert);
		list.add(location, toInsert);
		return list;
	}
	public List<String> getSubList(List <String> list1,List <String> list2,int start,int end) throws CreatedException{
		
		indexBoundException(list1,start,end);
		list2=list1.subList(start,end);
		return list2;
	}
	
	public List<String> getArrayListInserted(List<String> list1,List<String> finalList) throws CreatedException{
		nullCheck(finalList);
		finalList.addAll(list1);
		return finalList;
	}
	
	public List<Float> removeElement(List<Float> list,int index) throws CreatedException{
		int listSize=getSize(list);
		indexInAppropriate(index,listSize);
		list.remove(index);
		return list;
	}
	
	public List<String> getAllCommonElementRemoved(List<String> list1,List<String> list2) throws CreatedException{
		nullCheck(list1);
		nullCheck(list2);//doubt
		list1.removeAll(list2);
		return list1;
	}
	
	public List<String> getAllUncommonElementRemoved(List<String> list1,List<String> list2) throws CreatedException{
		nullCheck(list1);
		nullCheck(list2);//doubt
		list1.retainAll(list2);
		return list1;
	}
	
	public List<Long> getEmptyList(List<Long> list) throws CreatedException{
		nullCheck(list);
		
		list.clear();
		return list;
	}
	
	public boolean isStringAvailable(List<String> list,String toFind) throws CreatedException{
		nullCheck(list);
		nullCheck(toFind);
		return 	list.contains(toFind);

	}


}
