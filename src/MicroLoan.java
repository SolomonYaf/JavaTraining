public class MicroLoan {
    public static void main(String[] args) {
        /* saving>1/4loan || salary>70_000 birr
        &&
        6 months saving= must
        &&
        criminal record= must
         */
        int savingAmount=250_000; //float
        int salary=60_000;
        int savingMonths=6;// must save for 6months
        int loanRequest=900_000;


        boolean savingProportion=savingAmount>=0.25*loanRequest;  // Either savingAmount should be >1/4 of loanRequest
        // OR salaryRange should be >70k!
        boolean salaryRange=salary>70_000;
        boolean savingDuration=savingMonths>=6; // must save for 6months
        boolean freeFromCriminalRecord=true;  // must be free from criminal record

        System.out.println((savingDuration && freeFromCriminalRecord ) && (salaryRange || savingProportion));
    }
}
