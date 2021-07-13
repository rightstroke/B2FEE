import React,{useState,useEffect} from 'react'

export default function SessionStorageIncrement(key,defaultValue) {
    //init
    const [data,setData] = useState(()=>{
        let val = 0;

        try {
            val = window.sessionStorage.getItem(key) || String(defaultValue);
            console.log("[SessionStorageIncrement] - " + val);
        }catch(e){
            val = 0;
        }

        return parseInt(val);
    });

    //store
    useEffect(() => {
        window.sessionStorage.setItem(key,data);
    }, [data])

    return [data,setData];
}
