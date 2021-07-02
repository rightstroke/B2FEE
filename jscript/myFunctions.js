function temperatureConv(val) {
    return (val-32)*(5/9);
}

console.log(temperatureConv(45));

const myTempFn = function(val) {
    return (val-32)*(5/9);
}

//Arrow Function
const myTempFn2 = (val) => {
    return (val-32)*(5/9);
}

const myTempFn3 = val => (val-32)*(5/9); //A12323

const myTempFn31 = (val,factor) => (val-32)*(5/9)*factor; //A12323

const fn = myTempFn3;

fn(300);   

let myTempFn4 = () => myTempFn(45);

myTempFn4 = () => "Kotammpatti City";


console.log(myTempFn3(58));

console.log(myTempFn4());

//A12323
const myHOCFn = (data,fn) => {
    let val = data * 3; 
    console.log(val); //300
    return fn(val);
}

const myHOCFn2 = (x) => myHOCFn(x,(x)=>y/2);

//hIGHER ORDER fUNCTION
//let res = myHOCFn(100,myTempFn3);
//console.log(res);


const xyz = (x) => { 
    console.log("==Value of X is..."  +x); 
    return x*3;
};

let res3 = myHOCFn(100,xyz)
       
console.log(res3);
