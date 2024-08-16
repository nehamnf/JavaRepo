public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(35.0,5.0));
        System.out.println(areEqualByThreeDecimalPlaces1(3.0,5.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        if ((num1 >= 0 && num2 <0) || (num1 < 0 && num2 >= 0)){
            return false;
        }
        boolean isSame = false;
        String str1 = String.valueOf(num1);
        String s1=str1.substring(0,str1.indexOf("."));
        str1 = str1.substring(str1.indexOf(".")+1);
        System.out.println(str1);

        String str2 = String.valueOf(num2);
        String s2=str2.substring(0,str2.indexOf("."));
        str2 = str2.substring(str2.indexOf(".")+1);
        System.out.println(str2);

        if (!s1.equals(s2)){
            return isSame;
        }
        if (str1.length() >= 3 ){
            str1 = str1.substring(0,3);
            System.out.println(str1);
        }
        if (str2.length() >= 3){
            str2 = str2.substring(0,3);
            System.out.println(str2);
        }

        if (str1.length() != str2.length()){
            System.out.println("length is not same");
            return isSame;
        }else{
            int n1 = Integer.parseInt(str1);
            int n2 = Integer.parseInt(str2);
            System.out.println("n1---"+n1);
            System.out.println("n2---"+n2);
            for (int i = 1 ; i <= 3 ; i++){
                int rem1 = n1 % 10;
                int rem2 = n2 % 10;
                System.out.println(rem1 +" "+rem2);
                if (rem1 == rem2){
                    System.out.println("same rem");
                    n1 = n1 / 10;
                    n2 = n2 / 10;
                    isSame = true;
                }else {
                    System.out.println("not same reminder");
                    isSame = false;
                    break;
                }
            }
        }
        return isSame;
    }

    public static boolean areEqualByThreeDecimalPlaces1(double myFirstNumber, double mySecondNumber){

        System.out.println((int) (myFirstNumber * 1000));
        return (int) (myFirstNumber * 1000) == (int) (mySecondNumber * 1000);
    }
}
