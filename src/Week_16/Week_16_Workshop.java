import java.util.Scanner;
//10
public class Week_16_Workshop {
    public static void main(String[] args) {
        Week_16_Workshop mainObj = new Week_16_Workshop();
//        all comparision method call nested
//        mainObj.concat2String();
    reverseString();
    }
    public static void reverseString() {
        String a= "bibek";
        String reversed="";
        for (int i=a.length()-1; i>=0; i--){
            reversed+=a.charAt(i);
        }
        System.out.println(reversed);
        checkPalindrome(reversed,"bibek");
    }
    public static void checkPalindrome(String reversed,String pal){
        if(reversed.equals(pal)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
//    concat string using  + and equal method
    public void concat2String(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String concatedString1 = str1 + str2;
        String concatedString2 = str1.concat( str2);
        System.out.println(concatedString1);
        System.out.println(concatedString2);
        compare2String(str1,str2);
    }
//    compare using equal ==
    public void compare2String(String str1,String str2){
       boolean compareResult1 = str1 == str2;
        System.out.println("compare by == " + compareResult1);
        compareEqualMethod(str1,str2);
    }
    // compare using equal method
    public void compareEqualMethod(String str1,String str2){
        boolean compareResult2 = str1.equals(str2);
        System.out.println("compare by equal method " + compareResult2);
        extaractSubString(str1,str2);
    }
    public void extaractSubString(String str1,String str2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end  index");
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        String subString = str1.substring(startIndex,endIndex);
        System.out.println("sub string "+subString);

        System.out.println("to check is your word incliude in substring or not");
        String toCheckIncludes = sc.nextLine();
        boolean isContain = subString.contains(toCheckIncludes);
        System.out.println("isContain"+isContain);
    }


}