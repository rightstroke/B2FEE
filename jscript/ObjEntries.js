const mydata = {
    name1:"test1",
    age:45,
    cities:["chennai","sivakasi"],
    country:["Singapore","Australia"]
};

mydata.location = "ambattur";

console.log(mydata.location);

const res= Object.entries(mydata).length;

console.log(res);

Object.entries(mydata).map(x=>{
    //console.log(x);
})

Object.keys(mydata).map(x=>{
    //console.log(x);
    console.log(mydata[x])
})

Object.values(mydata).map(x=>{
    console.log(x);
})