public class TimeHolder {
    private TimeSupplierInterface timeSupplier;

    public TimeHolder(TimeSupplierInterface supplier) {
        timeSupplier = supplier;
    }

    public void printTime(){
        System.out.println("POSIX: " + timeSupplier.getTime());
    }
}
