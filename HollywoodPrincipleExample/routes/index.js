var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  var applicant = {name: 'Jerry Ahn', score: 10, company:'',isHired:''};
  var result = getResult(applicant,CompanyA);
  res.render('index', { result:result});
});

//회사채용후 결과를 얻는 함수 //시키는데로 반응하겠다. 헐리우드 원칙 적용
//name: 'Jerry Ahn', score: 10, company:'',isHired:''
function getResult(applicant,callback){
    //!!!!!!!!~~~~~~~~~~~~~~12313213 규칙을 지키지 않는 놈들을 변환기
    return callback(applicant);
};

//A기업
function CompanyA(applicant){
    applicant.name = ("지원번호 000123/"+applicant.name);
    applicant.company = 'A기업';
    var companyScore = (applicant.score * 10);
    if(companyScore >99){
        applicant.isHired ="합격";
    }else {
        applicant.isHired = "불합격";
    }
    return applicant;
}

//B기업
function CompanyB(applicant){
    applicant.company = 'B기업';
    var companyScore = (applicant.score * 5);
    if(companyScore >60){
        applicant.isHired ="합격";
    }else {
        applicant.isHired = "불합격";
    }
    return applicant;
}

module.exports = router;
