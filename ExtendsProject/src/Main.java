
public class Main {
    public void printTime(TimeSupplier timeSupplier) {
        System.out.println("POSIX time: " +
                timeSupplier.getTime());
    }

    public static void main(String[] args) {
        TimeSupplierInterface timeSupplier = new TimeSupplier();
        TimeHolder holder = new TimeHolder(timeSupplier);
        holder.printTime();
    }
}

