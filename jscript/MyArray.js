let studentsnames = ["BashaBhai","PettaVelan","Muthu","Arunachalam","Muthu"];




for(let i=0;i<studentsnames.length;i++){
    //console.log(`${i} , ${studentsnames[i]}`); //ES7 Format
}


const newarray = studentsnames.map((ele,idx) => {
 
    if (idx==0) {
        return `Dr.${ele}`;
    } else {
        return ele;
    }   
}).map((x) => {
    return `${x}-San`
}).filter((x)=> {
    if (x == "Muthu-San"){
        return true;
    } else { 
        return false 
    }
})

console.log(newarray);
