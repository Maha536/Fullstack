package com.cts.training.lib;

public class Calculate {
	
	public int reverse(int num) {
		int number=num;
		int div,rev=0;
		while(number!=0) {
			div = number%10;
			rev = (rev*10)+div;
			number /= 10;	
		}
		return rev;
	}
	public void numberToWord(int num) {
		int number=num,div=0,temp,i=1,count=0;
		temp=number ;
		
		while(temp>10) {
			temp =temp/10;
			i *= 10;
			count++;
		}
		
		while(count >=0) {
			div=number/i;
			number = number%i;
			switch(div) {
				case 0:System.out.print("zero");
						break;
				case 1:System.out.print("one");
						break;
				case 2:System.out.print("two");
						break;
				case 3:System.out.print("three");
						break;
				case 4:System.out.print("four");
						break;
				case 5:System.out.print("five");
						break;
				case 6:System.out.print("six");
						break;
				case 7:System.out.print("seven");
						break;
				case 8:System.out.print("eight");
						break;
				default:System.out.print("nine");
						break;
			}
			System.out.print(" ");
			i=i/10;
			count--;
		}
	}
	
	public void numberExpansion(int n) {
		int number=n,div=0,temp,value=1,count=0;
		temp=number ;
		
		while(temp>10) {
			temp =temp/10;
			value *= 10;
			count++;
		}
	
		while(count >=0) {
			div=number/value;
			number = number%value;
			if(count >= 1)
				System.out.print(div+"*"+value+"+");
			else
				System.out.print(div);
			count--;
			value=value/10;
		}
		
	}

}


