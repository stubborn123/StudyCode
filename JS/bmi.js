var height = parseFloat(prompt('请输入身高(m):'));
var weight = parseFloat(prompt('请输入体重(kg):'));
const BMI_RANK = {
  OVERFAT : 32,
  FAT : 28,
  NORMAL : 25,
  THIN : 18.5
};
var bmi = weight / height**2;

var bmiRank = {rank:''};
if ( bmi >= BMI_RANK.OVERFAT) {
  bmiRank.rank = '严重肥胖';
} else if (bmi >= BMI_RANK.FAT) {
  bmiRank.rank = '肥胖';
} else if (bmi >= BMI_RANK.NORMAL) {
  bmiRank.rank = '过重';
} else if (bmi >= BMI_RANK.THIN) {
  bmiRank.rank = '正常';
} else {
  bmiRank.rank = '过轻';
}

console.log(`BMI数值为：${bmi.toFixed(2)}，${bmiRank.rank}`);