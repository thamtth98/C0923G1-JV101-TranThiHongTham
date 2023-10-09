function calculate() {
    let bill = document.getElementById("bill").value;
    let service = document.getElementById("service").value;
    let people = document.getElementById("people").value;
    let result;
    switch (service) {
        case "30% - Outstanding":
            result = bill * 0.3 / people
            break;
        case "20% - Good" :
            result = bill * 0.2 / people
            break;
        case "15% - It was OK" :
            result = bill * 0.15 / people
            break;
        case "10% - Bad" :
            result = bill * 0.1 / people
            break;
        case "5% - Terrible" :
            result = bill * 0.05 / people
            break;
    }
    console.log(result)
    document.getElementById("result").innerHTML += result
}

