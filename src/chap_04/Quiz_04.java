package chap_04;

public class Quiz_04 {
    public static void main(String[] args) {
        //parking fee 4000 per hour
        //small and abnormal is 50% off to final fee
        //normal car(1), small car(2), abnormal car(3)

        int parkingFee = 4000;
        int parkingFeeMAx = 30000;

        int car = 3;
        int hour = 10;
        int fee = parkingFee * hour;

        if (fee < parkingFeeMAx) {
            if (car == 1){
                System.out.println("Parking Fee : " + fee);
            }
            else {
                System.out.println("Parking Fee : " + fee / 2);
            }
        }
        else {
            if (car == 1){
                System.out.println("Parking Fee : " + parkingFeeMAx);
            }
            else {
                System.out.println("Parking Fee : " + parkingFeeMAx / 2);
            }
        }

        /*
        int hour = 5;
        boolean isSmallCar = false;
        boolean isAbnormalCar = false;

        int fee = hour * 4000;

        if (fee >30000){
            fee = 30000;
        }

        if (isSmallCar || isAbnormalCar){
            fee /= 2;
        }

        System.out.println("Parking Fee : " + fee);
         */
    }
}