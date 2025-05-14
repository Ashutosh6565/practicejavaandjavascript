// var n = prompt("enter the number of elements")
// var n = parseInt(n);
// function isPrime(n){
//     if (n<=1) return false;
//     if(n==2) return true;
//     if(n%2 == 0) return false;
//     for(let i =3; i<=Math.floor(Math.sqrt(n)); i+=2){
//         if(n%i == 0) return false;
//     }
//     return true;    
// }
// if(isNaN(n)){
//     console.log("Please enter a valid number");
// }else{
//     if(n>0){
//         console.log(`it is prime ${isPrime(n)}`);
//     }else{
//         console.log("Please enter a positive number");
//     }
// }


var n = prompt("enter the number of elements");
var n = parseInt(n);

// function addNmbers(n){
//     var sum  = 0;
//     while(n> 0){
//         var rem = n % 10;;
//          sum += rem;
//         n = Math.floor(n/10);
//         console.log(sum);
//     }
//     console.log(sum);
// }

// addNmbers(n);


if(isNaN(n)){
    console.log("Please enter a valid number");
}else{
    if(n>0){
        var d = 0;
        while(n>0){
            var rem = n % 10;
            d = d*10 + rem;
            n = Math.floor(n/10);
        }
        console.log("The sum of digits is " + d);   
    }else{
        console.log("Please enter a positive number");
    }
}