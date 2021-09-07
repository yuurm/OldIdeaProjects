package Skillb.HW41;

public class sumDigits {

    public class Main
    {
        public void main(String[] args)
        {

        }

        public int sumDigits(Integer number)
        {
            int summa = 0;
            String s = Integer.toString(number);

            for (int i = 0; i <= s.length(); i++) {
                char ch = s.charAt(i);

                String s2 = String.valueOf(ch);
                int i1 = Integer.parseInt(s2);

                summa += i1;


                //        .chartAt()
                //        .lenght()
            }
            System.out.println(sumDigits(12345));
            return summa;


        }









    }

}
