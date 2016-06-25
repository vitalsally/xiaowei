package test;
import java.util.Random;

public class Chinese {
	
public StringBuffer getChinese() throws Exception {
StringBuffer str = null;
int highPos, lowPos;
//seed = new Date().getTime();
Random rand = new Random();
int nextInt = rand.nextInt(3)+1;

for (int i = 0; i < nextInt; i++) {
	Random random = new Random((long)(rand.nextInt(999)));
	highPos = (176 + Math.abs(random.nextInt(39)));
	lowPos = 161 + Math.abs(random.nextInt(93));
	byte[] b = new byte[2];
	b[0] = (new Integer(highPos)).byteValue();
	b[1] = (new Integer(lowPos)).byteValue();
	str.append(new String(b, "GB2312"));
}

return str;
}

public static String get300Chinese() throws Exception {
Chinese ch = new Chinese();
String str = "";
for (int i = 1; i > 0; i--) {
str = str + ch.getChinese();

}
System.out.println(str);
return str;
}

public static void main(String[] args) throws Exception {
	Chinese ch = new Chinese();
//	double random = Math.random();
//	System.out.println((long)( Math.random()*10000));
	
//	System.out.println();
//	System.out.println());
	Random rand = new Random();
	int randNum = rand.nextInt(199);
	System.out.println(randNum);
//	System.out.println(ch.getChinese()+ch.getChinese());
//	String s = ch.getChinese() + ch.getChinese();
//	System.out.println(s);
//get300Chinese();
}
}