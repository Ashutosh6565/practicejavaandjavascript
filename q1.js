var n = prompt("enter the number of elements")
var n = parseInt(n);
function isPrime(n){
    if (n<=1) return false;
    if(n==2) return true;
    if(n%2 == 0) return false;
    for(let i =3; i<=Math.floor(Math.sqrt(n)); i+=2){
        if(n%i == 0) return false;
    }
    return true;    
}
if(isNaN(n)){
    console.log("Please enter a valid number");
}else{
    if(n>0){
        console.log(`it is prime ${isPrime(n)}`);
    }else{
        console.log("Please enter a positive number");
    }
}