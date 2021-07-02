const names = ["Name1","Name2","Name3"];


const cities = ["Chennai","Bangalore","Sivakasi",names];

const newCities = ["Chennai","Bangalore","Sivakasi",...names];

console.log(names);
console.log(cities);
console.log(newCities);


function addData(...data){
    let c = 0 ;
    for(let i = 0;i<data.length;i++){
        c=c+data[i];
    }
    return c;
}

console.log(addData(10,20,30,40,60,70));

const person = {
    name : "name1",  
    email : "name1@gmail.com"
}

const person2 = {
    name : "name2",
    email : "name2@gmail.com"
}

const person3 = {
    name : "SuperStar"
    
}

let studentsnew = [
    {name:"Name2",age:100},
    {name:"Name3",age:100}
];

//Patch Updatwe

const items = {
    cost:100,
    ...person,
    ...studentsnew,
    ...person2,
    ...person3
}

items.cost = 123;

console.log(items);