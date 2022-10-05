package com.util.exceptions;

import java.util.Objects;

import createdexception.CreatedException;

public class NullException {

	public void nullCheck(Object name)throws CreatedException{
		//object as parameter for string type and can be used for sting array and array list also
			if(Objects.isNull(name)){
				throw new CreatedException(" The entered Object is null. ");
			}
		}
}
