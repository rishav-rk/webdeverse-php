// Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.

class Test
{
    static boolean isVowel(char c)
    {
        if (c == 'a' || c == 'A' || c=='e' || c == 'E' || c == 'i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isStringInsideVowel(String line)
    {
        boolean flag = true;
        for (int i = 0; i < line.length(); i++)
        {
            if(isVowel(line.charAt(i)))
            continue;
            else{
                flag = false;
                break;
            }
        }
        if(flag==false)
        return flag;

        return true;
    }

    public static void main(String args[])
    {

        System.out.println(Test.isStringInsideVowel("AAEEiIo"));
                System.out.println(Test.isStringInsideVowel("kmnpdk"));
    }
}