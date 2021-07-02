var myname2 = "India"; //Global Scope

function doSomething(){
    var myname2 = "Chennai City"; //Function Scope
    
    if (true) {
        let myname4 = "Hyderabad City"; // BLock Scope
        var myname3 = "Banglaore City"; //Function Scope
        console.log(myname2);
        console.log(myname3);
        console.log(myname4);
    }

    {

        let myname5 = "Madurai City"; // BLock Scope
    }

    //console.log(myname4);
    console.log(myname3);
}

doSomething();

console.log("Outside====");
console.log(myname2)
   

