const sv1 = {
    name: 'John',
    gender: 'male',
    degree: 'Bachelor',
    english: 'English'
}
const sv2 = {
    firstName: 'John',
    gender: 'male',
    degree: 'wewew',
    english: 'English'
}
let {firstName = "Quân",degree = "NA"} = sv1;
let getInfo = (infoStudent)=>{
    let student = {firstName,degree};
    console.log(student);
}
getInfo(sv1);
getInfo(sv2);