import React from 'react'
import { useHistory} from 'react-router-dom';

export default function About() {

    const history = useHistory();

    const handleOnClick = ()=>{
        history.push('/home');
    }
    return (
        <div>
            <h1>I am from About Page</h1>
            <button onClick={handleOnClick}>GotoHome</button>
        </div>
    )
}
