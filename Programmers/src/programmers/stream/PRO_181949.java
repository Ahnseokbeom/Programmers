package programmers.stream;

public class PRO_181949 {
	public static void main(String[] args) {
		System.out.println("aBcDeFg");
	}
	 public static String swapCase(String a){
	       return a.chars()
	                .mapToObj(c -> (char)(Character.isUpperCase(c)
	                        ? Character.toLowerCase(c)
	                        : Character.isLowerCase(c)
	                            ? Character.toUpperCase(c)
	                            : (char) c))
	                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	                .toString();
	    }
}
