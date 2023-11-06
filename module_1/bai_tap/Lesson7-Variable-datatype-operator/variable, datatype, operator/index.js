function bai1() {
    let physics = +prompt("Please enter your mark Physics");
    while (!(physics >= 0 && physics <= 10)) {
        alert("Your mark cannot be less than 0 and greater than 10");
        physics = +prompt("Please enter again your mark Physics");
    }
    let chemistry = +prompt("Please enter your mark Chemistry");
    while (!(chemistry >= 0 && chemistry <= 10)) {
        alert("Your mark cannot be less than 0 and greater than 10");
        chemistry = +prompt("Please enter again your mark Physics");
    }
    let biology = +prompt("Please enter your mark Biology");
    while (!(biology >= 0 && biology <= 10)) {
        alert("Your mark cannot be less than 0 and greater than 10");
        biology = +prompt("Please enter again your mark Physics");
    }
    let sum = physics + chemistry + biology;
    let average = sum/3
    alert("SUM = " + sum);
    alert("Average = " + average);
}
// bai1()

function bai2() {
let celsius = +prompt("Please enter celsius");
let fahrenheit = (9 * celsius / 5) + 32;
alert("Fahrenheit = " + fahrenheit);
}
// bai2()

function bai3() {
    let radius = +prompt("Please enter radius");
    const PI = 3.14;
    let area = Math.pow(radius,2)* PI;
    alert("Circle area is " + area);
}
// bai3();

function bai4() {
    let radius = +prompt("Please enter radius");
    const PI = 3.14;
    let curcumference = 2 * radius * PI;
    alert("Circle area is " + curcumference);
}
bai4();