package com.ClassWorkPrograms;
/*Todays concept is WRAPPER CLASSES!!!
 
 Array in a glimpse
 ===================
  Array Collects multiple elements of similar data types in a continous block of memory
 
 Drawbacks of Arrays
 ===================
 1)Array is having fixed length.
 2)Array accepts only Homogeneous data.
 3)There is no method support.
 
 ==>these drawbacks were the reason of discovering CollectionFrameWorks.
 ==> it is available in the (java.util) package
 
 Note:-
 =====
==> the process of converting a  data type into it respective Class Object is called auto-boxing.
==> the reverse of this boxing is auto-unboxing.
==>TypeCasting and auto boxing are both completly different concepts.we can't cast in autoboxing.
==> for 8 primitive data types we are having 8 ClassObjects(WRAPPER).
1)int-->Integer
2)byte-->Byte
3)short-->Short
4)long-->Long
5)float-->Float
6)double-->Double
7)char-->Character
8)boolean-->Boolean

All these 8 wrapper classes are present (java.lang) package.

**Main Notes**
  ==========
  
  
  WrapperClasses
  ==============
  1)in java technology if we want to represent a group of objects in the form of an objects then we have to use 
  "Collection Objects",like
  		*Array List
  		*Vector
  		*Stack
  		*LinkedList
  		*HashMap,HashTable etc.
  2)in java applications collections objects are able to allow only group of other objects,'not primitive data directly'.
  3)if we want to store primitive data in collection objects,first we need to 'convert the primitive data in object form'
  then we have to store that object data in collection objects.
  
  
  Compiler approach for auto boxing
  =================================
  
  Example for auto-boxing:
  =======================
  
  byte b=10;
  byte b1=Byte.valueOf(b);
  Byte b2=b;
  
  							     valueOf()
  Primitive Data type	=========================>>  Wrapper(Class Object)
  -->the above diagram is Auto-Boxing.
  
  
  Compiler approach for auto-unboxing
  ===================================
  
  Example for auto-unboxing:
  =========================
  
  Byte b=new Byte("10");
  byte b1=b.byteValue();
  
  
   							     abcValue()
  Wrapper(ClassObject)	=========================>>  Primitive Data type
  -->the above diagram is Auto-Unboxing.
  
  

 
 */

public class Class19 {

}
