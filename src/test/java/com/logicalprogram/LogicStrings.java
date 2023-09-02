package com.logicalprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LogicStrings {



	//1. reverseEachWordInStringChangingThePosition*
	//2. reverseTheStringWithoutChangingThePosition*
	//3. swaptheStringUsingThirdVariable*
	//4. swaptheStringWithoutThirdVariable*
	//5. findTheSpecificCharacterInGivenString*
	//6. findTheMaximumRepeatedCharacterAndCountInGivenString
	//7. findTheSpecificCharacterCount*
	//8. getOnlyIntegerValuesInGivenString*
	//9. getOnlyAlphabatesCharacterInGivenString*
	//10.getOnyUniqueValuesInGivenString*
	//11.findTheMinimumRepeatedCharacterAndCountInGivenString*
	//12.palindrom*
	//13.removeTheSpaceAndRemoveFirstAndLastCharacterInGivenString*
	//14.removeNullValueInMap
	//15.removeTheSpecialCharacterInString*
	//16.removeDuplicatesInString*
	//17.getVowelsInString
	//18.getOddAndEvenNumberinArray*
	//19.primeNumber*
	//20.PrintStringNumberSeperately*
	//21.countCharactersOrOccuranceInGivenString*
	//22.countCharactersWithoutCaseSensitive*
	//23.countTotalNoOfCharactersInGivenString*
	//24.removeFirstAndLastCharacterInGivenString*
	//25.findTheMaximumRepeatedNumbersInGivenArray*
	//25.findTheDuplicateNumbersInGivenArray
	//26.removeDuplicatesFromArray*
	//27.getSumOfArrayElements*


	//14.removeNullValueInMap
	//10.getOnyUniqueValuesInGivenString
	//17.getVowelsInString
	//Palindrom= Find Longest Palindrom


	public void reverseEachWordInStringChangingThePosition() {
		//      1   2   3  4         5                 1      2         3   4   5
		String input ="My name is Najimunisa begum"; // o/p = mugeb asiniumijaN si eman yM
		String output ="";                            // o/p -mugeb asinumijaN si eman yM 
		for(int i=input.length()-1; i>=0; i--) {

			char charAt = input.charAt(i);
			output=output+charAt;
		}
		System.out.println(output);
	}

	public void reverseTheStringWithoutChangingThePosition() {

		String input ="My name is Najimunisa begum";  // o/p - yM eman si sainumijaN mugeb
		String output ="";                            // o/p - yM eman si asinumijaN mugeb

		String[] split = input.split(" ");
		for(String str : split) {
			for(int i=str.length()-1; i>=0; i--) {
				char charAt = str.charAt(i);
				output=output+charAt;
			}
			output=output+" "; 
		}
		System.out.println(output);
	}

	public void swaptheStringUsingThirdVariable(){   // o/p - World Hello

		String S1="Hello";
		String S2="World";
		String temp ;

		temp=S1;
		S1=S2;
		S2=temp;

		System.out.println("String S1 = "+S1);
		System.out.println("String S2 = "+S2);
		System.out.println(S1+" "+S2);
	}

	public void swaptheStringWithoutThirdVariable() {
		String s1="Najimunisabegum";
		String s2="MohammedRiyasudeen";
		s1=s1+s2;   //NajimunisabegumMohammedRiyasudeen
		System.out.println(s1); 

		s2 = s1.substring(0, s1.length()-s2.length());
		System.out.println("String s2 "+s2);  //Najimunisabegum

		s1 = s1.substring(s1.length()-s2.length());
		System.out.println("String s1 "+s1);  //MohammedRiyasudeen

		//		s1 = s1.substring(5, 10);
		//		System.out.println("String s1 "+s1); // World

	}
	public void removeDuplicatesInString() {

		String input ="najimunisabegumRiyasudeen";  //najimusbegRyd
		String output="";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<input.length(); i++) {
			char charAt = input.charAt(i);
			if(map.containsKey(charAt)) {

			}
			else {
				map.put(charAt, 1);
			}}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			output=output+key;


		}
		System.out.println(output);

	}

	public void findTheMaximumRepeatedCharacterAndCountInGivenString() {

		String input = "najimunisabegum";

		Map<Character,Integer> map = new LinkedHashMap<>();

		for(int i=0; i<input.length(); i++) {
			char charAt = input.charAt(i);
			if(map.containsKey(charAt)) {
				Integer integer = map.get(charAt);
				map.put(charAt, integer+1);
			}
			else {
				map.put(charAt, 1);
			}
		}

		Integer max = Collections.max(map.values());
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()==max) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println("MaximumRepeated Character :"+key);
				System.out.println("MaximumRepeated Count :"+value);
			}

		}

	}

	public void removeNullValueInMap() {

		Map<String , String> map = new LinkedHashMap<>();

		map.put("Name", "nisha");
		map.put(null, "chennai");
		map.put("state", null);
		map.put("country", "india");


		Set<Entry<String,String>> entry = map.entrySet();

		for(Entry<String,String> entries : entry) {
			if(entries.getValue()!=null&&entries.getKey()!=null) {
				System.out.println(entries);
			}}


		//			else {
		//				System.out.println(entries);
		//				
		//			}

	}

	public void getOnyUniqueValuesInGivenString() {

		String s ="najimunisabegum";  //jsbeg  //najimusbeg
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char charAt = s.charAt(i);
			if(map.containsKey(charAt)) {  //n

			}
			else {
				map.put(charAt, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for(Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			System.out.println(key);
		}
	}

	private void printcountofCharacter() {
		String s = "Najimunisabegum";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++){
			char charAt = s.charAt(i);
			if(map.containsKey(charAt)){
				Integer integer = map.get(charAt);
				map.put(charAt, integer+1);
			}
			else{
				map.put(charAt, 1);
			}
		}
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		for(Entry<Character, Integer> entry :entryset){
			//if(entry.equls(map)){
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Count of"+ " ' "+key+"' " +"character is : "+value);
		}




	}

	public void getOddAndEvenNumberinArray(int num) {

		//10/2=5(quotient value) 0(Reminder value) 
		//10/2=>if divided answer will be quotient value need to tell 5.
		//10%2=>if modulus answer will be reminder value need to tell 0.
		//15%2=>if modulus answer will be reminder value need to tell 1.

		if(num%2==0) {
			System.out.println("given number is even Number");
		}
		else {
			System.out.println("given number is odd number");
		}
	}

	public void findOddAndEvenNumberFrom1to10() {

		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i+" is Even Number");
			}
			else {
				System.out.println(i+ " is Odd Number");
			}
		}
	}
	public void getOddNumberOnlyFrom1to15() {

		for(int i=0; i<=15; i++) {
			//			if(i%2==1) {
			//				System.out.println(i+" is Odd number");
			//			}
			//			if(i%2!=0) {
			//				System.out.println(i+" is Odd number");
			//			}
			if(i%2==0) {
			}
			else {
				System.out.println(i+" is Odd number");
			}
		}
	}

	public void seperateOddAndEvenNumber() {

		int arr[] = {11,23,34,45,14,57,1,2,3,5,6,8};

		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is even number");
			}
			else {
				System.out.println(arr[i]+" is Odd number");
			}
		}
	}

	public void getCountOFOddAndEvenNumberFrom1to20() {
		int evencount=0,oddcount=0;
		for(int i=1; i<=20;i++) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++; 

			}
		}
		System.out.println("Event count "+evencount);
		System.out.println("Odd count " +oddcount);

	}

	public void getCountOFOddAndEvenNumberFrom1to21() {
		int evencount=0,oddcount=0;
		for(int i=1; i<=21; i++) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Event count "+evencount);
		System.out.println("Odd count " +oddcount);

	}




	public void removeNumbersFromGivenString() {
		//		String s="naji488mu65n67is546abe546gum";
		//		String replaceAll = s.replaceAll("[^a-z]", "");
		//		System.out.println(replaceAll); 

		String s1="Najim34234uni345sa345be345g65um";
		String replaceAll2 = s1.replaceAll("[^0-9]","");
		System.out.println(replaceAll2);
		//
		//		String replaceAll3 = s.replaceAll("[^0-9]", "");
		//		System.out.println(replaceAll3);

		//String s1="naji54M';';,6465U23!@#@#$$%NISW#@$@#%CAb6546egum";
		//String replaceAll = s1.replaceAll("[^31-48]", "");
		//System.out.println(replaceAll);
		//String replaceAll2 = s1.replaceAll("[^0-9a-zA-Z]", "");		
		//System.out.println(replaceAll2);	


		//	if(charAt>31&&charAt<48) {
		//		if(charAt>57&&charAt<65) {
		//			if(charAt>90&&charAt<97) {
		//				if(charAt>122&&charAt<127) {
		//					System.out.println(s5+charAt);
		//				}
		//			}}}

	}
	//	public void getVowelsInString() {
	//
	//		//Count of vowels 
	//		String s="najimunisabegum";
	//
	//		int count =0;
	//		for(int i=0; i<s.length(); i++) {
	//
	//			char ch = s.charAt(i);
	//
	//			switch(ch){
	//
	//			case 'a':
	//			case 'e':
	//			case 'i':
	//			case 'o':
	//			case 'u': count ++;
	//			}
	//		}
	//
	//		if(count==0)
	//			System.out.println("No vowels present in the given String");
	//		else
	//			System.out.println("Vowels count is :"+ count);}
	//
	//
	//	//Vowels Present in the given string or not
	//
	//	String s = "Najimunisabegum";
	//
	//	int countofa=0,countofe=0, countofi=0, countofo=0,countofu=0;
	//
	//	for(int i =0; i<s.length(); i++) {
	//
	//		char ch = s.charAt(i);
	//
	//		switch(ch) {
	//
	//		case 'a': countofa++; break;
	//		case 'e': countofe++; break;
	//		case 'i': countofi++; break;
	//		case 'o': countofo++; break;
	//		case 'u': countofu++; break;
	//
	//		}
	//	}
	//
	//	System.out.println("Vowels a count is "+countofa);
	//	System.out.println("Vowels e count is "+countofe);
	//	System.out.println("Vowels i count is "+countofi);
	//	System.out.println("Vowels o count is "+countofo);
	//	System.out.println("Vowels u count is "+countofu);*/}}

	public void m1() {

		//Declare and initialize the array elements
		int arr[] = {1, 6, 5, 2, 4,7,7, 9, 4, 6};  //1,2,4,4,5,6,6,7,9
		Arrays.sort(arr);
		//logic implementation for middle element

		//if even number of array elements are present
		if (arr.length %2 == 0){
			System.out.println("The middle elements are: ");

			// even-length array (two middle elements)
			int x = arr[(arr.length/2) - 1];  //3
			System.out.println(x);
			int y = arr[arr.length/2];  //4
			System.out.println(y);
		}

		//if odd number of array elements are present
		else {

			// odd-length array (only one middle element)
			int z = arr[arr.length/2];
			System.out.println("The middle elements is: ");
			System.out.println(z);
		}
	}







	public void m2() {


		int arr[] = {5,8,6,4,5,2,4,5,1,5};  //1,2,4,4,,5,5,6,8
		Arrays.sort(arr);

		//if even num of array
		if(arr.length%2==0) {
			System.out.println("middle value is: ");

			int x = arr[(arr.length/2)-1];
			System.out.println(x);
			int y= arr[arr.length/2];
			System.out.println(y);
		}
		//if odd num of array
		else {

			int a =arr[arr.length/2];
			System.out.println("middle value : ");
			System.out.println(a);


		}
	}

	public void oddAndEvenNumber(){

		int a[] = {1,2,4};
		for(int i=0; i<3; i++) {

			if(i%2==1) {

				System.out.println(i+" is "
						+ "odd number");

			}
			//			else {
			//				
			//				System.out.println("odd number");
			//			}

		}

	}


	public void PrintStringNumberSeperately() {

		String s = "1,2,3,4,5,6,7,8,9,10";
		//String output ="";

		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		//		String[] split = s.split(",");
		//		for(String str :split) {
		//			for(int i=0; i<str.length(); i++) {
		//				char charAt = str.charAt(i);
		//				output=output+charAt+" ";
		//			}
		//		}
		//		System.out.println(output);

	}

	public void countTotalNoOfCharactersInGivenString() {

		String s ="najimunisabegum";
		int length = s.length();
		System.out.println(length);
	}

	public void countCharactersOrOccuranceInGivenString() {

		String s ="Najimunisa begum";        //n,a,i,m,u
		String replace = s.replace(" ", "");
		String lowerCase = replace.toLowerCase();
		System.out.println(lowerCase);
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] charArray = lowerCase.toCharArray();
		for(char chararr : charArray) {
			//if(!(String.valueOf(chararr).isBlank())) {
			if(map.containsKey(chararr)) {
				map.put(chararr, map.get(chararr)+1);				
			}
			else {
				map.put(chararr, 1);
			}
			//}
		}
		System.out.println(map);
	}
	public void countcharacter() {

		String s = "Najimunisa Begum Riyas";

		String replace = s.replace(" ", "#");
		System.out.println(replace);

		String s2 =replace;

		int indexOf = replace.indexOf('R');
		int lastIndexOf = replace.lastIndexOf('s');
		//System.out.println(lastIndexOf);

		String s1= replace.substring(indexOf, lastIndexOf+1);
		//System.out.println(s1); 

		String s3 = replace.substring(0, indexOf);
		//System.out.println(s3);

		String s4=s1+s3;
		System.out.println(s4);

		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] charArray = s4.toCharArray();
		for(char chararr : charArray) {

			if(map.containsKey(chararr)) {
				map.put(chararr, map.get(chararr)+1);
			}
			else {
				map.put(chararr, 1);
			}
		}
		System.out.println(map);
	}


	public void primeno() {
		int a = 3;
		int count =0;
		for(int i=2;i<=a/2; i++) {
			if(a%i==0) {
				count++;
			}}
		if(count==0) {
			System.out.println(a +" is a Prime Number");
		}
		else {
			System.out.println(a +" is not a Prime Number");
		}

	}


	public void primeNumber() {
		//Which number can divided only by '1' and 'same number' is called Prime Number
		//1,2,3,5,7,11,13,17,19
		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		//int cycle =0;
		for(int i=1; i<=10; i++) {   //2
			//2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
			int count=0;
			for(int j=2; j<i; j++) {  //3
				System.out.println("Value of 'i' : "+i+"  , Value of 'j' : "+j);

				if(i%j==0) {
					count++;
					System.out.println("Count : "+count);
				}
			}
			if(count==0) {
				System.out.println("Prime Number'i' value is : "+i);
			}
			//cycle++;
			//System.out.println("-----------------Loop "+cycle+" End--------------------");

		}


	}


	public void t() {
		for(int i=1; i<=10; i++) {   //2
			int count=0;
			for(int j=2; j<i; j++) {  //3
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Prime Number'i' value is : "+i);

			}}}


	public void test() {

		for(int i=2; i<=2; i++) {
			System.out.println("Loop executed:  ");

		}

	}

	public void removeFirstAndLastCharacterInGivenString(String s) {

		/*	withouEnd2("Hello") → "bell"
		withouEnd2("abc") → "b"
		withouEnd2("ab") → ""*/
		//Begum
		//s="Begum";
		s= s.substring(1, s.length()-1);
		System.out.println(s);
	}

	public void arr() {
		
		LogicStrings l = new LogicStrings();
		Object b[] = new Object[5];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		
		int a[] = {1,2,3,4,5,6,7,8};
		
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		System.out.println(b[4]);
		for(int i=0; i<=2; i++) {
			System.out.println(b[i]);   // 20,30,40,50
			
		}
//		for (int i : b) {
//			System.out.println(i);
//		}
//		for(int i=b.length-1; i>=0; i--) {
//			System.out.println(b[i]);
//		}
		
		
	}
	
	


	public void removeDuplicatesFromArray() {

		int a[]= {1,1,2,4,5,5,5,7,7,8,9,8,6,4,5};

		int b[]=new int[a.length];
		Arrays.sort(a);
		int count =0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				b[count]=a[i];
				count++;}
		}
		b[count]=a[a.length-1];
		for(int i=0; i<=count; i++) {
			System.out.println(b[i]);

		}			

	}
	
	public void getSumOfArrayElements(){
		
		int a[]= {1,5,7,8,3}; // 24
		
		int sum =0;
		for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of array element is : "+ sum);
		
	}
	
	
	
	
	public void getDuplicatesFromArray() {

		int a[]= {1,1,2,4,5,5,5,7,7,8,9,8,6,4,5};
		

		int b[]=new int[a.length]; //int b[] = {}; length=15;
		Arrays.sort(a);
		//int a[]= {1,1,2,4,4,5,5,5,5,6,7,7,8,8,9}; sorted Array 5,5
		int count =0;  //1,4,5
		for(int i=0; i<a.length-1; i++) {  //i=6; condi; i++
			if(a[i]==a[i+1]) {
				b[count]=a[i];  //b[0]=1;b[1]=4;b[2]=5;
				count++;
				}
		}
		b[count]=a[a.length-1];
		for(int i=0; i<=count; i++) {
			System.out.println(b[i]);

		}			

	}


	public void findTheMaximumRepeatedNumberInGivenArray() {
		
		int a[]= {1,1,2,4,5,5,5,5,7,7,8,9,8,6,4,5}; //1,4,5,7,8
		Arrays.sort(a);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i=0; i<a.length-1; i++) {
			if(map.containsKey(a[i])) {
				Integer integer = map.get(a[i]);
				map.put(a[i],integer+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		Integer max = Collections.max(map.values());
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue()==max) {
				Integer key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+ " is maximum repeated Number is : "+value);
			}
			
		}
		
		/*int b[]=new int[a.length];
		Arrays.sort(a);
		int count =0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				b[count]=a[i];
				count++;}
		}
		b[count]=a[a.length-1];
		for(int i=0; i<=count; i++) {
			System.out.println(b[i]);
		}*/			
		/*String s="najimunisabegum";
		Map<Character, Integer> mapp = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char charAt = s.charAt(i);
			if(map.containsKey(charAt)) {
				Integer integer = map.get(charAt);
				map.put(charAt, integer+1);
			}
			else {
				map.put(charAt, 1);
			}
			Integer max = Collections.max(map.values());
			Set<Entry<Character, Integer>> entryset = map.entrySet();
			for() {
				
			}
			*/
			
			
		}
		
	
	public static void main(String[] args) {

		LogicStrings l = new LogicStrings();
		//	l.reverseEachWordInStringChangingThePosition();
		//l.reverseTheStringWithoutChangingThePosition();
		//		l.swaptheStringUsingThirdVariable();
		//l.swaptheStringWithoutThirdVariable();
		//l.findTheMaximumRepeatedCharacterAndCountInGivenString();
		//l.removeNullValueInMap();
		//l.getOnyUniqueValuesInGivenString();
		//l.printcountofCharacter();
		//l.getOddAndEvenNumberinArray(25);
		//l.findOddAndEvenNumberFrom1to10();
		//l.getOddNumberOnlyFrom1to15();
		//l.seperateOddAndEvenNumber();
		//l.getCountOFOddAndEvenNumberFrom1to20();
		//l.getCountOFOddAndEvenNumberFrom1to21(); 
		//l.removeNumbersFromGivenString();
		//l.m1();
		//l.m2();
		//l.PrintStringNumberSeperately();
		//l.oddAndEvenNumber();
		//l.countCharactersOrOccuranceInGivenString();
		//l.primeNumber();
		//l.countcharacter();
		//l.primeno();
		//l.test();
		//l.removeFirstAndLastCharacterInGivenString("Hello");
		//l.removeDuplicatesFromArray();
		//l.findTheDuplicateNumbersInGivenArray();
		//l.getDuplicatesFromArray();
		//l.arr();
		l.getSumOfArrayElements();

	}

}
