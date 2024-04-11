public class SwitchCase {
public static void main(String[] args) {
Integer i = Integer.valueOf("1") + Integer.valueOf("2");
switch(i) {
case 3: System.out.println("Tres");
case 2: System.out.println("Dos");
case 1: System.out.println("Uno");
defaul: System.out.println("Otro"); break;
}
}
}