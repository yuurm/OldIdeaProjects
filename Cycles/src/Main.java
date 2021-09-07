public class Main {
    public static void main(String[] args) {
        int ticketNumber = 200000;
        while(ticketNumber <=235000) {
            System.out.print ("bilet №: " + ticketNumber +
                    " otnositsya k kategorii biletov " );
            if(ticketNumber > 200000 && ticketNumber < 210000) {
                System.out.println("s nizkoy cenoy ");
            }
            else if(ticketNumber >= 220000 && ticketNumber <= 235000) {
                System.out.println("s vysokoy cenoy");
            }
            ticketNumber++;


        }

    }
}
