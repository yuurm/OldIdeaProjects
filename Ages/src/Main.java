public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 23;
        int mishaAge = 15;

        int min = -1;
        int middle = -1;
        int max = -1;


        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            System.out.println("Vozrast Vasi minimalny");
            min = vasyaAge;
        } else if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
                System.out.println("Vozrast Vasi maximalny");
                max = vasyaAge;
            } else if (vasyaAge < katyaAge & vasyaAge > mishaAge) {
                    System.out.println("Vozrast Vasi sredny");
                    middle = vasyaAge;
                } else if (vasyaAge > katyaAge & vasyaAge < mishaAge) {
                        System.out.println("Vozrast Vasi sredny");
                        middle = vasyaAge;
                    }


                    if (katyaAge < vasyaAge && katyaAge < mishaAge) {
                        System.out.println("Vozrast Kati minimalny");
                        min = katyaAge;
                    } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
                            System.out.println("Vozrast Kati maximalny");
                            max = katyaAge;
                        } else if (katyaAge < vasyaAge & katyaAge > mishaAge) {
                                System.out.println("Vozrast Kati sredny");
                                middle = katyaAge;
                            } else if (katyaAge > vasyaAge & katyaAge < mishaAge) {
                                    System.out.println("Vozrast Kati sredny");
                                    middle = katyaAge;
                                }


                                if (mishaAge > vasyaAge && mishaAge > katyaAge) {
                                    System.out.println("Vozrast Mishi maximalny");
                                    max = mishaAge;
                                } else if (mishaAge < vasyaAge && mishaAge < katyaAge) {
                                        System.out.println("Vozrast Mishi minimalny");
                                        min = mishaAge;
                                    } else if (mishaAge < vasyaAge & mishaAge > katyaAge) {
                                            System.out.println("Vozrast Mishi sredny");
                                            middle = mishaAge;
                                        } else if (mishaAge > vasyaAge & mishaAge < katyaAge) {
                                                System.out.println("Vozrast Mishi sredny");
                                                middle = mishaAge;
                                            }

                                        }
                                    }

