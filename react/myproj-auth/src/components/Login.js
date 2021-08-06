import axios from 'axios';
import React,{useState,useEffect} from 'react'
import Auth from './auth';
import { useHistory} from 'react-router-dom';

export default function Login() {

    const history = useHistory();

    const [auth,setAuth] = useState({
        username:"red",
        password:"red"
    });

    const handleChange = (e) => {
        const {name,value} = e.target;

        setAuth((prev)=> {
            return {
                ...prev,
                [name]:value
            }
        })
    }


    const handleSubmit = (e) => {
        e.preventDefault();
        if (auth.username.trim() === "") {
            alert("No Username");
            return;
        }
            
        
        if (auth.password.trim() === "") {
            alert("No Password");
            return;
        }

        axios.post("http://localhost:8080/authenticate",auth).then((res)=>{
            console.log(JSON.stringify(res));
            console.log(res.data.token);
            console.log(res.data.roles);
            let authdata = new Auth(res.data.token,res.data.roles);
            //authdata = new Auth('',[]);
            console.log(JSON.stringify(auth));
            sessionStorage.setItem("auth",JSON.stringify(authdata));
            history.push('/dashboard');
        }).catch(err =>{
            console.error(err);
            history.push('/error/100');
        })
    }

    useEffect(()=>{
        sessionStorage.removeItem("auth");
    },[]);

    return (
        <div>
            <form onSubmit={handleSubmit} noValidate>
                <label>UserName</label>
                <input type="text" name="username" value={auth.username} onChange={handleChange} />
                <label>Password</label>
                <input type="password" name="password" value={auth.password} onChange={handleChange} />

                <div>
                    <button type="submit">Login</button>
                </div>
            </form>
        </div>
    )
}
