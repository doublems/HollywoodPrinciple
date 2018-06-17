package model;

public class Applicant {
        private String name;
        private String company;
        private int score;
        private String isHired;

        public Applicant(String name, int score){
            this.name = name;
            this.score = score;
            this.company = "";
            this.isHired ="미정";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getIsHired() {
            return isHired;
        }

        public void setIsHired(String isHired) {
            this.isHired = isHired;
        }

}
