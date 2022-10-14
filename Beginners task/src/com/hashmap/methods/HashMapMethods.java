package com.hashmap.methods;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.hashmap.runner.HashMapRunner;

import createdexception.CreatedException;

public class HashMapMethods {
	
	public void nullCheck(Object object) throws CreatedException{
		if(Objects.isNull(object)) {
			throw new CreatedException("The object passed is null");
		}
	}
	
	public void keyValueCheck(int key,int value) throws CreatedException {
		if(key!=value || key<0) {
			throw new CreatedException("The key/value given is inappropriate");
		}
	}
	public <K,V> void mapContainsKey (Map<K,V> map,K toFindKey) throws CreatedException{
		nullCheck(map);
		nullCheck(toFindKey);
		if(!map.containsKey(toFindKey)) {
			throw new CreatedException("The key given is not present in the map.");
		}
	}
	
	public <K,V> void mapContainsValue (Map<K,V> map,V toFindValue) throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		if(!map.containsValue(toFindValue)) {
			throw new CreatedException("The value given is not present in the map.");
		}
	}
	
	public int getStringArrayLength(String[] words) throws CreatedException {
		nullCheck(words);
		return words.length;
	}
	
	public int getIntArrayLength(Integer[] numbers) throws CreatedException {
		nullCheck(numbers);
		return numbers.length;
	}
	public <K,V> Map<K, V> getHashMap(K key,V value) {
		Map<K,V> map=new HashMap<>();
		return map ;
	}
	
	public <K, V> int  getMapSize(Map<K ,V > map)throws CreatedException{
		int size=map.size();
		return size;
	}
	
	public Map<String,String> getStringMap(Map<String ,String > map,String keys,String values)throws CreatedException{
		nullCheck(map);
		nullCheck(keys);
		nullCheck(values);

		map.put(keys, values);
		
		return map;
	}
	
	public Map<Integer,Integer> getIntegerMap(Map<Integer ,Integer > map,Integer keys,Integer values)throws CreatedException{
		nullCheck(map);
		nullCheck(keys);
		nullCheck(values);

		
		map.put(keys, values);
		
		return map;
	}
	
	public Map<String,Integer> getStringIntegerMap(Map<String, Integer> map,String keys,Integer values)throws CreatedException{

		nullCheck(map);
		nullCheck(keys);
		nullCheck(values);


		map.put(keys, values);

		return map;
	}
	
	public Map<String,HashMapRunner> getStringObjectMap(Map<String,HashMapRunner> map,String keys)throws CreatedException {
		nullCheck(map);
		nullCheck(keys);
		

		map.put(keys, new HashMapRunner());		
		return map;
	}
	public Map<String,String> getStringNullPointedMap(Map<String ,String > map,String keys,String values)throws CreatedException{
		
		nullCheck(map);
		
		map.put(keys, values);
		return map;
	}
	
	public Map<String,String> getStringNullKeyMap(Map<String ,String > map,String keys,String values)throws CreatedException{
		nullCheck(map);
		nullCheck(keys);
		nullCheck(values);

		map.put(keys, values);
		return map;
	}
	
	public Map<Integer,String> getIntegerStringMap(Map<Integer,String> map,Integer keys,String values)throws CreatedException{
		nullCheck(map);
		nullCheck(keys);
		nullCheck(values);
		
		map.put(keys, values);
		
		return map;
	}
		
	public Map<String,String> getReplacedValues(Map<String ,String > map,String keys,String replaceValues)throws CreatedException{
		nullCheck(map);
		nullCheck(keys);
		nullCheck(replaceValues);
		
		map.replace(keys, replaceValues);
		return map;
	}
	public String getValue(Map<Integer,String> map,Integer toFindValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		
		return map.get(toFindValue);
	}
	
	public String getNullValueAsString(Map<Integer,String> map,Integer toFindValue,String resultSring)throws CreatedException{
		nullCheck(map);
		nullCheck(toFindValue);
		
		String value= map.get(toFindValue);
		if(value==null) {
			map.put(toFindValue, resultSring);
			return resultSring;
		}
		return map.get(toFindValue);
	}
	
	public String getKeyRemoved(Map<Integer,String> map,Integer toRemoveKey)throws CreatedException{
		nullCheck(map);
		nullCheck(toRemoveKey);
		
		return map.remove(toRemoveKey);
	}
	
	public Map<Integer,String> getKeyRemovedWithValue(Map<Integer,String> map,Integer toRemoveKey,String toRemoveValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toRemoveKey);
		nullCheck(toRemoveValue);
		
		map.remove(toRemoveKey,toRemoveValue);
		return map;
	}
	
	public Map<Integer,String> getReplacedValue(Map<Integer,String> map,Integer toRemoveKey,String toReplaceValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toReplaceValue);
		nullCheck(toRemoveKey);
		
		map.replace(toRemoveKey,toReplaceValue);
		return map;
	}
	
	public Map<Integer,String> getReplacedByValue(Map<Integer,String> map,Integer toRemoveKey,String toRemoveValue,String toReplaceValue)throws CreatedException{
		nullCheck(map);
		nullCheck(toReplaceValue);////////
		nullCheck(toRemoveValue);
		nullCheck(toRemoveKey);
		
		map.replace(toRemoveKey,toRemoveValue,toReplaceValue);
		return map;
	}
	
	public Map<Integer,String> getAddedHashMap(Map<Integer,String> map1,Map<Integer,String> map2)throws CreatedException{
		nullCheck(map1);
		nullCheck(map2);

		
		map2.putAll(map1);
		return map2;
	}
	public void printKeyValue (Map<Integer,String> map) throws CreatedException{
		nullCheck(map);
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println("Key= "+entry.getKey()+" Value = "+entry.getValue());
		}
	}	
	public Map<Integer,String> getClearedMap(Map<Integer,String> map)throws CreatedException{
		nullCheck(map);
		map.clear();
		return map;
	}
	
}

