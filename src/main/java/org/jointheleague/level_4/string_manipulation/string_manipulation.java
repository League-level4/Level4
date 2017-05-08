package org.jointheleague.level_4.string_manipulation;
/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 4
 *    String Manipulation
 *    Duration=.00
 *    Platform=
 *    Type=Workshet
 *    Objectives=
*/

        StringBuilder stringBuilder = new StringBuilder("java");
        System.out.println("1: " + stringBuilder.deleteCharAt(1));
        /*----------------------------------------*/

        String string = "java";
        System.out.println("2: " + string.replace('a', 'i'));

        /*----------------------------------------*/

        String anotherString = "java";
        anotherString.replaceFirst("a", "i");
        System.out.println("3: " + anotherString);

        /*----------------------------------------*/

        String yetAnotherString = "java";
        yetAnotherString.toUpperCase();
        System.out.println("4: " + yetAnotherString);

        /*----------------------------------------*/

        StringBuilder anotherStringBuilder = new StringBuilder("java");
        anotherStringBuilder.substring(0, 2);
        System.out.println("5: " + anotherStringBuilder);

        /*----------------------------------------*/

        StringBuilder sb1 = new StringBuilder("java");
        sb1.append("java");
        System.out.println("6: " + sb1);

        /*----------------------------------------*/

        StringBuilder sb2 = new StringBuilder("java");
        sb2.insert(1, "java");
        System.out.println("7: " + sb2);

        /*----------------------------------------*/

        StringBuilder sb3 = new StringBuilder("java");
        sb3.replace(1, 2, "java");
        System.out.println("8: " + sb3);

        /*----------------------------------------*/

        String sb4 = new String("java");
        sb4.substring(2);
        System.out.println("9: " + sb4);

        /*----------------------------------------*/

        StringBuilder sb5 = new StringBuilder("java");
        sb5.reverse();
        System.out.println("10: " + sb5);

        /*----------------------------------------*/

        String s = "java";
        char x = s.charAt(4);
        System.out.println("11: " + x);

        /*----------------------------------------*/

        String s1 = "Welcome to Java!";
        String s2 = s1;

        if (s1 == s2)
           System.out.println("12: s1 and s2 reference the same String object");
        else
           System.out.println("12: s1 and s2 reference different String objects");

/*----------------------------------------*/

        String s3 = "Welcome to Java!";
        String s4 = "Welcome to Java!";

        if (s3 == s4)
           System.out.println("13: s3 and s4 reference the same String object");
        else
           System.out.println("13: s3 and s4 reference different String objects");

        /*----------------------------------------*/

        String s5 = new String("Welcome to Java!");
        String s6 = new String("Welcome to Java!");

        if (s5 == s6)
           System.out.println("14: s5 and s6 reference the same String object");
        else
           System.out.println("14: s5 and s6 reference different String objects");

        /*----------------------------------------*/

        String s7 = new String("Welcome to Java!");
        String s8 = new String("Welcome to Java!");

        if (s7.equals(s8))
            System.out.println("15: s7 and s8 have the same contents");
        else
            System.out.println("15: s7 and s8 have different contents");

        /*----------------------------------------*/

        String s9 = new String("Welcome to Java!");
        String s10 = s9.toUpperCase();

        if (s9 == s10)
           System.out.println("16: s9 and s10 reference the same String object");
        else if (s9.equals(s10))
           System.out.println("16: s9 and s10 have the same contents");
        else
           System.out.println("16: s9 and s10 have different contents");

        /*----------------------------------------*/

        String s11 = new String("Welcome to Java");
        String s12 = s11;

        s11 += "and Welcome to HTML";

        if (s11 == s12)
           System.out.println("17: s11 and s12 reference the same String object");
        else
           System.out.println("17: s11 and s12 reference different String objects");

