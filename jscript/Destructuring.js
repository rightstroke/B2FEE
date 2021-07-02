let x,y,z;

let data = [10,20,30,50,60,70,90,100];

let myStudent = [
    {id:1,name:"Test1",email:"a@google.com"},
    {id:2,name:"Test2",email:"b@google.com"}
];


///...Spread Operator
[x,y,z] = data;

console.log(x);
console.log(y);   
console.log(z);

let a,b;

[a,b] = myStudent;
console.log(typeof(a));
console.log(a);