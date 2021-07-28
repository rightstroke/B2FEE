import axios from 'axios';
import React,{useState,useEffect} from 'react'
import { useHistory} from 'react-router-dom';

export default function Dashboard() {

    const [country,setCountry] = useState();
    const history = useHistory();

    useEffect(()=>{

        let authdata = JSON.parse(sessionStorage.getItem("auth")) || '';
        console.log("=================");
        //console.log(authdata.token);
        
        const data = {};
        const headers = { 
            'Authorization': 'Bearer ' + authdata.token
        };

        axios.get("http://localhost:8080/countries",{ headers }).then((x)=>{
            console.log(JSON.stringify(x));
            setCountry(x.data);
        }).catch(err=>{
            console.error(err);
            history.push("/error/200");
        })
    },[])


    return (
        <div>
            <h1>Dashboard</h1>
            {country && country.map((x,idx)=>{
                return <h4 key={idx}>{x.id} - {x.name}</h4>;
            })}
        </div>
    )
}
