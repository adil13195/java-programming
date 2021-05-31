package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        //把String 变成 int 数字
        String total="345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        //parse的意思是解析。 举例： string 解析成 Int . 等等！ ！

            //把String 变成double
        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price>100){
            System.out.println("expensive");
        }
        // 分开后位置：      0   1    2    3    4   5
        String sentence = "I wrote 857 lines of code";
        // split by space, parse index 2 to int
        // 以空格分开。 变成0.1.2.3.4.5 个不同的， 然后把第二个位置的857 变成int .

        String[] words= sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);

        System.out.println("linesOfCode = " + linesOfCode);


    }
}
