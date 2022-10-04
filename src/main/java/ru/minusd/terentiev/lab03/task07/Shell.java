public class Shell {
    public static void main(String[] args) {
        Double num = Double.valueOf(5);
        System.out.println(num);
        num = Double.parseDouble("11.35");
        System.out.println(num);
        System.out.println(num.intValue());
        System.out.println(num.byteValue());
        System.out.println(num.longValue());
        System.out.println(num.floatValue());
        System.out.println(num.shortValue());
        Double nu = Double.parseDouble("1");
        String d = Double.toString(3.14);
        System.out.println(d);
      }
}