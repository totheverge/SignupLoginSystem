public class StrFun {
    public static void main(String[] args) {
        String name = "Java Is Kool";
        System.out.println(name.toLowerCase()); //Prints the name in lower case
        System.out.println(name.toUpperCase()); //Prints the name in upper case
        System.out.println(name.equals("Java Is Kool")); //It can be used to compare string and be used in conditional statement.
        System.out.println(name.equalsIgnoreCase("java is kool")); //equalsIgnoreCase can be used when something is not case sensitive like for example choice of Yes or No.
        System.out.println(name.charAt(0)); //It gives the character in the string at the given index. Index starts from 0.
        System.out.println(name.indexOf("Kool")); //It gives the index of given character or string. By default if there are multiple same character or string it gives the index of the first character or string.
        System.out.println(name.contains("Cool")); //It givies true if the given character or string is present, else gives false as output. It is case sensitive.
        System.out.println(name.length()); //It gives the total number of character present in the string (Including space.)
    }
}
