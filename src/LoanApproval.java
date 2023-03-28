public class LoanApproval {
    public static void main(String[] args){

        int saving=500_001;
        int creditScore=8;

        boolean noCriminalRecord=true;
        boolean batteryFullyCharge=true;
        boolean enoughSaving= saving>500_000;
        boolean goodScore=creditScore>7;

        System.out.println((enoughSaving || goodScore || batteryFullyCharge) && noCriminalRecord );
    }
}
