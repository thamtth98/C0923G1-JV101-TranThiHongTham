const sv1 = {
    name: 'John',
    gender: 'male',
    degree: 'Bachelor',
    english: 'English'
}
const sv2 = {
    firstName: 'John',
    gender: 'male',
    degree: 'Bachelor',
    english: 'English'
}
let {firstName = "Quân",degree} = sv1;
let getInfo = (infoStudent)=>{
    let student = {firstName ,degree};
    console.log(student);
}
getInfo(sv1);
getInfo(sv2);