const prompt = require('prompt-sync')();
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


// if(isNaN(n)){
//     console.log("Please enter a valid number");
// }else{
//     if(n>0){
//         var d = 0;
//         while(n>0){
//             var rem = n % 10;
//             d = d*10 + rem;
//             n = Math.floor(n/10);
//         }
//         console.log("The sum of digits is " + d);   
//     }else{
//         console.log("Please enter a positive number");
//     }
// }

//check the strong numbers 

// var copy = n;
// var sum = 0;
//  while(n>0){
//     var rem = n% 10;
//     var fact = 1;
//     for(let i = 1;i<=rem;i++){
//         fact*= i;
//     }
//     sum += fact;
//     n =Math.floor(n/10);
// }
// if(sum == copy){
//     console.log("it is a strong number");
// }
// else{
//     console.log("it is not a strong number");
// }
// var random  = Math.random()*100 + 1;
// random = Math.floor(random);

// while(n !== random){
// if(isNaN(n) || n < 0 || n > 1000000){
//     console.log("Please enter a valid number");
//         continue;
// }
// if(n > random){
//     console.log("The number is too high");
// }else if(n < random){
//     console.log("The number is too low");
// }else{
//     console.log("Congratulations! You guessed the number!");
//     break;
//     }
// }


var n = prompt("enter the number of elements");
var n = parseInt(n);

// for(let i = 0;i<=n;i++){
//     for(let j = 0;j<=i;j++){
//         // console.log('*');
//         process.stdout.write("*")
//     }
//     console.log(" ")
// }

// for(let i = 0;i <=n;i++){
//     for(let j = 0;j<=i;j++){
//         process.stdout.write(`${j}`);
//     }
//     console.log();
// }

if((n % 4 == 0 && n%100 != 0) || n%400 == 0){
    process.stdout.write("it is a leap year");
}else{
    process.stdout.write("it is not a leap year")
}