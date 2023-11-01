package day18.predefinedclasses.stringclasses;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Sample5 {

	public static void main(String[] args) {
		String str="I am staying in Pune, 411015";
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int numCount=0;
		int symbolCaseCount=0;
		String upperCase="";
		String lowerCase="";
		for(int i=0;i<str.length();i++) {			
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upperCaseCount++;
				upperCase=upperCase+ch;
			}else if(ch>='a' && ch<='z')
			{
				lowerCaseCount++;
				lowerCase=lowerCase+ch;
			}else if(ch>='0' && ch<='9')
			{
				numCount++;
			}else {
				symbolCaseCount++;
			}
		}
		System.out.println("Upper case char count: "+upperCaseCount);
		System.out.println("lower case char count: "+lowerCaseCount);
		System.out.println("num count: "+numCount);
		System.out.println("Symbol count: "+symbolCaseCount);
		System.out.println("Upper case char: "+upperCase);
		System.out.println("lower case char: "+lowerCase);
	}

}
