
public class Main {

    public static void main(String[] args) {

        TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
        teacherLoanManager.hesapla();

        LoanUI loanUI = new LoanUI();
        loanUI.loanCalculate(new TeacherLoanManager());
        loanUI.loanCalculate(new AgriculturalLoanManager());
        loanUI.loanCalculate(new SoldierLoanManager());
    }

}
