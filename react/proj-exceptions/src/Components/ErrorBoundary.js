import React, { Component } from 'react'
import './ErrorBoundary.css';


export default class ErrorBoundary extends Component {

    state = {
        error:null
    }

    componentDidCatch(error,info){
        console.log("In Component did catch method");
        console.warn(error);
        console.error(info);
    }

    static getDerivedStateFromError(error){
        // this.setState({
        //     myerror:error
        // })    
        return {error:error};
    }


    render() {
        
        if (this.state.error){
            return <p className="err">Something broke - {this.state.error.toString()}</p>;
        } 

        return this.props.children;  
    }
}
