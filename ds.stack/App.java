public class App    {

    public static void main(String[] args)  {

        System.out.println(reverseString("Chiranjeeb"));
        System.out.println(reverseString("Google Summer of Code 2017"));
        System.out.println(reverseString("Former Intern"));

    }

    public static String reverseString(String str)  {
        int stackSize  = str.length();
        Stack d = new Stack(stackSize);
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            d.push(ch);
        }

        String result = "";

        while(!d.isEmpty())    {
            char ch = d.pop();
            result = result + ch;
        }
        return result;
    }

}