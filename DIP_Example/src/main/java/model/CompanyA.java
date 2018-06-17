package model;

public class CompanyA implements HiringProcess {
    @Override
    public Applicant getResult(Applicant applicant) {
        applicant.setName(("지원번호 000123/"+applicant.getName()));
        int companyScore = (applicant.getScore() * 10);
        if(companyScore >99){
            applicant.setIsHired("합격");
        }else {
            applicant.setIsHired("불합격");
        }
        return applicant;
    }
}
