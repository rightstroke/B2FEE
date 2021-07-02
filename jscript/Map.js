let mymap = new Map();

let key1 = {a:1};
let key2 = {b:1};
let key3 = "key4";
let key4 = "k7";

mymap.set(key1,"Some Data");
mymap.set(key2,"Some Othjer Data");
mymap.set(key3,"Some Othjer Data2");
mymap.set(key4,"Some Othjer Data22");




key1 = null;

function printdata(x,yh6) {
    console.log(x + "," + yh6);  
}

//mymap.forEach(printdata);



mymap.forEach((key,value)=>{
  console.log("####==" + key + "," + value);
});
console.log("=================================");

var wkmap = new WeakMap();

let val10 = {value:"Some Data",name:"test"};
let key10 = {key:1};

let val11 = {value:"Some Data11",name:"test11"};
let key11 = {key:11};


wkmap.set(key10,val10);
wkmap.set(key11,val11);

key10 = null;

console.log(wkmap.get(key10));
console.log(wkmap.get(key11));