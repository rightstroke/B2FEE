import React,{useState,useEffect} from 'react'

export default function UnStableCounter2() {

    const [counter,setCounter] = useState(0);

    const handleButtonClick = () =>{
        setCounter(prev=>prev+1);
    }

    useEffect(()=>{
        if (counter==2){
            //history.pushState("/error?details=LIMIT_EXE")
            throw new Error("Limit Exceeded, Unable to proceed further");
        }

    },[counter])

    return (
        <div>
            <h1>{counter}</h1>
            <button onClick={handleButtonClick}>{counter}</button>
        </div>
    )
}
