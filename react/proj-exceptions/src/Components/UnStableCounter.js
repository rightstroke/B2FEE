import React,{useState,useEffect} from 'react'

export default function UnStableCounter() {

    const [counter,setCounter] = useState(0);

    const handleButtonClick = () =>{
        setCounter(prev=>prev+1);
    }

    useEffect(()=>{
        if (counter==5){
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
