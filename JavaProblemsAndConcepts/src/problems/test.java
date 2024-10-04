package problems;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        System.out.println((0x000F) & (0x2222));
        Float f= Float.valueOf("3.0");
        int a=f.intValue();
        byte b=f.byteValue();
        double d= f.doubleValue();
        System.out.println(a+b+d);


        String s= "give me  6.7" +
                "  10 dollars";
        String[] str= s.trim().split("\\s+");
        int string=0,integer=0,doub=0;
        System.out.println(Arrays.toString(s.split("\\s+")));

        for (String val: str){
            try{
                Integer.parseInt(val);
                integer++;
            }catch (NumberFormatException e){
                try {
                    Double.parseDouble(val);
                    doub++;
                }catch (NumberFormatException e2){
                    string++;
                }
            }
        }

        System.out.println("String "+string);
        System.out.println("Integer "+integer);
        System.out.println("Double "+doub);
    }
}
