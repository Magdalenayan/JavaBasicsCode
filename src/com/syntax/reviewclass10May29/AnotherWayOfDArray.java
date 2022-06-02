package com.syntax.reviewclass10May29;

public class AnotherWayOfDArray {

	public static void main(String[] args) {
//create 2d array of states
//1 array->NY-->all cities of NY states
//2 array->CA-->all cities of CA states
//3 array->FL-->all cities of FL states
//4 array->VA-->all cities of VA states
		
	String [][] usa={
	{"New York" , "Albany" , "Buffalo"},
	{"Los Angeles" , "San Fransisco" , "San Jose" , "San Diego" , "Redding"},
	{"Miami" , "Orlando" , "Niceville" , "Tampa"},
	{"McLean" , "Richmond" , "Leesburg"}
	};
System.out.println(usa[1][2]);//San Jose
System.out.println(usa[2][0]);//Miami
System.out.println("Total # of 1D arrays in array usa ="+usa.length);//4
//I want to see how many element inside my first array
int num1array=usa[0].length;

System.out.println("# of elements in 1 array = "+ num1array);
//i want to see how many element inside my 2 array
int elem2array=usa[1].length;
System.out.println("# of element in 2 array="+ elem2array);





}}
