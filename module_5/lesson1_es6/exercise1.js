// Yêu cầu 1
let checkPrimeNumber = (number) => {
    if (number < 2) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
console.log(checkPrimeNumber(20));

// Yêu cầu 2
let arrNum = [1, 12, 23, 54, 66, 42];
let newArr = arrNum.filter((num) => checkPrimeNumber(num));
console.log(newArr);