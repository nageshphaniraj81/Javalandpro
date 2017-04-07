package StringBuffer;

public class SBDemo {

	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer();
       System.out.println("Initial capacity"+sb.capacity());
       sb.append("Nagesh is a good boy");
       sb.append("World is not enough");
       System.out.println("Current capacity"+sb.capacity());
       System.out.println(sb.toString());
       System.out.println(sb.reverse());
       System.out.println(sb.reverse());
       System.out.println(sb.insert(3, "xxxxxxxxx"));
       System.out.println(sb.delete(3, sb.length()));
	}

}
