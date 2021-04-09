package exercises;

//using regular expression
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {
	public static void main(String[] args) {
		String str = "GCATGCCGGTTACCTAAGGATGGGTTCAAAATAGCGG";
		String patternString = "((ATG.*TAA)|(ATG.*TAG)|(ATG.*TGA))";
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(str);
		
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("String " + count + " found at: " + matcher.start() + "-" + matcher.end());			
			System.out.println(matcher.group(0));
		}
	}
}