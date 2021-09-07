package HW41;

public class Main {
        public static void main(String[] args)
        {
            Container container = new Container();
            //container.count += 123;
            sumDigits(123);


        }

        public static int sumDigits(Integer number)
        {
            int summa = 0;
            String s = Integer.toString(number);

            for (int i = 0; i <= s.length(); i++) {
                char ch = s.charAt(i);
                String s2 = Character.toString(ch);
                summa += Integer.parseInt(s2);

                /* Integer.toString();
                str.charAt();
                str.length();

                 */

            }
            System.out.println(summa);
            return 0;
        }




    }

