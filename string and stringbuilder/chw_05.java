public class chw_05 {

    public static void main(String[] args) {
        String s = "hemant kumar gols";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));  // jo nahi hota string me to -1 deta hai 
    // compare
    String a = "Acd";
    String b = "acd";
    System.out.println(a.compareTo(b));

    // star and contain and end methods 
    String str = "hemant kumar  jgsfuygHHHHHH gola";
    String str2 = "hemant kumar gola ";
    System.out.println(str.contains(" kum"));
    System.out.println(str.endsWith("la"));
    System.out.println(str.startsWith("hema"));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.concat(str2));

    }
}